package com.zitro.interactive.labs.primefaces.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zitro.interactive.labs.primefaces.entity.User;
import com.zitro.interactive.labs.primefaces.service.UserService;

@Controller
@ManagedBean(name="userController")
@RequestScoped
public class UserController {
	
	@Autowired
	private UserService userService;
	
	private User user;
	
	public UserController() {
		this.user = new User();
	}
	
	// Binded in JSF view
	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser() {		
		return this.user;
	}
	
	public void saveUser() {		
		this.userService.save(user);				
	}
	
}
