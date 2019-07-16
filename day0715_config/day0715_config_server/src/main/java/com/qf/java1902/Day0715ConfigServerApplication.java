package com.qf.java1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient	//开启微服务注册
@EnableConfigServer	//开启配置服务
@SpringBootApplication
public class Day0715ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day0715ConfigServerApplication.class, args);
	}

}
