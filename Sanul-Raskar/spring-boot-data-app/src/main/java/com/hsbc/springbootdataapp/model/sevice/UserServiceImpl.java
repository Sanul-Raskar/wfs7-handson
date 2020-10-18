package com.hsbc.springbootdataapp.model.sevice;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.springbootdataapp.model.beans.User;
import com.hsbc.springbootdataapp.model.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User createUser(User user) {
		User createdUser = userDao.save(user); // save method takes the object and maps to the table
		return createdUser;
	}

	@Override
	public List<User> fetchUsers() {
		List<User> usersList = userDao.findAll(); // findAll method takes all the records and gives you the List of User
		return usersList;
	}

	@Override
	public User fetchUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public User updateDob(int id, LocalDate dob) {
		// TODO Auto-generated method stub
		return null;
	}

}
