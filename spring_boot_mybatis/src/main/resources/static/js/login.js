/**
 * login.js
 */
 
 $(document).ready(function(){

 	$('#frmLogin').on('submit', function(){
 	
 		// submit 이벤트 기본 기능 : 페이지 새로 고침
 		// 기본 기능 중단
 		event.preventDefault();
 		
 		var userId = $('#user_id').val();
 		var userPw = $('#user_pw').val();
 		
 		$.ajax({
 			type:"post",
 			url:"login",
 			data:{"id":userId,
 						"pw":userPw},
 			dataType:"text",
 			success:function(result){
 				// 성공 시 수행되는 함수 
 				// 반환되는 값을  result로 받음
 				if(result == "success")
 					message = "로그인 성공";
 				else
 					message = "로그인 실패";
 					
 				alert(message);
 			},
 			error:function(){
 				// 오류있을 경우 수행되는 함수
 				alert("전송 실패");
 			},
 			complete:function(){
 				alert("작업완료");
 			}			
 		}); 	// ajax 끝
 	}); // submit 끝 
 });  // ready 끝