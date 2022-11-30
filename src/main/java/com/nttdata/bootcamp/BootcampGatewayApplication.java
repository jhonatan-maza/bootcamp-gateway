package com.nttdata.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BootcampGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampGatewayApplication.class, args);
	}

}
