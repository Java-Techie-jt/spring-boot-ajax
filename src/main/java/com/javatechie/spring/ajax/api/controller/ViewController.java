package com.javatechie.spring.ajax.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/home")
	public String home() {
		return "home";
	}

}
