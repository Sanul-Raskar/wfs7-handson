package com.hsbc.springbootdataapp.model.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class User {
	@Id
	@Column(name = "id")
	private int userId; // map to user_id column & this is primary key

	@Column(name = "name")
	private String name; // map to username column

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
