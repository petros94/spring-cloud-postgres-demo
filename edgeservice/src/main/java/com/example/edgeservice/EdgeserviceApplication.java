package com.example.edgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

@EnableDiscoveryClient
public class EdgeserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeserviceApplication.class, args);
	}
}
