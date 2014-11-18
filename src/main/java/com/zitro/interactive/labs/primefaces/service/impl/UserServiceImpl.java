package com.zitro.interactive.labs.primefaces.service.impl;

import org.springframework.stereotype.Service;

import com.zitro.interactive.labs.primefaces.entity.User;
import com.zitro.interactive.labs.primefaces.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public void save(User user) {
		System.out.println("Saving user " + user.getName());
	}

}
