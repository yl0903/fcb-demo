package com.fcb.demo;


import com.fcb.common.feign.annotation.EnableBigdataFeignClients;
import com.fcb.common.security.annotation.EnableBigdataResourceServer;
import com.fcb.common.swagger.annotation.EnableBigdataSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableBigdataSwagger2
@EnableBigdataFeignClients
@EnableDiscoveryClient
@EnableBigdataResourceServer
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
