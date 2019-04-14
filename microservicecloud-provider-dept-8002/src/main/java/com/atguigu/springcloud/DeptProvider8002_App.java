package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(basePackages={"com.atguigu.springcloud.dao"})
@EnableEurekaClient
public class DeptProvider8002_App {
	
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8002_App.class, args);
	}

}
