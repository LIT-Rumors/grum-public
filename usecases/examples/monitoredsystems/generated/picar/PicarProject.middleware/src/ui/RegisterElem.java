package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegisterElem {

	public Map<String, String> getActiveState() {
		return activeState;
	}

	public void setActiveState(Map<String, String> activeState) {
		this.activeState = activeState;
	}

	public RegisterElem(String id, String type, String parentAgentId, String topic) {
		super();
		this.id = id;
		this.name = id;
		this.type = type;
		this.parentAgentId = parentAgentId;
		this.topic = topic;
	}

	String id = "Bot01";
	String name = "Bot01";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getParentAgentId() {
		return parentAgentId;
	}

	public void setParentAgentId(String parentAgentId) {
		this.parentAgentId = parentAgentId;
	}

	public int getHeartbeat() {
		return heartbeat;
	}

	public void setHeartbeat(int heartbeat) {
		this.heartbeat = heartbeat;
	}

	public String getName() {
		return name;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setName(String name) {
		this.name = name;
	}

	String type = "robot";
	String parentAgentId;
	int heartbeat = 60;
	String topic;
	Map<String, String> activeState = new HashMap<>();
	List constraints = new ArrayList();

	public List getConstraints() {
		return constraints;
	}

	public void setConstraints(List constraints) {
		this.constraints = constraints;
	}

}