package com.gaurav.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
@Controller 
/*@RequestMapping("/hello1")*/ 
public class TestController {

	    /*@RequestMapping("/hello") */ 
	    public ModelAndView helloWorld() {  
	    	System.out.println("control comes here");
	        String message = "HELLO SPRING MVC";  
	        return new ModelAndView("Welcome", "message", message);  
	        
	    }  
}
