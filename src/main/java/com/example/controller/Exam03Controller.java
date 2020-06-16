package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/ex03-result")
	public String result(String num1, String num2, String num3, Model model) {
		model.addAttribute("num1", Integer.parseInt(num1));
		model.addAttribute("num2", Integer.parseInt(num2));
		model.addAttribute("num3", Integer.parseInt(num3));
		
		return "exam03-result";
	}

}
