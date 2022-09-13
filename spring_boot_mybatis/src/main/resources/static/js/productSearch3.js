/**
 * productSearch1.jsp
 */
 
 $(document).ready(function(){

 	$('#prdSearchFrm3').on('submit', function(){
 	
 		// submit 이벤트 기본 기능 : 페이지 새로 고침
 		// 기본 기능 중단
 		event.preventDefault();
 		
 		//serialize() : 폼에 입력한 값들을 쿼리 스트링 방식의 데이터로 변환
 		// type=prdName&keywork=노트북
 		var formData = $(this).serialize();
 		
 		$.ajax({
 			type:"post",
 			url:"productSearch3", // /mybatis/product/productSearch3
 			data:formData,
 			success:function(result){ // 컨트롤러에서 반환한 prdList를 result가 받음
 			// 반환된 결과를 searchResultBox <div>에 테이블 형태로 출력
 			$('#searchResultBox').empty();
 			$('#searchResultBox').append('<table id="resultTable" border="1" width="600">' +
 																  '<tr><th>상품번호</th><th>상품명</th><th>상품가격</th>' + 	
																  '<th>제조회사</th><th>재고</th><th>제조일</th><th>사진</th></tr>');
 			if(result == "") {
 				$('#resultTable').append('<tr align="center"><td colspan="7">찾는 상품이 없습니다</td></tr>');
 			}else {
 			
 				for(var i=0; i<result.length; i++){ 					
 					$('#resultTable').append('<tr><td>' + result[i].prdNo + '</td><td>' + 
 																						 result[i].prdName + '</td><td>' + 
 																						 result[i].prdPrice + '</td><td>' + 
 																						 result[i].prdCompany + '</td><td>' + 
 																						 result[i].prdStock + '</td><td>' + 
 																						 new Date(result[i].prdDate).toLocaleDateString('en-CA') + '</td><td>' + 
 						'<img src="/mybatis/images/' + result[i].prdNo + '.PNG" width="30" height="20"></td></tr>');
 				}
 			}
 			
 			$('#resultTable').append('</table>');
 			},
 			error:function(){
 				// 오류있을 경우 수행되는 함수
 				alert("전송 실패");
 			},
 			complete:function(){
 				//alert("작업완료");
 			}			
 		}); 	// ajax 끝
 	}); // submit 끝 
 });  // ready 끝