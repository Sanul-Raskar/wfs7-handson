package com.hsbc.springbootdataapp.model.sevice;

import java.time.LocalDate;
import java.util.List;

import com.hsbc.springbootdataapp.model.beans.User;

public interface UserService {
	public User createUser(User user);
	public List<User> fetchUsers();
	public User fetchUserById(int id);
	public void deleteUserById(int id);
	public User updateDob(int id, LocalDate dob);
}
