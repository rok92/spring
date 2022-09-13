/**
 * prdNoCheck.js
 */
 
 $(document).ready(function(){
 	$('#prdCheckBtn').on('click', function(){
 	
 		// 버튼 클릭 이벤트 기본기능 : 페이지 새로 고침
 		// 기본 기능 중단
 		event.preventDefault();
 		
 		if($('#prdNo').val() == ""){
 			alert("상품번호를 입력해주세요.");
 			return false;
 		}else{
	 		$.ajax({
	 			type:"post",
	 			url:"/product/prdNoCheck",
	 			data:{"prdNo":$('#prdNo').val()},
	 			dataType:"text",
	 			success:function(result){
	 				// 성공 시 수행되는 함수 
	 				// 반환되는 값을  result로 받음
	 				if(result == "no_use") {
	 					alert( "사용 불가능한 상품번호 입니다.");
	 					// 포워딩
	 				} else
	 					alert("사용 가능한 상품번호 입니다.");
	 				
	 			},
	 			error:function(){
	 				// 오류있을 경우 수행되는 함수
	 				alert("전송 실패");
	 			}
 			
 		});
 		}
 	});
 });