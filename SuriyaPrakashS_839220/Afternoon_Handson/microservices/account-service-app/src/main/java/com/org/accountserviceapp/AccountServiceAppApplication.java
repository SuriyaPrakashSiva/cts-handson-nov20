package com.org.accountserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class AccountServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceAppApplication.class, args);
	}

}
