package com.demo.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// 스프링에서 기본적으로 제공하는 Logger객체를 이용한 로그출력

public class JDBCTests2 {

	private static final Logger logger = LoggerFactory.getLogger(JDBCTests2.class);
	
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
		// try(AutoCloseable 인터페이스를 구현한 객체만 사용해서 자동으로 close()메서드 호출되게 하는 기능제공)
		try(Connection con = DriverManager.getConnection(url, user, password)){
			logger.info(con.toString());
		}catch(Exception e) {
			Assert.fail(e.getMessage());
		}
	}
	
	@Ignore
	@Test
	public void message() {
		logger.info("test.....");
	}
}
