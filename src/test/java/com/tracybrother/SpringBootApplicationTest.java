package com.tracybrother;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tracybrother.config.WebConfig;

@SpringBootApplication
public class SpringBootApplicationTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootApplicationTest.class, args);
		context.getBean(WebConfig.class).show();
	}

}
