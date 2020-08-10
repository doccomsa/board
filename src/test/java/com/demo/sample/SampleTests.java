package com.demo.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

// 의존성 주입 테스트 예제. DI 학습

@RunWith(SpringJUnit4ClassRunner.class) // 스프링 시스템에서 실행하는 클래스 파일을 의미함.
/* root-context.xml 의 <context:component-scan base-package="com.demo.sample" /> 
구문분석해서 해당 패키지의 클래스를 Bean 으로 생성, 스프링 컨테이너에 등록. DI(의존서 주입)으로 사용한다. 
*/
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {

	
	@Setter(onMethod_ = {@Autowired})
	private Restaurant restaurant;
	
	
	@Test
	public void testExist() {
		
		 // JUnit 에서 제공하는 메서드로, restaurant 객체가 생성되어 있는지를 확인하는 기능
		assertNotNull(restaurant); 

		log.info(restaurant); // 객체의 toString()메서드 호출하여, 로그로 출력한다.
		
		log.info("-----------------------------------------");
		
		log.info(restaurant.getChef()); // getter메서드 호출 로그로 출력한다.
		
	}
	
}
