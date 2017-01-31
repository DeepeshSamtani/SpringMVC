package com.harman.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@RequestMapping(value="/")
	public String welcome(){
		return "login";
		
	}
	
	@RequestMapping(value="/login" ,method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {

		String username = request.getParameter("username");
		String password=request.getParameter("password");
		String message;

		if(username != null && !username.equals("") && username.equals("Deepesh") && password != null && !password.equals("") && password.equals("111111"))
		{ 
			message = "Welcome, " +username + "."; 
			return new ModelAndView("welcome", "message", message);
		}
		else{
			message = "Wrong username or password."; 
			return new ModelAndView("errorPage", "message", message); 
		}  
	}

}