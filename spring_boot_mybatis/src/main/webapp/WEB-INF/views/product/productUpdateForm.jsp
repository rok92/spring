<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>상품 정보 수정</title>
	</head>
	<body>
		<h3>상품 정보 수정</h3>
		<form method="post" action="/product/updateProduct">
			<table>
				<tr><td>상품번호</td><td><input type="text" name="prdNo" value="${prd.prdNo }" readonly></td></tr>
				<tr><td>상품명</td><td><input type="text" name="prdName" value="${prd.prdName }"></td></tr>
				<tr><td>가격</td><td><input type="text" name="prdPrice" value="${prd.prdPrice }"></td></tr>
				<tr><td>제조사</td><td><input type="text" name="prdCompany" value="${prd.prdCompany }"></td></tr>
				<tr><td>재고</td><td><input type="text" name="prdStock" value="${prd.prdStock }"></td></tr>
				<tr><td>재조일</td><td><input type="text" name="prdDate" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${prd.prdDate}"/>"></td></tr>
				<tr><td colspan="2"><input type="submit" value="완료"><input type="reset" value="취소"></td></tr>
			</table>
		</form><br><br>
		
		<a href="<c:url value='/product/productAllList'/>">전체 상품 조회</a><br><br>
	</body>
</html>