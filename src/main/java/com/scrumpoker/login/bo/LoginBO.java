package com.scrumpoker.login.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.scrumpoker.login.jpa.entity.UserEntity;
import com.scrumpoker.login.jpa.repository.UserRepository;
import com.scrumpoker.login.utils.RandomString;
import com.scrumpoker.login.vo.LoginUserVO;
import com.scrumpoker.login.vo.SessionVO;

@Component
public class LoginBO {
	
	@Autowired
	private UserRepository userRepository;
	
	public LoginBO() {
	}
	
	public SessionVO generateNewUser(LoginUserVO loginUser) {
		final String sessionId = this.generateSessionId();
		final String groupId = this.generateGroupId();
		final UserEntity newUser = new UserEntity();
		newUser.setNickname(loginUser.getNickname());
		newUser.setSessionId(sessionId);
		newUser.setGroupId(groupId);
		userRepository.save(newUser);
		return new SessionVO(sessionId, groupId);
	}
	
	private String generateSessionId() {
	   return RandomString.getAlphaNumericString(9);
	}
	
	private String generateGroupId() {
		return RandomString.getAlphaNumericString(9) + "G";
	}
		
}
