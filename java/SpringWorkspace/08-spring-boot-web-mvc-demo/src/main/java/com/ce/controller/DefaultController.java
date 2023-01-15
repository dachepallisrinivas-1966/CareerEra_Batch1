package com.ce.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {

//	@RequestMapping("/")
//	@ResponseBody
//	public String sayHello() {
//		return "welcome";
//	}
	
	@Value("${app.title}")
	private String appTitle;
	
	
	@RequestMapping({"","/","/home"})
	public ModelAndView defaultAction() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("applicationTitle", appTitle);
		mv.addObject("teamMembers", new String[] {"srinivas", "vamsy", "sagar", "ashok"});
		return mv;
	}
	
	@RequestMapping("/header")
	public String getHeader() {
		return "header";
	}
	
	@RequestMapping("/footer")
	public String getFooter() {
		return "footer";
	}
}
