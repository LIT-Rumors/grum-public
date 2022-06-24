package at.jku.mosumo.lang;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import Monitoring.NamedElement;

public class MosumoQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof NamedElement)
			return QualifiedName.create(((NamedElement) obj).getName());		
		return super.getFullyQualifiedName(obj);
	}
}
