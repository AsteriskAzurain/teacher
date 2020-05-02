package com.ishang.demo.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ishang.demo"})
public class DemoAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAdminApplication.class, args);
	}

}
