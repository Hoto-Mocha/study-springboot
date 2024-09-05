package org.comstudy.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		System.out.println("GET - /home 호출");
		
		model.addAttribute("message", "Hello SpringBoot");
		return "home";
	}
	
	@GetMapping("/info")
	public String info() {
		System.out.println("GET - /info 호출");
		return "info";
	}
}
