package com.gaurav.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
@Controller 
@RequestMapping("/hello1")
public class TestController {

	@RequestMapping(method = RequestMethod.GET)
	   public String printHello(ModelMap model) 
	   {
		   System.out.println("control comes in controller");
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "Welcome";
	   }
}
