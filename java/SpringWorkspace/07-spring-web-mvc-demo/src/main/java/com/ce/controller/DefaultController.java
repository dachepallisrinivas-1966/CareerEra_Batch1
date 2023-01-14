package com.ce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {

//	@RequestMapping("/")
//	@ResponseBody
//	public String sayHello() {
//		return "welcome to spring web mvc application";
//	}
	
	@RequestMapping("/")
	public ModelAndView defaultAction() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("home");
		
		mv.addObject("empName", "srinivas");
		mv.addObject("salary", 50000.0);
		
		return mv;
	}
}

