package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.domain.BoardVO;
import com.demo.domain.ProductVO;

@Controller
public class TestController2 {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController2.class);
	
	// @RequestMapping(value = "요청주소", method = 요청방식) : 클라이언트(브라우저)
	// <a href="요청주소">상품목록</a>
	
	/* Model과 @ModelAttribute 차이 */
	// 메서드(Model model) : model객체를 파라미터로 사용하는 경우는  jsp에서 데이터를 사용할 때
	// 메서드(@ModelAttribute("이름") String name) : name 파라미터의 값을 jsp 에서 사요할 때
	@RequestMapping(value = "content", method = RequestMethod.GET)
	public String boardViewByIdx(Model model) {
		
		// db연동
		
		BoardVO vo = new BoardVO(1, "노인과바다", "헤밍웨이", "바다가 좋다"); 
		model.addAttribute("board", vo); // request.setAttribute("board", vo) 유사하다.
		ProductVO vo2 = new ProductVO(1000, "TV", 10000);
		model.addAttribute("product", vo2);
		
		 //  boardView.jsp 파일에서 "board", "product" 이름을 각각 정보를 참조할 수가 있다.
		return "boardView";  
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String productList(Model model) {
		
		List<ProductVO> pList = new ArrayList<>();
		
		for(int i=1; i<+10; i++) {
			ProductVO vo = new ProductVO(1000 + i, "상품" + i, 10000 + (i * 100));
			pList.add(vo);
		}
		
		model.addAttribute("list", pList); // "list" 안에 ProductVO 정보가 10개가 저장
		return "proList"; // proList.jsp에서 "list" 안의 상품목록 데이타를 사용할수 가 있다.
	}

}
