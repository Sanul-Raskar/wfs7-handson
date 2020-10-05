package com.example.dao;

import java.util.ArrayList;

import com.example.model.Employee;

public interface IEmployee {

	public void addEmployee(Employee e);

	public ArrayList<Employee> getEmployees();
	
	public ArrayList<Employee> getTop3Employees(ArrayList<Employee> empList);

}
