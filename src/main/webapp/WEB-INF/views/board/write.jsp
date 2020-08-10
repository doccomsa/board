<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>글쓰기 - 입력한 데이터를 서버측에서 저장하는 클래스 BoardVO </h3>
<form action="writeOk2" method="post">
글번호 <input type="text" name="idx"><br>
제 목	<input type="text" name="title"><br>
작성자 <input type="text" name="writer"><br>
내 용 <input type="text" name="content"><br>
<input type="submit" value="글저장">
</form>
</body>
</html>