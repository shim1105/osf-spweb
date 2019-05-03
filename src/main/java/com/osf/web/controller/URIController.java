package com.osf.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class URIController {

	@RequestMapping(value="/uri/**",method=RequestMethod.GET) // 이것은 **를 해야지 폴더가 몇개라도 상관없음 .
	public String goPage(HttpServletRequest requset) {
		
		
		return requset.getRequestURI();
	}
	
}
