package at.jku.mosumo.generator.framework.middleware;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;
import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.fasterxml.jackson.databind.ObjectMapper;

import Monitoring.DerivedProperty;
import Monitoring.MOAgent;
import Monitoring.MOConfig;
import Monitoring.MOElement;
import Monitoring.MOProperty;
import at.jku.mosumo.generator.framework.core.AbstractJavaSource;
import at.jku.mosumo.generator.framework.core.FileSourceCommand;
import at.jku.mosumo.generator.framework.util.MonitoringGeneratorUtils;
import at.jku.se.mosumo.monitoring.util.ManagedHashTableList;
import at.jku.se.mosumo.tools.logging.ILogger;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import mqtt.MQTTPublisher;
import mqtt.MQTTSubscriber;
import mqtt.PublishException;
import validation.IViolation;

public class UIBridge extends AbstractJavaSource implements FileSourceCommand {

	public static final String CLASS_NAME = "UIBridge";

	public UIBridge(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		super(packageFragmentRoot, moConfig, monitor);

	}

	@Override
	public void createFileSource() {
		JavaClassSource javaClass = Roaster.create(JavaClassSource.class);
		javaClass.setPackage(MonitoringGeneratorUtils.UI_PACKAGE).setName(CLASS_NAME);
		addFields(javaClass);

		addMainMethod(javaClass);
		addConnectMethod(javaClass);
		addRegisterMethod(javaClass);
		addUpdateElementMethod(javaClass);
		setId(javaClass);
		announceSystem(javaClass);
		registerElement(javaClass);

		createCompilationUnit(getPackageFragmentRoot(), MonitoringGeneratorUtils.UI_PACKAGE, CLASS_NAME + ".java",
				javaClass.toString(), getMonitor());

	}

	private void registerElement(JavaClassSource javaClass) {
		MethodSource<JavaClassSource> getInstanceMethod = javaClass.addMethod().setStatic(true)
				.setName("registerElement");
		getInstanceMethod.addParameter(String.class, "id");
		//String agent = getMoConfig().getSystem().getAgents().get(0).getName();
		
		String qualName = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(),  getMoConfig().getSystem().getAgents().get(0));
		
		String type = getMoConfig().getSystem().getEClass().getName();
		String bodyStr = "try {\n" + "			RegisterElem elem = new RegisterElem(id, \"" + qualName + "\", \"" + type
				+ "\", prefix + \"/\" + id);\n"
				+ "			String jsonResult = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(elem);\n"
				+ "			registered.add(elem);\n" + "\n"
				+ "			MQTTPublisher.getInstance().publish(\"register\", jsonResult);\n"
				+ "		} catch (Exception e) {\n" + "			LOGGER.error(e);\n" + "		}	";

