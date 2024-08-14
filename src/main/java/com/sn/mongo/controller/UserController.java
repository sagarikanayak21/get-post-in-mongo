package com.sn.mongo.controller;

import java.util.Optional;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sn.mongo.model.User;
import com.sn.mongo.service.UserService;

@RestController
@RequestMapping(value = "/")
public class UserController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	@Autowired
//	private UserRepository userRepository;
	UserService userService;
	
//	@RequestMapping(value = "/create", method = RequestMethod.POST)
//	public User addNewUsers(@RequestBody User user) {
//		LOG.info("Saving user.");
//		return userRepository.save(user);
//	}
	
	@GetMapping("/{userId}/user")
	public String getUserDetails(@PathVariable String userId) {
		User getUsers = userService.getUser(userId);
		if(null != getUsers) {
			return getUsers.toString();
		}
		return null;
	}
	
	
//	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
//	public User getUser(@PathVariable String userId) {
//		LOG.info("Getting user with ID: {}.", userId);
//		Optional<User> user =  userRepository.findById(userId);
//		if(user.isPresent()) {
//			return user.get();
//		}
//		return null;
//	}
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
}