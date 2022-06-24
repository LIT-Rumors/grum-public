package measure;

public class TimingViolationObject extends TimingObject{
	

	public TimingViolationObject(String constraint, long time) {
		super(constraint, time);
	}

	public void conclude() {
		finished = System.nanoTime();
		TimingWriter.submitViolation(getTopic(),getTimeDifference());
		
	}
	
	public static TimingViolationObject create(String constraint) {
		return new TimingViolationObject(constraint, System.nanoTime());
	} 

}
