package com.qf.java1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Day0715EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day0715EurekaServerApplication.class, args);
	}

}
