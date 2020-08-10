package com.demo.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Assert;
import org.junit.Test;

import lombok.extern.log4j.Log4j;

// 프로젝트에 build path 에 추가한 oracle db driver 를 테스트 하는 코드
// lombok 라이브러리의 log 객체를 이용한 로그출력

@Log4j
public class JDBCTests {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "ora_user";
		String password = "1234";
		try(Connection con = DriverManager.getConnection(url, user, password)){
			log.info(con);
		}catch(Exception e) {
			Assert.fail(e.getMessage());
		}
	}
}
