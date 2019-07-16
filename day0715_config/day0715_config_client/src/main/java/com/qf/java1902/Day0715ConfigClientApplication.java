package com.qf.java1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient	//开启eureka搜索服务
@SpringBootApplication
public class Day0715ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day0715ConfigClientApplication.class, args);
	}

}
