package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		// Create a student object
		Student stu = new Student();
		stu.getCountryOptions().put("Russia", "Russia");
		// Add student object to model
		model.addAttribute("student",stu);	
		return "student_form";	
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		return "student_confirm";
	}
	
}
