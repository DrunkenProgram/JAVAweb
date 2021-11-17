<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보자세히보기</title>
</head>
<body>

	<h1>회원정보 자세히 보기</h1>

	ID: ${dto.id}<br> 
	AGE: ${dto.age}<br> 
	NAME: ${dto.name}<br> 
	ADDRESS: ${dto.address}<br> 
	

	<a href="/updateui.do?id=${dto.id}">수정</a>
	<a href="/deleteui.do?id=${dto.id}">삭제</a>
	<a href="/list.do">목록</a>

</body>
</html>