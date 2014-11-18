package com.zitro.interactive.labs.primefaces.service;

import java.util.List;

import com.zitro.interactive.labs.primefaces.entity.User;

public interface UserService {

	void save(User user);
	
	List<User> findAll();
	
}
