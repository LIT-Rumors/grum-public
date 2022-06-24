package at.jku.lit.grum.extensions.esper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Timer;
import java.util.stream.Stream;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;

import at.jku.lit.grum.dronology.model.dronology.impl.DronestateImpl;
import at.jku.lit.grum.dronology.model.dronology.impl.FlightPlanImpl;
import at.jku.lit.grum.dronology.model.dronology.impl.OperationmodeImpl;
import at.jku.lit.grum.dronology.model.dronology.impl.SystemhealthImpl;
import at.jku.se.mosumo.tools.logging.ILogger;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import validation.IConstraint;
import validation.ValidationFactory;

public class EsperManager {

	private EPRuntime cepRT;
	private EPAdministrator cepAdm;
	private Timer timer = new Timer(true);
	private static final ILogger LOGGER = LoggerProvider.getLogger(EsperManager.class);

	private static final String CONSTRAINT_STORAGE_LOCATION = "src/main/resources/constraints";

	public void update(Object event) {
		cepRT.sendEvent(event);
	}

	public void init() {
		// BasicConfigurator.configure();
		LOGGER.info("Initializing Esper Manager");
		Configuration cepConfig = new Configuration();
		cepConfig.addEventType("DroneState", DronestateImpl.class);
		cepConfig.addEventType("FlightPlan", FlightPlanImpl.class);
		cepConfig.addEventType("SystemHealth", SystemhealthImpl.class);
		cepConfig.addEventType("OperationMode", OperationmodeImpl.class);
		// cepConfig.addEventType(HeartBeat.class);

		EPServiceProvider cep = EPServiceProviderManager.getProvider("CEP-Engine", cepConfig);
		cepRT = cep.getEPRuntime();
		cepAdm = cep.getEPAdministrator();
		try {
			readConstraints();
		} catch (Exception e) {
			LOGGER.error(e);
		}

	}

	private void readConstraints() throws IOException {
		Stream<Path> path = Files.walk(Paths.get(CONSTRAINT_STORAGE_LOCATION));
		path = path.filter(Files::isRegularFile);
		path.forEach(p -> {
			try {
				loadConstraint(p);
			} catch (Throwable e) {
				LOGGER.error(p.toString() + " not loaded");
			}
		});

	}

	private void loadConstraint(Path p) throws IOException {
		List<String> lines = Files.readAllLines(p);
		IConstraint constraint = readConstraint(p, lines);

		registerConstraint(constraint);

	}

	private IConstraint readConstraint(Path p, List<String> lines) {
		String name = lines.get(0).replace("NAME=", "");

		int i = 1;
		String s = lines.get(i);
		StringBuilder code = new StringBuilder();

		while (!s.equals(";")) {
			code.append(s + "\n");
			i++;
			s = lines.get(i);
		}

		return ValidationFactory.createConstraint(p.getFileName().toString(), name,
				code.toString().replace("CONSTRAINT=", ""));
	}

	public void registerConstraint(IConstraint constraint) {
		try {
			LOGGER.info("Registering new Statement " + constraint);
			System.out.println("Registering new Statement " + constraint);
			EPStatement statemet = cepAdm.createEPL(constraint.getCode());
			statemet.addListener(new CEPStatementListener(constraint));

//			if (constraint.getName().equals("stabil")){
//				statemet.addListener(new GPSHealthSetter());
//			}

		} catch (Exception e) {
			LOGGER.error("Error" + constraint.getFile());
			LOGGER.error(e);
		}
	}

}
