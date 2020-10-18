package com.hsbc.springbootdataapp.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsbc.springbootdataapp.model.beans.User;

public interface UserDao extends JpaRepository<User, Integer> {
	// you don't have to write any methods for CRUD operations because JpaRepository has that
	// you don't have to implement this interface because Spring Boot does it for you	
}
