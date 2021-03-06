package com.cg.wmd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	/*
	 * @RequestMapping("/") public String greet() { return "index"; }
	 */
	
	@RequestMapping({"","/","/home"})
    public ModelAndView defaultGetRequestHandler() {
        ModelAndView mv = new ModelAndView();
        
        mv.setViewName("home");  // resolves to /pages/home.jsp
        
        mv.addObject("pageTitle","Home Page - Welcome All");
        mv.addObject("developers",new String[] {"Vamsy","Venkat","Srini"});
            
        return mv;
    }

 

    @RequestMapping("/header")
    public String showHeader() {
        return "header";
    }
    
    @RequestMapping("/footer")
    public String showFooter() {
        return "footer";
    }
}