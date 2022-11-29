package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Demo2Controller {

	@GetMapping("/get")
	public String get() {
		return "Hii Miracle";
	}
}
