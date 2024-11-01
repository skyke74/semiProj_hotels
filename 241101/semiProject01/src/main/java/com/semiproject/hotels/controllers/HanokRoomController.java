package com.semiproject.hotels.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HanokRoomController {

	 @GetMapping("/hanokroom1")
	    public String hanokroom1() {
	        return "hanokroom/hanokroom1";  // oceanRoom 폴더의 oceanroom1.jsp로 이동
	    }

	    // oceanroom2 페이지로 이동
	    @GetMapping("/hanokroom2")
	    public String hanokroom2() {
	        return "hanokroom/hanokroom2";  // oceanRoom 폴더의 oceanroom2.jsp로 이동
	    }

	    // oceanroom3 페이지로 이동
	    @GetMapping("/hanokroom3")
	    public String hanokroom3() {
	        return "hanokroom/hanokroom3";  // oceanRoom 폴더의 oceanroom3.jsp로 이동
	    }
}
