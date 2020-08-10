package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.domain.BoardVO;

@Controller
@RequestMapping("/board/*")  // 공통요청주소  /board/abc,   /board/xyz
public class TestController3 {

	private static final Logger logger = LoggerFactory.getLogger(TestController3.class);
	
	//  요청주소 :   /board/write
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void writeForm() {
		
		
	}
	//  board/writeOk
	@RequestMapping(value = "writeOk", method = RequestMethod.POST)
	public String writeAction(BoardVO vo) {
			logger.info(vo.toString());
		// model.addAttribute("boardVO", vo)
		return "/board/writeResult"; // "/WEB-INF/views/board/writeResult.jsp"
	}
	
	
	// RedirectAttributes : 리다이렉트되는 주소로 파라미터값을 제공을 하고 자 할때 사용
	@RequestMapping(value = "/writeOk2", method = RequestMethod.POST)
	public String writeAction(RedirectAttributes rttr) {
			
		
		//db에 저장하는 구문.
		rttr.addAttribute("param1", "1");
		rttr.addAttribute("param2", "2");
		rttr.addFlashAttribute("msg", "success"); // 단 1회만 사용가능
		
			
		return "redirect:/board/list"; // 요청주소로 리다이렉트
	}
	
	// 요청주소   :   /board/list
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list() {
		
		return "/board/list";
	}
}
