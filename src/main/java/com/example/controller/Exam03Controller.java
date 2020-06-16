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
		int sum=Integer.parseInt(num1)+Integer.parseInt(num2)+Integer.parseInt(num3);
		int tax =(int) (sum*1.1);
		model.addAttribute("sum", (String.format("%,d", sum)));
		model.addAttribute("tax", (String.format("%,d", tax)));
		
		return "exam03-result";
	}

}
