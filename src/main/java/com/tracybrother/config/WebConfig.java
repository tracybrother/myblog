package com.tracybrother.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class WebConfig {
	@Value("${ds.userName}")
	private String username;
	
	@Autowired
	private Environment environment;
	
	public void show(){
		System.out.println("Value"+ username);
		String enString = environment.getProperty("ds.userName");
		System.out.println(enString+":envir形式");
	}
}
