package monitorable.object;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public class ForwadingEObject implements EObject{
	
	private final EObject eObject;
	
	public ForwadingEObject(EObject eObject) {
		this.eObject = eObject;
	}

	@Override
	public EList<Adapter> eAdapters() {
		return getEObject().eAdapters();
	}

	@Override
	public boolean eDeliver() {
		return getEObject().eDeliver();
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		getEObject().eSetDeliver(deliver);
	}

	@Override
	public void eNotify(Notification notification) {
		getEObject().eNotify(notification);		
	}

	@Override
	public EClass eClass() {
		return getEObject().eClass();
	}

	@Override
	public Resource eResource() {
		return getEObject().eResource();
	}

	@Override
	public EObject eContainer() {
		return getEObject().eContainer();
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		return getEObject().eContainingFeature();
	}

	@Override
	public EReference eContainmentFeature() {
		return getEObject().eContainmentFeature();
	}

	@Override
	public EList<EObject> eContents() {
		return getEObject().eContents();
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		return getEObject().eAllContents();
	}

	@Override
	public boolean eIsProxy() {
		return getEObject().eIsProxy();
	}

	@Override
	public EList<EObject> eCrossReferences() {
		return getEObject().eCrossReferences();
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		return getEObject().eGet(feature);
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		return getEObject().eGet(feature, resolve);
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		getEObject().eSet(feature, newValue);		
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		return getEObject().eIsSet(feature);
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		getEObject().eUnset(feature);		
	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		return getEObject().eInvoke(operation, arguments);
	}
	
	public EObject getEObject() {
		return this.eObject;
	}

}
