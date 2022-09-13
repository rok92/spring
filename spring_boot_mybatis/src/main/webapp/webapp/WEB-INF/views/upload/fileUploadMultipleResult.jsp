<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		
		다음의 파일을 업로드 하였습니다<br>
		C:\springWorkspace\upload 폴더에서 확인하세요.<br><br>
		<c:forEach items="${originalFileNameList }" var="originList">
			${originList }<br>
		</c:forEach>
	</body>
</html>