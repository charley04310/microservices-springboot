package com.discovery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaClientDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientDiscoveryApplication.class, args);
	}

}
