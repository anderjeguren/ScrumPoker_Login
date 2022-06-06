package com.scrumpoker.login.vo;

public class SessionVO {

	private String sessionId;
	private String groupId;
	
	public SessionVO() {
		setSessionId("");
		setGroupId("");
	}

	public SessionVO(String sessionId, String groupId) {
		super();
		this.sessionId = sessionId;
		this.groupId = groupId;
	}
	
	/**
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * @param sessionId the sessionId to set
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * @return the groupId
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
}
