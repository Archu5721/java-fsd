package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.User;
import com.service.UserService;

@Controller
public class UserController {


	@Autowired
	UserService userservice;
	
	@RequestMapping(value = "storeUser",method = RequestMethod.POST)
	public ModelAndView storeUser(HttpServletRequest req, User user) {
		int uid = Integer.parseInt(req.getParameter("uid"));
		String uname = req.getParameter("uname");
		String product = req.getParameter("product");
		float price = Float.parseFloat(req.getParameter("price"));
		
		
		user.setUid(uid);
		user.setUname(uname);
		user.setProduct(product);
		user.setPrice(price);
		
		
		String result = userservice.storeUser(user);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("storeUser.jsp");
		return mav;
	}
	
	@RequestMapping(value = "updateUser",method = RequestMethod.POST)
	public ModelAndView updateUser(HttpServletRequest req, User user) {
		int uid = Integer.parseInt(req.getParameter("uid"));
		String uname = req.getParameter("uname");
		String product = req.getParameter("product");
		float price = Float.parseFloat(req.getParameter("price"));
		
		
		user.setUid(uid);
		user.setUname(uname);
		user.setProduct(product);
		user.setPrice(price);
		
		
		String result = userservice.updateUser(user);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("updateUser.jsp");
		return mav;
	}
	
	@RequestMapping(value = "searchUser",method = RequestMethod.GET)
	public ModelAndView searchuser(HttpServletRequest req) {
		int uid = Integer.parseInt(req.getParameter("uid"));
		
		String result = userservice.searchuserById(uid);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("searchUserById.jsp");
		return mav;
	}
	
	@RequestMapping(value = "finduser",method = RequestMethod.GET)
	public ModelAndView findAlluser() {
		List<User> listOfuser = userservice.getAlluser();
		ModelAndView mav = new ModelAndView();
		mav.addObject("listOfuser", listOfuser);	// requestScope.setAttribute 
		mav.setViewName("viewAllUserDetails.jsp");
		return mav;
	}
	
}
