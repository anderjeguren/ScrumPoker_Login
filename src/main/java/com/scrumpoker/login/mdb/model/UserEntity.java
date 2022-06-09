package com.scrumpoker.login.mdb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class UserEntity {
	
    private String nickname;
    private String sessionId;
    private String groupId;
    
    /**
     * Constructor
     */
    public UserEntity() {
    	setNickname("");
		setSessionId("");
		setGroupId("");
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
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
