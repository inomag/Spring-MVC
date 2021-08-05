package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	// Add a controller method to show initial form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// Controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	// Controller method to read data & add data to model
//	@RequestMapping("/processFormV2")
//	public String processv2(HttpServletRequest request, Model model) {
//		String name = request.getParameter("studentName");
//		name = name.toUpperCase();
//		model.addAttribute("message", "Hello "+name);
//		return "helloworld";
//	}
	
	@RequestMapping("/processFormV2")
	public String processv2(@RequestParam("studentName")String name, Model model) {
		name = name.toUpperCase();
		model.addAttribute("message", "Hello "+name);
		return "helloworld";
	}
}
