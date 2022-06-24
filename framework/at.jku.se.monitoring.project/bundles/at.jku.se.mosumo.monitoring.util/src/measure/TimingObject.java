package measure;

public class TimingObject {
	private long creation;
	protected long finished;
	private String topic;

	public String getTopic() {
		return topic;
	}

	protected TimingObject(String topic,long l) {
		this.topic = topic;
		creation = l;
	}

	public static TimingObject create(String topic) {
		return new TimingObject(topic,System.nanoTime());
	}

	public void conclude() {
		finished = System.nanoTime();
		//TimingWriter.submit(topic, getTimeDifference());

	}

	public long getTimeDifference() {
		return finished - creation;
	}

	public void cancel() {

	}



}
