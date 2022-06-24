package at.jku.mosumo.lang;

import org.apache.log4j.Logger;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.utils.GenModelHelper;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xtext.generator.XtextGeneratorResourceSetInitializer;

import com.google.common.collect.Iterables;

public class CustomXtextGeneratorResourceSetInitializer extends XtextGeneratorResourceSetInitializer {
	
	private static final Logger LOG = Logger.getLogger(XtextGeneratorResourceSetInitializer.class);
	
	@Override
	public void initialize(ResourceSet resourceSet, List<String> referencedResources) {
		StandaloneSetup delegate = new StandaloneSetup();
		delegate.setResourceSet(resourceSet);
		//resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		referencedResources.forEach((String it) -> {
			loadResource(it, resourceSet);
		});
		registerGenModels(resourceSet);
		registerEPackages(resourceSet);
	}
	
	private void loadResource(String loadedResource, ResourceSet resourceSet) {
		URI loadedResourceUri = URI.createURI(loadedResource);
		ensureResourceCanBeLoaded(loadedResourceUri, resourceSet);
		resourceSet.getResource(loadedResourceUri, true);
	}
	
	private void ensureResourceCanBeLoaded(URI loadedResource, ResourceSet resourceSet) {
		String fileExtension = loadedResource.fileExtension();
		if (fileExtension != null) {
			switch (fileExtension) {
			case "genmodel":
				GenModelPackage.eINSTANCE.getEFactoryInstance();
				IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE
						.getResourceServiceProvider(loadedResource);
				if (resourceServiceProvider == null) {
					try {
						Class<?> genModelSupport = Class.forName("org.eclipse.emf.codegen.ecore.xtext.GenModelSupport");
						Object instance = genModelSupport.getDeclaredConstructor().newInstance();
						genModelSupport.getDeclaredMethod("createInjectorAndDoEMFRegistration").invoke(instance);
					} catch (ClassNotFoundException e) {
						LOG.debug(
								"org.eclipse.emf.codegen.ecore.xtext.GenModelSupport not found, GenModels will not be indexed");
					} catch (Exception e) {
						LOG.error("Couldn't initialize GenModel support.", e);
					}
				}
				return;
			case "ecore":
				IResourceServiceProvider resourceServiceProvider2 = IResourceServiceProvider.Registry.INSTANCE
						.getResourceServiceProvider(loadedResource);
				if (resourceServiceProvider2 == null) {
					try {
						Class<?> ecore = Class.forName("org.eclipse.xtext.ecore.EcoreSupportStandaloneSetup");
						ecore.getDeclaredMethod("setup", new Class[] {}).invoke(null);
					} catch (ClassNotFoundException e) {
						LOG.error("Couldn't initialize Ecore support. Is 'org.eclipse.xtext.ecore' on the classpath?");
						LOG.debug(e.getMessage(), e);
					} catch (Exception e) {
						LOG.error("Couldn't initialize Ecore support.", e);
					}
				}
				return;
			case "xcore":
				IResourceServiceProvider resourceServiceProvider3 = IResourceServiceProvider.Registry.INSTANCE
						.getResourceServiceProvider(loadedResource);
				if (resourceServiceProvider3 == null) {
					try {
						Class<?> xcore = Class.forName("org.eclipse.emf.ecore.xcore.XcoreStandaloneSetup");
						xcore.getDeclaredMethod("doSetup", new Class[] {}).invoke(null);
					} catch (ClassNotFoundException e) {
						LOG.error("Couldn't initialize Xcore support. Is it on the classpath?");
						LOG.debug(e.getMessage(), e);
					} catch (Exception e) {
						LOG.error("Couldn't initialize Xcore support.", e);
					}
				}
				URI xcoreLangURI = URI
						.createPlatformResourceURI("/org.eclipse.emf.ecore.xcore.lib/model/XcoreLang.xcore", true);
				try {
					resourceSet.getResource(xcoreLangURI, true);
				} catch (WrappedException e) {
					LOG.error("Could not load XcoreLang.xcore.", e);
					Resource brokenResource = resourceSet.getResource(xcoreLangURI, false);
					resourceSet.getResources().remove(brokenResource);
				}
				return;
			}
		}
	}
	
	private void registerGenModels(ResourceSet resourceSet) {
		each(resourceSet, GenModel.class, (GenModel it) -> {
			register(it);
		});
	}
	
	private <Type extends Object> void each(ResourceSet resourceSet, Class<Type> type,
			Procedure1<? super Type> strategy) {
		for (int i = 0; i < resourceSet.getResources().size(); i++) {
			Resource resource = resourceSet.getResources().get(i);
			Iterables.filter(resource.getContents(), type).forEach((Type it) -> {
				strategy.apply(it);
			});
		}
	}
	
	private void register(GenModel genModel) {
		new GenModelHelper().registerGenModel(genModel);
	}
	
	private void registerEPackages(ResourceSet resourceSet) {
		each(resourceSet, EPackage.class, (EPackage it) -> {
			register(it);
		});
	}
	
	private void register(EPackage ePackage) {
		EPackage.Registry registry = ePackage.eResource().getResourceSet().getPackageRegistry();
		Object existing = registry.get(ePackage.getNsURI());
		if (existing == null) {
			registry.put(ePackage.getNsURI(), ePackage);
		}
	}
	
}
