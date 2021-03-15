package com.cg.sbwd1.controller;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

 

import com.cg.sbwd1.service.IGreetService;

 

@Controller
public class GreetController {
    
    @Autowired
    private IGreetService greetService;
    
    
    @GetMapping(path = "/greet")
    public ModelAndView greetAction(@RequestParam(name="uname", required=false) String userName) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("greet");
        if(userName != null) {
            mv.addObject("greetings", greetService.getGreeting() + " " + userName);
        }
        
        return mv;
    }
}