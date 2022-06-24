package twin;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.eclipse.emf.ecore.EPackage;
import java.util.*;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import at.jku.se.mosumo.tools.logging.ILogger;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import query.DroneSystemViatraQueryExecutor;
import at.jku.lit.grum.dronology.model.dronology.DronologyPackage;
import at.jku.lit.grum.dronology.model.dronology.DronologyFactory;
import at.jku.lit.grum.dronology.model.dronology.Drone;
import at.jku.lit.grum.dronology.model.dronology.DroneSystem;
import api.*;

public class TwinManager {

	volatile static TwinManager INSTANCE;
	private static final ILogger LOGGER = LoggerProvider.getLogger(TwinManager.class);
	DroneSystem container;
	ViatraQueryEngine engine;
	Map instances;

	static public TwinManager getInstance() {
		if (INSTANCE == null) {
			synchronized (TwinManager.class) {
				if (INSTANCE == null) {
					INSTANCE = new TwinManager();
				}
			}
		}
		return INSTANCE;
	}

	public void initialize() {
		container = DronologyFactory.eINSTANCE.createDroneSystem();
		EPackage.Registry.INSTANCE.put(DronologyPackage.eINSTANCE.getNsURI(), DronologyPackage.eINSTANCE);
		instances = new HashMap<>();
		EMFScope scope = new EMFScope(this.container);
		this.engine = prepareQueryEngine(scope);
		registerListener();
	}

	private void registerListener() {
		container.eAdapters().add(new MiddlewareForwardingAdapter(null));
	}

	private ViatraQueryEngine prepareQueryEngine(EMFScope scope) {
		ViatraQueryEngine engine = ViatraQueryEngine.on(scope);
		DroneSystemViatraQueryExecutor.initialize(engine);
		return engine;
	}

	public void process(java.lang.String topic, java.lang.String message) {
		try {
			MessageHandler.process(topic, message);
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getStackTrace(e));
		}
	}

	public Drone get(java.lang.String id) {
		return (Drone) instances.get(id);
	}

	public void register(java.lang.String id, Drone elem) {
		instances.put(elem.getId(), elem);
		container.getDrones().add(elem);
		elem.eAdapters().add(new MiddlewareForwardingAdapter(elem.getId()));
	}

	public void checkConstraints(Object... elems) {
		DroneSystemViatraQueryExecutor.executeQueries(elems);
	}
}