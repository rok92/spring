<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>상품 정보 상세 조회</title>
	</head>
	<body>
		<h3>상품 상세 정보 조회</h3>
			<table border="1" width="500">
				<tr><td>상품번호</td><td>${prd.prdNo }</td></tr>
				<tr><td>상품명</td><td>${prd.prdName }</td></tr>
				<tr><td>가격</td><td>${prd.prdPrice }</td></tr>
				<tr><td>제조사</td><td>${prd.prdCompany }</td></tr>
				<tr><td>재고</td><td>${prd.prdStock }</td></tr>
				<tr><td>재조일</td><td><fmt:formatDate value="${prd.prdDate}" pattern="yyyy-MM-dd"/></td></tr>
			</table><br><br>
			
			<a href="<c:url value="/"/>">메인 화면으로 이동</a><br><br>
			<a href="<c:url value='/product/productAllList'/>">전체 상품 조회</a><br><br>
			
			<!--상품 수정-->
			<a href="<c:url value='/product/productUpdateForm/${prd.prdNo }'/>">상품정보수정</a><br><br>
			<a href="javascript:deleteCheck();">상품 정보 삭제</a>
			<!--삭제 확인 메세지 출력-->
			<script>
				function deleteCheck(){
					var answer = confirm("삭제하시겠습니까?");
					if(answer == true){
						location.href="/product/deleteProduct/${prd.prdNo}";
					}
				}
			</script>
	</body>
</html>