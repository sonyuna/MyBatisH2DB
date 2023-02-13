package com.study.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class H2controller {

	@GetMapping("/test1")
	public void ex1(Model mm) {
		mm.addAttribute("ddd", "연습");
	}
	@GetMapping("/test2")
	public String ex2(Model ss) { 
		ss.addAttribute("ddd", "테스트");
		return "test1";
	}
}
