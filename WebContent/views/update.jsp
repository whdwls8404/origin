<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Insert title here</title>
	<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
</head>
<body>

	<form action="insertBoard.do">
		<h3>게시글 작성하기</h3>
		<p>작성자</p>
		<div><input type="text" name="author" autofocus></div>
		<p>제목</p>
		<div><input type="text" name="title" required></div>
		<p>내용</p>
		<div><textarea name="content" rows="5" cols="23"></textarea></div>
		<button>저장하기</button>
		<input type="reset" value="작성초기화">
		<input type="reset" value="목록보기" onclick="location.href='selectBoardList.do'">
	</form>
		
</body>
</html>