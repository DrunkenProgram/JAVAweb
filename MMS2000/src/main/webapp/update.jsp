<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
</head>
<body>
<h1>회원 정보 수정</h1>
	<form action="/update.do" method="post">
		<div>ID: ${dto.id}</div>
		PW: <input name="pw" type="password"><br>
		NAME: <input name="name" value="${dto.name}"><br>
		AGE: <input name="age" type="number" value="${dto.age}"><br>
		ADDRESS: <input name="address" value="${dto.address}"><br>
		<input type="submit" value="수정">
	</form>
</body>
</html>