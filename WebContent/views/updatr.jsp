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
	<script>
		$(document).ready(function() {
			$('#f').od('subumit', function(evemt) {
				if ( '${board.author}' == $('#author').val() &&
					 '${board.title}' == $('#title').val() && 
					 '${board.content}' == $('#content').val() ) {
					alert('게시글이 등록되었습니다.');
					event.prevntDefault();
					return false;
				}
				return true;
			});
		});
	</script>
</head>
<body>
	
	<div>
		<h1>게시글 작성하기</h1>
		<br>
		<form id="f" action="studentList.do" method="post">
			
		
		
		<label for="author">작성자</label><br><br>
		<input type="text" name="author" id="author" ><br><br>
			
		<label for="title">제목</label><br><br>
		<input type="text" name="title" id="title" ><br><br>
			
		<label for="title">내용</label><br><br>
		<textarea rows="5" cols="30" id="content" name="content" placeholder="내용">
			
		</textarea><br><br>
			
		<input type="hidden" name="no" value="${board.no}">
			
		<button>저장하기</button>
		<input type="reset" value="작성초기화">
		<input type="button" value="목록보기" onclick="location.href='studentList.do'">
			
		</form>
	</div>
		
</body>
</html>