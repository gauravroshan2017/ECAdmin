package com.gaurav.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.DispatcherServlet;
@Controller 
public class TestController {
	 
	
	  
	    @RequestMapping("/hello")  
	    public ModelAndView helloWorld() {  
	  
	        String message = "HELLO SPRING MVC";  
	        return new ModelAndView("hellopage", "message", message);  
	    }  
}
