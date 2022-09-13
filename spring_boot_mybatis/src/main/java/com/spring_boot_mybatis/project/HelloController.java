/*
 * package com.spring_boot_mybatis.project;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.ResponseBody;
 * 
 * @Controller public class HelloController {
 * 
 * @ResponseBody
 * 
 * @RequestMapping("/") // 요청 url : http://localhost8080 public String home() {
 * System.out.println("Hello Boot!"); return "Hello Boot!"; }
 * 
 * @RequestMapping("/hello") public String hello(Model model) {
 * model.addAttribute("message", "안녕하세요"); return "hello"; // 뷰페이지 이름 :
 * hello.jsp } }
 */