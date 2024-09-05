package org.comstudy.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home") //get, post 전부 처리
	public String home(Model model) {
		model.addAttribute("message", "Hello JSP from SpringBoot controller");
		return "home";
	}
	
}
