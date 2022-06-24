package at.jku.mosumo.lang

import org.eclipse.xtext.xtext.generator.DefaultGeneratorModule
import org.eclipse.xtext.xtext.generator.XtextGeneratorResourceSetInitializer

class CustomGeneratorModule extends DefaultGeneratorModule {
	def Class<? extends XtextGeneratorResourceSetInitializer> bindXtextGeneratorResourceSetInitializer() {
		CustomXtextGeneratorResourceSetInitializer
	}
}