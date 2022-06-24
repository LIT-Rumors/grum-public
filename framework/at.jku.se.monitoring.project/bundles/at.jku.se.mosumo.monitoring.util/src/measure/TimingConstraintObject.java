package measure;

public class TimingConstraintObject extends TimingObject{
	

	public TimingConstraintObject(String constraint, long time) {
		super(constraint, time);
	}

	public void conclude() {
		finished = System.nanoTime();
		TimingWriter.submitConstraintCheck(getTopic(),getTimeDifference());
		
	}
	
	public static TimingConstraintObject create(String constraint) {
		return new TimingConstraintObject(constraint, System.nanoTime());
	} 

}
