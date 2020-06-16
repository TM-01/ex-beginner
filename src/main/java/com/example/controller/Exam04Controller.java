package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.form.UserForm;

@Controller
@RequestMapping("/ex04")
public class Exam04Controller {
	
	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}
	
	@RequestMapping("/ex04-result")
	public String result(UserForm form, Model model) {
		User user = new User();
		user.setName(form.getName());
		user.setAge(Integer.parseInt(form.getAge()));
		user.setComment(form.getComment());
		model.addAttribute("user", user);
		
		return "exam04-result";
	}

}
