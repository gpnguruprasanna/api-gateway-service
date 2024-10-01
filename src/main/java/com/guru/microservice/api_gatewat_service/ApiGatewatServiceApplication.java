package com.guru.microservice.api_gatewat_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiGatewatServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewatServiceApplication.class, args);
	}

}
