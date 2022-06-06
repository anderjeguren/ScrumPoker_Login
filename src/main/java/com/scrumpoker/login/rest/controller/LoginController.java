package com.scrumpoker.login.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.scrumpoker.login.bo.LoginBO;
import com.scrumpoker.login.vo.LoginUserVO;
import com.scrumpoker.login.vo.SessionVO;

@RestController
public class LoginController {
	
	@Autowired
	private LoginBO loginBO;
	
	public LoginController() {
		loginBO = new LoginBO();
	}
	
	@PostMapping("/newSession")
	public SessionVO generateSession(@RequestBody LoginUserVO loginUser) {
		return loginBO.generateNewUser(loginUser);
	}
}
