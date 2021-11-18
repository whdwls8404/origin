<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	
	<div>
		<a href="/ReServerProgram/insertForm.do">새글작성</a>
	</div>
	
	<table border="1">
		<thead>
			<tr>
				<td>글번호</td>
				<td>제목</td>
				<td>작성자</td>
				<td>작성일</td>
				<td>조회수</td>
			</tr>
		</thead>
		<tbody>
			<c:if test="${empty list}">
				<tr>
					<td colspan="5">없음</td>
				</tr>
			</c:if>
			<c:if test="${not empty list}">
				<c:forEach items="${list}"  var="board">
					<tr>
						<td>${board.no}</td> <!-- 번호 -->
						<td><a href="views.board.no=${board.no}">${board.title}</a></td> <!-- 제목 -->
						<td>${board.ip}</td> <!-- 작성자 -->
						<td>${board.postdate}</td><!-- 작성일 -->
						<td>${board.hit}</td><!-- 조회수 -->
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	
</body>
</html>