package at.jku.se.mosumo.generator.api.ros.menu;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import Monitoring.MOConfig;
import at.jku.mosumo.generator.framework.projects.BuilderProject;
import at.jku.mosumo.generator.framework.util.MonitoringGeneratorUtils;
import at.jku.se.mosumo.generator.api.ros.generator.GenerateROSAPICode;

public class ROSMosumoMenu implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// nothing to do here
	}

	@Override
	public void dispose() {
		// nothing to do here
	}

	/***
	 * Gets called when clicking the Menu-Button for generating the ROS python API
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// get workbench window
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		// set selection service
		ISelectionService service = window.getSelectionService();
		// set structured selection
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
		// check if it is an IFile
		if (structured.getFirstElement() instanceof IFile) {
			// get the selected file
			IFile monitoringFile = (IFile) structured.getFirstElement();
			// Load Resource
			final var monitoringResource = MonitoringGeneratorUtils.loadMonitoringResource(monitoringFile);
			final var moConfig = MonitoringGeneratorUtils.getMOConfig(monitoringResource);

			generateApiProject(moConfig);
		}
		return null;
	}

	private void generateApiProject(MOConfig moConfig) {
		final var apiProject = new BuilderProject(moConfig.getProjectName() + ".ros.api").setPlugin(true).build();
		apiProject.createProject(new NullProgressMonitor(),true);
		final var packageRoot = apiProject.getJavaPro()
				.getPackageFragmentRoot(apiProject.getMapOfFolders().get(MonitoringGeneratorUtils.SOURCE_FOLDER));

		new GenerateROSAPICode(packageRoot, moConfig, new NullProgressMonitor()).generateAll();
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// nothing to do here
	}

}
