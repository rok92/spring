<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>상품 검색</title>
		<script src="<c:url value='/js/jquery-3.6.0.min.js' />"></script>
		<script src="<c:url value='/js/productSearch1.js' />"></script>
	</head>
	<body>
		<h3>상품 검색</h3>
		<form id="prdSearchFrm">
			<select name="type">
				<option value="">검색조건 검색</option>
				<option value="prdName">상품명</option>
				<option value="prdCompany">제조회사</option>
			</select>
			<input type="text" name="keyword">
			<input type="submit" value="검색">
		</form>
		
		<div id="searchResultBox"></div>
		<br><br>
		<a href="<c:url value="/"/>">메인 화면으로 이동</a>	
	</body>
</html>