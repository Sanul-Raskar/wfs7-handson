package com.hsbc.springbootdataapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.springbootdataapp.model.beans.User;
import com.hsbc.springbootdataapp.model.sevice.UserService;

@CrossOrigin(origins = "*")
@RestController
public class RestApi {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "users", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public List<User> getAllUsersApi() {
		return userService.fetchUsers();
	}
	
	// { "userId" : 1000, "name" : "Alex"} 
	@RequestMapping(value = "store", method = RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User createUserAPI(@RequestBody User user) { // User (userId, name)
		User createdUser = userService.createUser(user);
		return createdUser;
	}
}
