package com.example.springhelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String helloworld() {
		return "Hello from Xoriant";
	}

	@GetMapping("/test")
	public String test() {
		return "test from Xoriant";
	}
}
