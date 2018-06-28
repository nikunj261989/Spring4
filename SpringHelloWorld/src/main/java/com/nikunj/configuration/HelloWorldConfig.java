package com.nikunj.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nikunj.service.HelloWorldService;
import com.nikunj.service.impl.HelloWorldServiceImpl;

/**
 * @author nikunjpatel
 *
 */
@Configuration
public class HelloWorldConfig {

	@Bean(name="helloWorldBean")
	public HelloWorldService helloWorld() {
		return new HelloWorldServiceImpl();
	}

}
