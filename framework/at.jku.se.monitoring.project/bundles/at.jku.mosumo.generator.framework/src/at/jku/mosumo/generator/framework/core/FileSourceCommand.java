package at.jku.mosumo.generator.framework.core;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.ui.dialogs.IOverwriteQuery;

public interface FileSourceCommand {

	public void createFileSource();

	public default void createFileSource(boolean overwrite) {
		createFileSource();
	}

	default IPackageFragment getPackageFragment(final IPackageFragmentRoot packageFragmentRoot,
			final String packageName, final IProgressMonitor monitor) {
		final IPackageFragment packageFragment = packageFragmentRoot.getPackageFragment(packageName);
		if (!packageFragment.exists()) {
			try {
				packageFragmentRoot.createPackageFragment(packageName, true, monitor);
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
		}
		return packageFragment;
	}

	default void createCompilationUnit(final IPackageFragmentRoot packageFragmentRoot, final String packageName,
			final String name, String content, final IProgressMonitor monitor) {
		IPackageFragment fragment = getPackageFragment(packageFragmentRoot, packageName, monitor);
		try {
			fragment.createCompilationUnit(name, content, true, new NullProgressMonitor());
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
	}

	default IFolder createFolder(IFolder folder, boolean force, boolean local, IProgressMonitor monitor)
			throws CoreException {
		if (!folder.exists()) {
			IContainer parent = folder.getParent();
			if (parent instanceof IFolder) {// TODO It could be parent.exist
				createFolder((IFolder) parent, force, local, null);
			}
			folder.create(force, local, monitor);
		}
		return folder;
	}

	/***
	 * Write a new file.
	 * 
	 * @param container where the file is put; e.g.
	 *                  <code>getPackageFragmentRoot().getJavaProject().getProject()</code>
	 * @param fileName  the name of the file
	 * @param content   the content as String
	 * @param replace   replace the file if it already exists
	 */
	default void write(IContainer container, String fileName, String content, boolean replace) {
		final var file = container.getFile(new Path(fileName));
		if (file.exists() && replace) {
			try {
				file.delete(true, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		if (!file.exists()) {
			final var bytes = content.getBytes();
			InputStream source = new ByteArrayInputStream(bytes);
			try {
				if (!file.getParent().exists()) {
					createFolder((IFolder) file.getParent(), true, true, null);
				}
				file.create(source, IResource.NONE, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Write a new file.
	 * 
	 * @param container where the file is put; e.g.
	 *                  <code>getPackageFragmentRoot().getJavaProject().getProject()</code>
	 * @param fileName  the name of the file
	 * @param content   the content as String
	 */
	default void write(IContainer container, String fileName, String content) {
		write(container, fileName, content, false);
	}

	/***
	 * Write a new file.
	 * 
	 * @param container where the file is put; e.g.
	 *                  <code>getPackageFragmentRoot().getJavaProject().getProject()</code>
	 * @param fileName  the name of the file
	 * @param content   the content as String
	 */
	default void write(IContainer container, String fileName, byte[] content) {
		final var file = container.getFile(new Path(fileName));
		if (!file.exists()) {
			InputStream source = new ByteArrayInputStream(content);
			try {
				if (!file.getParent().exists()) {
					createFolder((IFolder) file.getParent(), true, true, null);
				}
				file.create(source, IResource.NONE, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

}
