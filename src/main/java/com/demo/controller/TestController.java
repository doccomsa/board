package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value = "testA", method = RequestMethod.GET)
	public String testA(String name, int age) {
		
		logger.info("당신의 이름은?" + name);
		logger.info("나이는? " + age);
		
		return "testA";
	}
	
	@RequestMapping(value = "testB", method = RequestMethod.GET)
	public String testB(@ModelAttribute("title") String title) {
		
		// 파라미터 title의 변수값을 testB.jsp페이지에 사용하고자 할때
		// request.setAttribute("title", title)
		
		return "testB";
	}
	
	@RequestMapping(value = "testC", method = RequestMethod.GET)
	public String testC(@ModelAttribute("name") String name) {
		
		return "testC";
	}
	
}
