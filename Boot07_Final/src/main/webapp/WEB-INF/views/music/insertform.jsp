<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>/music/insertform.jsp</title>
</head>
<body>
	<div class="container">
		<h3>mp3 파일 업로드 폼</h3>
		<form action="insert" method="post" enctype="multipart/form-data">
			<div>
				<label for="file">mp3 파일</label>
				<input type="file" name="file" id="file"/>
			</div>
			<button type="submit">업로드</button>
		</form>
	</div>
</body>
</html>