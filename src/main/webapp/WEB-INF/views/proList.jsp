<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, th, td {
		border: 1px solid black;
	}
</style>
</head>
<body>
<h3>상품 목록</h3>
<table>
	<tr>
		<th>상품번호</th>
		<th>상품이름</th>
		<th>상품가격</th>
	</tr>
	<c:forEach var="vo" items="${list }">
	<tr>
		<td>${vo.pCode }</td>
		<td>${vo.pName }</td>
		<td>${vo.pPrice }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>