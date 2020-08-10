package com.demo.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository  //클래스가 DB관련 작업을 하는 것을 의미
public class BoardDAOImpl implements BoardDAO {
	
	@Inject  // 객체가 주입대상(org.mybatis.spring.SqlSessionTemplate 부모인터페이스)
	private SqlSession sqlSession;
	
	// 상수명은 관례상 대문자 명명한다.
	private static final String NS = "com.demo.mapper.BoardMapper"; 
	
	// 오라클 서버시간 확인하기 : "com.demo.mapper.BoardMapper.getTime"
	@Override
	public String getTime() {
		// select sysdate from dual 실행요청 (백그라운드에는 JDBC API 작동됨)
		return sqlSession.selectOne(NS+".getTime"); 
	}

}
