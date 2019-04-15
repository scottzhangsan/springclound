package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient   //服务启动会自动注册进入EureKa服务
@MapperScan(basePackages={"com.atguigu.springcloud.dao"})
/**
 * @EnableDiscoveryClient和@EnableEurekaClient共同点就是：
 * 都是能够让注册中心能够发现，扫描到改服务。
不同点：@EnableEurekaClient只适用于Eureka作为注册中心，
@EnableDiscoveryClient 可以是其他注册中心。
 * @author yzhang98
 *
 */
public class DeptProvider8001_App {
	
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001_App.class, args);
	}

}
