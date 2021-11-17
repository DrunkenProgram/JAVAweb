<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록 보기</title>
</head>
<body>
	<h1>회원 목록 보기</h1>
	<table border="1" style="border-collapse: collapse;">
		<thead style="background:#66c2ff;">
			<tr>
				<th>ID</th>
				<th>NAME</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td><a href="/read.do?id=${dto.id}">${dto.id}</a></td>
					<td>${dto.name}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
</body>
</html>