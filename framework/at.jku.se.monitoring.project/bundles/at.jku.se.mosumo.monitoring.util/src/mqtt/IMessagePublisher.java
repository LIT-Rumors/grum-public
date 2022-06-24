package mqtt;

public interface IMessagePublisher {	
	
	void connect(String broker) throws PublishException;

	void publish(String topic, String message) throws PublishException;

} 
  