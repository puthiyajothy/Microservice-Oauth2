package com.java.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AllocationService1Application {

	public static void main(String[] args) {
		SpringApplication.run(AllocationService1Application.class, args);
	}

}
