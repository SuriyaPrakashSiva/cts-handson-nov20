package com.org.microservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class Microservice1Service {
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="buildFallBackForMethod1")
	public String method1() {
		String response=null;
		response=restTemplate.getForObject("http://MICROSERVICE2/m2", String.class);
		return response;
	}
	
	
	public String buildFallBackForMethod1() {
		System.out.println("buildFallBackForMethod1() is called");
		return "Please try again later";
	}
}
