package com.org.springbootjunit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test1 {
	@Autowired
	private HelloController controller;
	
	@Test
	public void testControllerInstance() {
		assertThat(controller).isNotNull();
	}
}
