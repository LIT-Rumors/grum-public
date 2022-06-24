package mqtt;

import measure.TimingObject;

public interface ITimingMessageListener extends IMessageListener{

	void messageArrived(String topic, String message, TimingObject t);

}
