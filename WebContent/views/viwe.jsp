<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

	<div>
		<form action="">
			<h3>${requestScope.board.no}번 게시글</h3>
			작성자: ${board.author}<br><br>
			작성자: ${board.postdate}<br><br>
			작성자: ${board.ip}<br><br>
			작성자: ${board.hit}<br><br>
			<label for="title">제목</label><br><br>
			<input type="text" ><br><br>
			<label for="title">내용</label><br><br>
			<textarea rows="5" cols="30" id="content" name="content" placeholder="내용"></textarea><br><br>
			<input type="button" value="삭제하기" onclick="location.href='studentList.do'">
			<input type="button" value="목록보기" onclick="location.href='boardList.do'">
			<br><hr>
			<div>
				<textarea rows="2" cols="35"  placeholder="댓글을 입력하세요"></textarea><br>
				<input type="text" placeholder="작성자">
				<input type="button" value="작성">
			</div>
		</form>
	</div>
	

</body>
</html>