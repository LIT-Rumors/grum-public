/*
 * generated by Xtext 2.23.0
 */
package at.jku.mosumo.lang.ui.tests;

import at.jku.mosumo.lang.ui.internal.LangActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class MosumoUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return LangActivator.getInstance().getInjector("at.jku.mosumo.lang.Mosumo");
	}

}