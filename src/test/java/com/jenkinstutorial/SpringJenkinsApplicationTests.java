package com.jenkinstutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		log.info("Test cases executing...");
		assertEquals(true,true);
	}

}
