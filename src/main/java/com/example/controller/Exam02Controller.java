package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class Exam02Controller {
	
	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	
	@RequestMapping("/exam02-result")
	public String result(String num1, String num2, Model model) {
		model.addAttribute("num1", Integer.parseInt(num1));
		model.addAttribute("num2", Integer.parseInt(num2));
		
		return "exam02-result2";
	}

}
