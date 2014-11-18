package com.zitro.interactive.labs.primefaces.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zitro.interactive.labs.primefaces.entity.User;
import com.zitro.interactive.labs.primefaces.repository.UserRepository;
import com.zitro.interactive.labs.primefaces.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional("myTransactionManager")
	public void save(User user) {
		System.out.println("Saving user " + user.getName());
		this.userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		System.out.println("Retrieving users");
		Iterator<User> it = this.userRepository.findAll().iterator();
		final List<User> users = new ArrayList<User>();
		while (it.hasNext()) {
			users.add(it.next());	
		}
		return users;
	}

}
