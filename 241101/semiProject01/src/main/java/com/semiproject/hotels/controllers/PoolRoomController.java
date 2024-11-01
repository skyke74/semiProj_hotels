package com.semiproject.hotels.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PoolRoomController {

	 @GetMapping("/poolroom1")
	    public String poolroom1() {
	        return "poolroom/poolroom1";  // oceanRoom ������ oceanroom1.jsp�� �̵�
	    }

	    // oceanroom2 �������� �̵�
	    @GetMapping("/poolroom2")
	    public String poolroom2() {
	        return "poolroom/poolroom2";  // oceanRoom ������ oceanroom2.jsp�� �̵�
	    }

	    // oceanroom3 �������� �̵�
	    @GetMapping("/poolroom3")
	    public String poolroom3() {
	        return "poolroom/poolroom3";  // oceanRoom ������ oceanroom3.jsp�� �̵�
	    }
}
