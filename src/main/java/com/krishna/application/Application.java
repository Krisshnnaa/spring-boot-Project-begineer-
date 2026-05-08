package com.krishna.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/")
	public String getMethodName(
			@RequestParam(required = false, defaultValue = "World") String param) {
		return "Hello " + param;
	}

	@GetMapping("/hello")
	public String name(
			@RequestParam(required = false, defaultValue = "hello") String param) {
		return "Krishna Backend Developer";
	}
}
