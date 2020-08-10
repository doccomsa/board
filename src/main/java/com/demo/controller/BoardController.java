package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value = "doA", method = RequestMethod.GET)
	public void doA() {
		logger.info("doA called...");
		
		// 리턴값이 void 일 경우에는 url 매핑주소가 jsp 파일명이 된다.  jsp파일명  "/WEB-INF/views/doA.jsp"
	}
	
	@RequestMapping(value = "doB", method = RequestMethod.GET)
	public void doB() {
		logger.info("doB called...");   //  "/WEB-INF/views/doB.jsp"
	}
	
	@RequestMapping(value = "doC", method = RequestMethod.GET)
	public void doC() {
		logger.info("doC called...");   //  "/WEB-INF/views/doC.jsp"
	}
	
	@RequestMapping(value = "doD", method = RequestMethod.GET)
	public void doD() {
		logger.info("doD called...");   //  "/WEB-INF/views/doD.jsp"
	}
	
	// 요청주소와 메서드명은 이름이 상관없다.
	@RequestMapping(value = "testE", method = RequestMethod.GET)
	public void doE() {
		logger.info("doE called...");   // 리턴타입이 void 인 경우  "/WEB-INF/views/요청주소.jsp"
	}
	
	@RequestMapping("doF") // 기본 get방식 요청
	public String doF() {
		
		return "testF";  // 리턴값이 문자열인 경우에는   "/WEB-INF/views/리턴문자열.jsp"
	}
	
	
}
