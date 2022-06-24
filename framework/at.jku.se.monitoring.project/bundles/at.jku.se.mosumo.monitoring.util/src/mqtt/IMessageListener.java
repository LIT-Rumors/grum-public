package mqtt;

public interface IMessageListener {

	void messageArrived(String topic, String message);

}
