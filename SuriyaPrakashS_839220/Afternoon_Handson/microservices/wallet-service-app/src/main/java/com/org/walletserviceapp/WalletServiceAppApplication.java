package com.org.walletserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication
public class WalletServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletServiceAppApplication.class, args);
		
	}
	@Bean
	@LoadBalanced
	public RestTemplate createRestTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

}
