package com.te.springmvcdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.te.springmvcdemo.bean.UserBean;

@Controller
public class SpringController {

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView getHomePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/WEB-INF/jsp/home.jsp");
		return modelAndView;

	}

	@RequestMapping(path = "/regis", method = RequestMethod.GET)
	public ModelAndView getRegistrationPage() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("registration");
		return modelAndView;

	}

	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public ModelAndView get(ModelAndView modelAndView, HttpServletRequest request) {

		String name = request.getParameter("name");
		modelAndView.addObject("username", name);
		// request.setAttribute("username",name );
		modelAndView.setViewName("newHome");
		return modelAndView;

	}

	@GetMapping("/login")
	public String getForm() {

		return "login";

	}
	@PostMapping("/login")
	public String getFormData(HttpServletRequest request,ModelMap modelMap) {
		
		String name = request.getParameter("user");
		int password = Integer.parseInt(request.getParameter("pwd"));
		
		modelMap.addAttribute("user", name);
		modelMap.addAttribute("pwd",password);
		
		return "userdetails";
		}
	
	@PostMapping("/Login1")
	public String getFormData1(ModelMap modelMap , int pwd ,String user) {
		modelMap.addAttribute("user", user);
		modelMap.addAttribute("pwd",pwd);
		return "userdetails";
		
		
	}
	
	@PostMapping("/Login2")
	public String getFormDataBean(UserBean userBean,ModelMap modelMap) {
		modelMap.addAttribute("user",userBean.getUser());
		modelMap.addAttribute("pwd",userBean.getPwd());
		
		return "userdetails";
		
	}
	
	@PostMapping("/Login3")
	public String getFormDataRequ(ModelMap modelMap,
			@RequestParam(name="user") String user,
			@RequestParam(name = "pwd") int password) {
		modelMap.addAttribute("user", user);
		modelMap.addAttribute("pwd", password);
		
		
		return "userdetails";
		
		
	}

}
