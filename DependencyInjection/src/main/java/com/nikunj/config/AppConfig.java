package com.nikunj.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.nikunj.service.Employee;
import com.nikunj.service.impl.EmployeeImpl;

@Configurable
@ComponentScan(basePackages="com.nikunj.*")
public class AppConfig {
	
	@Bean
	public Employee getEmployee() {
		return new EmployeeImpl();
	}
}
