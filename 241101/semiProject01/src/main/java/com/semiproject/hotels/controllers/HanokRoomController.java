package com.semiproject.hotels.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HanokRoomController {

	 @GetMapping("/hanokroom1")
	    public String hanokroom1() {
	        return "hanokroom/hanokroom1";  // oceanRoom ������ oceanroom1.jsp�� �̵�
	    }

	    // oceanroom2 �������� �̵�
	    @GetMapping("/hanokroom2")
	    public String hanokroom2() {
	        return "hanokroom/hanokroom2";  // oceanRoom ������ oceanroom2.jsp�� �̵�
	    }

	    // oceanroom3 �������� �̵�
	    @GetMapping("/hanokroom3")
	    public String hanokroom3() {
	        return "hanokroom/hanokroom3";  // oceanRoom ������ oceanroom3.jsp�� �̵�
	    }
}
