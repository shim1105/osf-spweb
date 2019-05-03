package com.osf.web.controller;

import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.osf.web.service.AddrService;

@Controller
public class AddrController {
	@Autowired
	private AddrService as;
	@RequestMapping(value="/addr/list",method=RequestMethod.GET)  // 이렇게 하면 GET 방식 밖에 호출이 안된다 @@
	public String goAddrList(Model m) {
		m.addAttribute("addrList",as.selectAddrList());
		return "/uri/addr/list";
	}
	
}
