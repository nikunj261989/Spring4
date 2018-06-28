package com.nikunj.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nikunj.service.Employee;

@Component
public class Company {

	Employee employee;

	// constructor based
	@Autowired
	public Company(Employee employee) {
		this.employee = employee;
	}

	// setter based
	@Autowired
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void showEmployee() {
		employee.showEmployeeInfo();
	}
}

//uncomment the code as per the requirement (constructor and setter)
