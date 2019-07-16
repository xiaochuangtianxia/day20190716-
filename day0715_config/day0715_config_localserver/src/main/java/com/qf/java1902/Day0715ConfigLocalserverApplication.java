package com.qf.java1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer	//开启配置服务中心
@SpringBootApplication
public class Day0715ConfigLocalserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day0715ConfigLocalserverApplication.class, args);
	}

}
