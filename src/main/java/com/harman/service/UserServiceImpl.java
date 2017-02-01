package com.harman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harman.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	protected UserDao userDao;
	
	@Override
	public boolean isValidUser(String username, String password) {
		return userDao.isValidUser(username, password);
	}

}
