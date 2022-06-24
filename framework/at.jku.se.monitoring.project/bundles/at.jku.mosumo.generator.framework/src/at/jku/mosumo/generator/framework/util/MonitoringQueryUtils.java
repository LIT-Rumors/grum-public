package at.jku.mosumo.generator.framework.util;

import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import Monitoring.MOConfig;
import Monitoring.MOProperty;

public final class MonitoringQueryUtils {
	
	private MonitoringQueryUtils() {
		throw new AssertionError("This class cannot be inherited");
	}
	
	public static EList<MOProperty> getAllMOElements(MOConfig moConfig) {		
		return moConfig.getSystem().getAgents().stream()
				.map(agent -> agent.getElements())
				.flatMap(EList::stream)
				.filter(MOProperty.class::isInstance)
				.map(MOProperty.class::cast)
				.collect(Collectors.toCollection(BasicEList::new))
				;		
	}	
}
