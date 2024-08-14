package com.sn.mongo.service;

import com.sn.mongo.model.User;

public interface UserServiceI {
	public User getUser(String userId);
	public User saveUser(User user);
}
