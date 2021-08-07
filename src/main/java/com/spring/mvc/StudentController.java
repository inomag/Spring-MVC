package com.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	// Add an initBinder
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}

	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		// Create a student object
		Student stu = new Student();
		stu.getCountryOptions().put("Russia", "Russia");
		// Add student object to model
		model.addAttribute("student",stu);	
		return "student_form";	
	}
	
//	@RequestMapping("/processForm")
//	public String processForm(@ModelAttribute("student") Student student) {
//		return "student_confirm";
//	}
	
	
	// Validations
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student,
			BindingResult result) {
		
//		System.out.println("|"+student.getLastName()+"|");
		if(result.hasErrors()) {
			return "student_form";
		}
		return "student_confirm";
	}
	
}
