package com.ishang.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/findAll")
	public Object findAll() {
		return "Hello World!";
	}
}
