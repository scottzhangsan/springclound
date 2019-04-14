package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author yzhang98
 *
 */
@SpringBootApplication
@EnableEurekaServer    //作为Eureka的服务中心,,接受其他服务注册进来
public class EurekaServer7003_App {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7003_App.class, args);
	}

}
