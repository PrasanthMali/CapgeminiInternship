package com.cg.bsm.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	
	/* dynamic menu generation */
	@ModelAttribute
	public void populateCommonData(Model model) {
		Map<String, String> navLinks = new LinkedHashMap<>();
		
		navLinks.put("home", "Home");
		navLinks.put("books", "List Books");
		navLinks.put("newBook", "Add Books");
		navLinks.put("deleteBook", "Delete Book");
		
		model.addAttribute("links", navLinks);
		model.addAttribute("appTitle", "Book Store Management System");
	}
	
	@GetMapping(path={"","/","/home"})
	public ModelAndView homeAction(
			@RequestParam(name="msgCode", required=false, defaultValue="0") int msgCode,
			@RequestParam(name="id", required=false, defaultValue="0") long bookId
			) {
		ModelAndView mv = new ModelAndView("dash-board");
		if (msgCode > 0) {
			mv.addObject("msg", "Book #" + bookId + " is "
					+ (msgCode == BookController.SAVED ? "Saved" : "Deleted")
					+ " successfully"
					);
		}
		return mv;
	}
	
	
	@GetMapping(path="/header")
	public ModelAndView headerAction() {
		return new ModelAndView("header");
	}
	
	@GetMapping(path="/footer") 
	public ModelAndView footerAction() {
		return new ModelAndView("footer");
	}
}