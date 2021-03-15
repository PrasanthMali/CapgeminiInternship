package com.cg.sbwd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	
	
	@Value("${app.title}")
	private String appTitle;
	@GetMapping(path = "/header")
    public ModelAndView headerAction() {
        // ModelAndView(viewName, modelObjectName, modelObjectValue)
        return new ModelAndView("header", "appTitle", appTitle);

    }

    @GetMapping(path = {"","/","/home"})
    public ModelAndView defaultAction() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
 
        mv.addObject("name", "Srinivas Dachepalli");
        mv.addObject("age", "54");
        mv.addObject("location", "Visakhapatnam");
        mv.addObject("technologies", new String[] {"Java", "PostGre", "React", "ES6", "Spring", "Hibernate"});

        return mv;
    }

    @GetMapping(path = "/footer")
    public ModelAndView footerAction() {
        return new ModelAndView("footer");

    }
    @GetMapping(path = "/hello")
    public ModelAndView helloAction(
            @RequestParam(name="salut", required=false, defaultValue="Mr.") String salutation,
            @RequestParam(name="uname", required=false, defaultValue="Guest") String userName
            ) {
        return new ModelAndView("hello", "msg", "Hello " + salutation + " " + userName + "!");
    }
	

}