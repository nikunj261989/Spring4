package com.nikunj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nikunj.config.AppConfig;
import com.nikunj.di.Company;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Company company = context.getBean(Company.class);
		company.showEmployee();
		context.close();
	}
}