		getInstanceMethod.setBody(bodyStr);

	}

	private void addUpdateElementMethod(JavaClassSource javaClass) {
		MethodSource<JavaClassSource> getInstanceMethod = javaClass.addMethod().setStatic(true)
				.setName("updateElement");
		getInstanceMethod.addParameter(Object.class, "e");
		String bodyStr = "	try {\n"
				+ "			String jsonResult = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);\n"
				+" String elemName = e.getClass().getInterfaces()[0].getSimpleName();\n"
				+ "			String agentid = getId(jsonResult);\n" + "\n" + "			MQTTPublisher.getInstance()\n"
				+ "					.publish(prefix + \"/\" + agentid + \"/\" + elemName, jsonResult);\n"
				+ "		} catch (Exception ex) {\n" + "			LOGGER.error(ex);\n" + "		}";

		getInstanceMethod.setBody(bodyStr);

	}

	private void addMainMethod(JavaClassSource javaClass) {
		MethodSource<JavaClassSource> getInstanceMethod = javaClass.addMethod().setStatic(true).setName("main")
				.setParameters("String [] args").setStatic(true).setPublic();
		String bodyStr = "try{\n" + "MonitoringMiddleware.getInstance().init();" + "connect();\r" + "register();\r"
				+ "announceSystem();\r" + "}catch(Exception e){\r" + "LOGGER.error(e);\n" + "}";

		getInstanceMethod.setBody(bodyStr);

	}

	private void announceSystem(JavaClassSource javaClass) {
		MethodSource<JavaClassSource> getInstanceMethod = javaClass.addMethod().setStatic(true)
				.setName("announceSystem").setStatic(true).setPublic();

		String type = getMoConfig().getSystem().getEClass().getName();
		String bodyStr = "	RegisterElem elem = new RegisterElem(\"" + type + "\", \"" + type + "\", \"\", \" " + type
				+ "\");\n" + "			prefix = \"" + type + "\";\n" + "			parent = \"" + type + "\";\n"
				+ "			elem.setHeartbeat(999999);\n" + "		String jsonResult;\n" + "		try {\n"
				+ "			jsonResult = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(elem);\n"
				+ "			MQTTPublisher.getInstance().publish(\"register\", jsonResult);\n"
				+ "			registered.add(elem);\n" + "		} catch (Exception ex) {\n"
				+ "			LOGGER.error(ex);\n" + "		}";
		getInstanceMethod.setBody(bodyStr);

	}

	private void setId(JavaClassSource javaClass) {
		MethodSource<JavaClassSource> getInstanceMethod = javaClass.addMethod().setStatic(true).setName("getId")
				.setReturnType("String");
		getInstanceMethod.addParameter(String.class, "jsonResult");
		String bodyStr = "	final Pattern pattern = Pattern.compile(regex);\n"
				+ "	final Matcher matcher = pattern.matcher(jsonResult);\n" + "	if (matcher.find()) {\n"
				+ "		for (int i = 1; i <= matcher.groupCount(); i++) {\n"
				+ "			return matcher.group(i).trim();\n" + "		}\n" + "	}\n" + "	return \"\";";

		getInstanceMethod.setBody(bodyStr);

	}

	private void addConnectMethod(JavaClassSource javaClass) {
		MethodSource<JavaClassSource> getInstanceMethod = javaClass.addMethod().setStatic(true).setName("connect")
				.addThrows(Exception.class);
		String bodyStr = "MQTTSubscriber c = new MQTTSubscriber(BrokerConfig.URL);\n"
				+ "			c.connect((t, m) -> {\n" + "				if (t.equals(\"requestregistered\")) {\n"
				+ "					try {\n"
				+ "						String jsonResult = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(registered);\n"
				+ "						MQTTPublisher.getInstance().publish(\"getregistered\", jsonResult);\n"
				+ "					} catch (Exception e) {\n" + "						LOGGER.error(e);\n"
				+ "					}\n" + "				}\n" + "			});\n"
				+ "			c.subscribe(\"requestregistered\");";

		getInstanceMethod.setBody(bodyStr);

	}

	private void addRegisterMethod(JavaClassSource javaClass) {
		MethodSource<JavaClassSource> getInstanceMethod = javaClass.addMethod().setStatic(true).setName("register");
		StringBuilder bodyStr = new StringBuilder();

		for (MOAgent ag : getMoConfig().getSystem().getAgents()) {
			String qualName = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(),  ag);
			bodyStr.append("MonitoringMiddleware.getInstance().register" + ag.getEClass().getName() + "Registered(e -> {\n"
					+ "			registerElement(((" + qualName + ")e).getId());\n"
					+ "		});");

			for (MOElement elem : ag.getElements()) {
			
				bodyStr.append("MonitoringMiddleware.getInstance().register" + ((MOProperty) elem).getEClass().getName() + "StateChange(e -> {\n"
						+ "			updateElement(e);\n" + "		});");
			}
			for (DerivedProperty elem : ag.getDerivedproperties()) {
				bodyStr.append("MonitoringMiddleware.getInstance().register" + elem.getEClass().getName() + "StateChange(e -> {\n"
						+ "			updateElement(e);\n" + "		});");
			}
		}
		getInstanceMethod.setBody(bodyStr.toString());

	}

	private void addFields(JavaClassSource javaClass) {
		javaClass.addImport("api.MessageFactory");
		javaClass.addImport("api.BrokerConfig");
		javaClass.addImport("middleware.MonitoringMiddleware");
		javaClass.addImport(MQTTPublisher.class);
		javaClass.addImport(ManagedHashTableList.class);
		javaClass.addImport(MQTTSubscriber.class);
		javaClass.addImport(PublishException.class);
		javaClass.addImport(LoggerProvider.class);
		javaClass.addImport(ILogger.class);
		javaClass.addImport(MqttSecurityException.class);
		javaClass.addImport(IViolation.class);
		javaClass.addImport(List.class);
		javaClass.addImport(ArrayList.class);
		javaClass.addImport(ObjectMapper.class);
		javaClass.addImport(Pattern.class);
		javaClass.addImport(Matcher.class);

		for (MOAgent ag : getMoConfig().getSystem().getAgents()) {
			javaClass.addImport(ag.getEClass().getName());
		}

		javaClass.addField().setName("LOGGER").setType("ILogger")
				.setLiteralInitializer("LoggerProvider.getLogger(" + javaClass.getName() + ".class)").setPrivate()
				.setStatic(true).setFinal(true);
		javaClass.addField().setStatic(true).setName("prefix").setType("String");
		javaClass.addField().setStatic(true).setName("parent").setType("String");
		javaClass.addField().setName("regex").setType("String").setFinal(true).setStatic(true)
				.setStringInitializer("\"id\"\\s?:\\s?\"(.*?)\"");

		javaClass.addField().setName("mapper").setStatic(true).setType("ObjectMapper")
				.setLiteralInitializer("new ObjectMapper()").setPrivate().setFinal(true);

		javaClass.addField().setName("registered").setStatic(true).setType("List<RegisterElem> ")
				.setLiteralInitializer("new ArrayList<>()").setPrivate().setFinal(true);

	}

}
