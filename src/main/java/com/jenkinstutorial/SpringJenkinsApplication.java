package com.jenkinstutorial;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init() {
		log.info("======== Application Started =========");
	}

	public static void main(String[] args) {
		log.info("Main Application executed...");
		log.info("Main Application executed...2");
		log.info("Main Application executed...3");
		SpringApplication.run(SpringJenkinsApplication.class, args);
		
	}

}
