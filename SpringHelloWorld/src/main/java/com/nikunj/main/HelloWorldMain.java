package com.nikunj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nikunj.configuration.HelloWorldConfig;
import com.nikunj.service.HelloWorldService;

public class HelloWorldMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorldService bean = (HelloWorldService) context.getBean("helloWorldBean");
		bean.sayHello("nikunj");
		context.close();
	}
}
