package at.jku.mosumo.generator.api.java.menu;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import Monitoring.MOConfig;
import at.jku.mosumo.generator.framework.util.MonitoringGeneratorUtils;

public class MosumoMenu implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// Do nothing
	}

	@Override
	public void dispose() {
		// Do nothing
	}

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
			// get the current project
			IProject srcProject = monitoringFile.getProject();
			// Load Resource
			final var monitoringResource = MonitoringGeneratorUtils.loadMonitoringResource(monitoringFile);
			final var moConfig = MonitoringGeneratorUtils.getMOConfig(monitoringResource);

			generateCode(srcProject, moConfig);

		}
		return null;
	}

	private void generateCode(IProject srcProject, MOConfig moConfig) {

		CodeGeneratorExecutor.generate(srcProject,moConfig);

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
		// Do nothing
	}

}
