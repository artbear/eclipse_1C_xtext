/*
* generated by Xtext
*/
package org.xtext.onec;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class OneCUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.onec.ui.internal.OneCActivator.getInstance().getInjector("org.xtext.onec.OneC");
	}
	
}
