package com.example.hellodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HellodockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellodockerApplication.class, args);
    }

}
