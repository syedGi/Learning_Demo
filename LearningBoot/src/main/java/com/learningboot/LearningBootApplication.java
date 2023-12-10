package com.learningboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
/*
 * @Configuration
 * 
 * @EnableAutoConfiguration
 * 
 * @ComponentScan("com.learningboot")
 */
//@PropertySource("classpath:myprops.properties")
public class LearningBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningBootApplication.class, args);
	}

}
