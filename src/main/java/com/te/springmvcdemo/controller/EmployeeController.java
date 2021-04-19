package com.te.springmvcdemo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.springmvcdemo.bean.EmployeeBean;
import com.te.springmvcdemo.dao.EmployeeImplement;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeImplement dao;

	@GetMapping("/header")
	public String gethome() {

		return "header";

	}

	@GetMapping("/loginform")
	public String getLogin() {

		return "loginform";

	}

	@PostMapping("/login1form")
	public String authenticate(int id, String pwd, HttpServletRequest request, ModelMap map) {

		EmployeeBean employeeBean = dao.authenticate(id, pwd);

		if (employeeBean != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("emp", employeeBean);
			return "header";

		} else {
			map.addAttribute("errmsg", "Invalid Credential");
			return "loginform";
		}

	}

	@GetMapping("/searchform")
	public String getSearch(ModelMap map, HttpSession session) {
		if (session.getAttribute("emp") != null) {
			return "searchform";

		} else {
			map.addAttribute("errmsg", "please enter the login");
			return "loginform";
		}

	}

	@GetMapping("/searchs")
	public String searchEmp(int id, ModelMap map,
			@SessionAttribute(name = "emp", required = false) EmployeeBean employeeBean) {

		if (employeeBean != null) {
			EmployeeBean employeeBean2 = dao.getEmployee(id);
			if (employeeBean2 != null) {
				map.addAttribute("data", employeeBean2);

			} else {
				map.addAttribute("msg", "Data not found:" + id);
			}
			return "searchform";
		} else {
			map.addAttribute("errmsg", "please enter the login");
			return "loginform";
		}
	}
	@GetMapping("/delete")
	public String getdelete(ModelMap map, HttpSession session) {
		if (session.getAttribute("emp") != null) {
			return "delete";

		} else {
			map.addAttribute("errmsg", "please enter the login");
			return "loginform";
		}

	}

	@GetMapping("/deleted")
	public String deleteEmp(int id,ModelMap map,@SessionAttribute(name="emp", required = false)EmployeeBean emplBean) {
		if(emplBean!=null)
		{
			boolean isDeleted = dao.deleteEmpData(id);
			if(isDeleted)
			{
				map.addAttribute("msg","Deleted sucessfully");
			}
			else
			{
				map.addAttribute("errmsg","not Deleted sucessfully");
			}
			return "deleted";
		}
		else
		{
		
		return "loginform";
		}
	}
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap map) {
		session.invalidate();
		map.addAttribute("msg", "Login Successful");

		return "login1form";

	}
	
}
