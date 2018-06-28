package com.nikunj.service.impl;

import com.nikunj.service.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService{

	@Override
	public void sayHello(String name) {
		
		System.out.println("Hello : "+name);
		
	}
	
}
