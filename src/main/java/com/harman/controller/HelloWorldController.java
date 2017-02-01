package com.harman.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.harman.model.User;
import com.harman.service.UserService;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@Autowired
	protected UserService userService;
	
	@RequestMapping(value="/")
	public String welcome(){
		return "login";
		
	}
	
	@RequestMapping(value="/login")
	public String processForm(@ModelAttribute("username") String username, @Valid User user, BindingResult result, Model model, Map map, HttpSession session){
		
		boolean userExists = userService.isValidUser(user.getUsername(), user.getPassword());
		
		if(result.hasErrors())
			return "errorPage";
		if(userExists){
			session.setAttribute("username", user.getUsername());
			model.addAttribute("username",username);
			map.put("user", user);
			return "welcome";
		}
		else{
			result.rejectValue("username", "invalid user");
			return "login";
		}
		
	
		
	}
	@RequestMapping(value="/welcome")
	public String success(){
		return "welcome";
		
	}
	/*@RequestMapping(value="/login" ,method = RequestMethod.GET)
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
	}*/

}