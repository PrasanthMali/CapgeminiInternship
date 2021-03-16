package com.cg.sbwd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.sbwd.model.SimpleInterest;
import com.cg.sbwd.service.ISimpleInterestService;

@Controller
@RequestMapping(path = "/emp")
public class SimpleInterestController {
	
	@Autowired
	private ISimpleInterestService employeeService;
	
	@ModelAttribute
	public void populateDesignation(Model model) {
		model.addAttribute("designations", 
				new String[] {"Associate", "Jr.Associate", "Sr.Associate","Manager","Architect"});
	}
	
	@GetMapping
	public ModelAndView employeeInputAction() {
		return new ModelAndView("emp-input", "emp", new SimpleInterest());
	}
	
	@PostMapping
	public ModelAndView employeeOutputAction(@ModelAttribute("emp") SimpleInterest employee) {
		employee = employeeService.computeAllowances(employee);
		return new ModelAndView("emp-output", "emp", employee);
	}
}