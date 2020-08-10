<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시물 정보</h3>
글 번호 : ${board.idx }<br>
제 목: ${board.title }<br>
작성자 : ${board.writer }<br>
내용: ${board.content }<br>
<h3>상품 정보</h3>
상품번호 : ${product.pCode }<br>
상품이름 : ${ product.pName}<br>
상품가격 : ${ product.pPrice}<br>
</body>
</html>