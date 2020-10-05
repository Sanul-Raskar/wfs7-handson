package com.example.dao;

import java.util.ArrayList;

import com.example.model.Employee;

public class EmployeeDaoImpl implements IEmployee {

	ArrayList<Employee> emp = new ArrayList<>();
	
	@Override
	public void addEmployee(Employee e) {
		emp.add(e);
		System.out.println("Employee added");
	}

	@Override
	public ArrayList<Employee> getEmployees() {
		return emp;
	}

}
