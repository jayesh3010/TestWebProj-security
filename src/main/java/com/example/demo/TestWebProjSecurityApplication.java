package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableGlobalMethodSecurity
@SpringBootApplication
public class TestWebProjSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestWebProjSecurityApplication.class, args);
	}
	
	@RequestMapping
	public String sayHello()
	{
		return "Hello world";
	}
}
