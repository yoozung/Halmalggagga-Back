package com.halmalgaga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HalmalggaggaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HalmalggaggaApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "wetaggu") String name) {
		return String.format("Hello %s!", name);
	}
	
	// yoozung commit test

}
