<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>결과</h3>
글번호 ${boardVO.idx }<br>
제 목 ${boardVO.title }<br>
작성자 ${ boardVO.writer}<br>
내 용 ${ boardVO.content}<br>
</body>
</html>