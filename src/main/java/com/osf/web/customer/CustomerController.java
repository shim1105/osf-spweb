package com.osf.web.customer;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.osf.web.service.CustomerService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class CustomerController {
	@Autowired
	private CustomerService cs;
	
	@RequestMapping(value="/customer/list", method=RequestMethod.GET)
	public String goCustomerList(Model m) {
		m.addAttribute("list", cs.selectCustomerList());
		return "/uri/customer/list";
	}
	@RequestMapping(value="/customer/da", method=RequestMethod.GET)
	public String goCustomer(Model m,HttpServletRequest request) {
		m.addAttribute("list", cs.selectCustomer(request.getParameterMap()));
		return "/uri/customer/list";
	}
	@RequestMapping(value="/customer/2ss",method=RequestMethod.POST)
	public String goInsertCustomer(@RequestParam Map user,Model m) 
	{
		m.addAttribute("list",cs.insertCustomer(user));
		return "/uri/customer/list";
	}
	
}
