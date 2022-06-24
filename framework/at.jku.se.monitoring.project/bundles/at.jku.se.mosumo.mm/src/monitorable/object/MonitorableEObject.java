package monitorable.object;

import org.eclipse.emf.ecore.EObject;

public class MonitorableEObject extends ForwadingEObject{
	
	private String id;

	public MonitorableEObject(EObject eObject) {
		super(eObject);		
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}	
}
