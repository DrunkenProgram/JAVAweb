<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 삭제</title>
</head>
<body>
<h1>회원 삭제</h1>
<form action="/delete.do" method="post">
<input name="id" value="${id}" type="hidden">
비밀번호: <input type="password" name="pw"><br>
<input type="submit" value="삭제">
</form>
</body>
</html>