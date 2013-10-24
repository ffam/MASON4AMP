package org.eclipse.amp.escape.ide;

/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Development and maintenance
 *
 * </copyright> $Id: PluginProjectWizard.java,v 1.4 2009/09/23 18:14:57 mparker Exp $
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * Creates a generic project with code generation; intended for specialization.
 * Caution: this code is duplicated at
 * "org.eclipse.amp.amf.gen.ide.PluginProjectWizard"!
 * 
 * @author milesparker
 * @author jonas.ruettimann
 */
public abstract class ProjectWizard extends Wizard implements INewWizard {

	private WizardNewProjectCreationPage projectPage;

	public ProjectWizard() {
		super();
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// Override if needed.
	}

	@Override
	public void addPages() {
		projectPage = new WizardNewProjectCreationPage("Specify model name and location.");
		addPage(projectPage);
		setWindowTitle("Create a new " + getProjectTypeName() + " project.");
		projectPage.setDescription(getWindowTitle());
	}

	@Override
	public boolean performFinish() {
		try {
			IJavaProject javaProject = JavaCore.create(getProject());
			final IProjectDescription projectDescription = ResourcesPlugin.getWorkspace().newProjectDescription(projectPage.getProjectName());
			if (projectPage.useDefaults()) {
				projectDescription.setLocation(null);
			} else {
				projectDescription.setLocation(projectPage.getLocationPath());
			}

			getProject().create(projectDescription, null);

			projectDescription.setNatureIds(getNatures().toArray(new String[0]));

			List<String> builderIDs = getBuilders();
			ICommand[] buildCMDS = new ICommand[builderIDs.size()];
			int i = 0;
			for (String builderID : builderIDs) {
				ICommand build = projectDescription.newCommand();
				build.setBuilderName(builderID);
				buildCMDS[i++] = build;
			}
			projectDescription.setBuildSpec(buildCMDS);
			getProject().open(null);
			getProject().setDescription(projectDescription, null);

			List<IClasspathEntry> classpathEntries = getClasspathsEntries();
			javaProject.setRawClasspath(classpathEntries.toArray(new IClasspathEntry[classpathEntries.size()]), null);
			javaProject.setOutputLocation(new Path("/" + projectPage.getProjectName() + "/bin"), null);

			createFiles();
			return true;
		} catch (Exception exception) {
			StatusManager.getManager().handle(new Status(IStatus.ERROR, getCurrentPluginID(), "Problem creating " + getProjectTypeName() + " project. Ignoring.", exception));
			try {
				getProject().delete(true, null);
			} catch (Exception e) {
				// TODO: handle exception
			}
			return false;
		}
	}

	@SuppressWarnings("unused")
	protected void createFiles() throws CoreException, IOException {
		// Override if needed.
	}

	/**
	 * Only needed for generating Status.
	 * 
	 * @return the ID of the plugin the implementing class
	 */
	protected abstract String getCurrentPluginID();

	protected abstract String getSourceDirName();

	protected IProject getProject() {
		return ResourcesPlugin.getWorkspace().getRoot().getProject(projectPage.getProjectName());
	}

	protected String getProjectTypeName() {
		return "Plugin";
	}

	protected List<String> getNatures() {
		List<String> natures = new ArrayList<String>();
		natures.add(JavaCore.NATURE_ID);
		return natures;
	}

	protected List<IClasspathEntry> getClasspathsEntries() throws CoreException {
		List<IClasspathEntry> classpathEntries = new ArrayList<IClasspathEntry>();
		classpathEntries.add(JavaCore.newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER")));
		classpathEntries.add(JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")));

		IFolder srcFolder = getProject().getFolder(getSourceDirName());
		srcFolder.create(true, true, null);
		classpathEntries.add(JavaCore.newSourceEntry(srcFolder.getFullPath()));

		return classpathEntries;
	}

	protected List<String> getBuilders() {
		List<String> builderIDs = new ArrayList<String>();
		builderIDs.add(JavaCore.BUILDER_ID);
		return builderIDs;
	}

}