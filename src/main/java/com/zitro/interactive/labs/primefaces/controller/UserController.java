package com.zitro.interactive.labs.primefaces.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

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
	
	private List<User> users;
	
	@PostConstruct
	public void init() {
		this.user = new User();
		this.users = this.userService.findAll();
	}

	public void setUser(User user) {
		this.user = user;
	}	
	public User getUser() {		
		return this.user;
	}
	public List<User> getUsers() {
		return this.users;
	}
	
	public void saveUser() throws IOException {		
		this.userService.save(user);
		this.users = this.userService.findAll();
		this.user = new User();
		FacesContext.getCurrentInstance().getExternalContext().redirect("create.jsf");
	}
	
}
