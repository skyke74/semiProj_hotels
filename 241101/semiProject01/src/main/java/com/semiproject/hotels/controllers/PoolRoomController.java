package com.semiproject.hotels.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PoolRoomController {

	 @GetMapping("/poolroom1")
	    public String poolroom1() {
	        return "poolroom/poolroom1";  // oceanRoom 폴더의 oceanroom1.jsp로 이동
	    }

	    // oceanroom2 페이지로 이동
	    @GetMapping("/poolroom2")
	    public String poolroom2() {
	        return "poolroom/poolroom2";  // oceanRoom 폴더의 oceanroom2.jsp로 이동
	    }

	    // oceanroom3 페이지로 이동
	    @GetMapping("/poolroom3")
	    public String poolroom3() {
	        return "poolroom/poolroom3";  // oceanRoom 폴더의 oceanroom3.jsp로 이동
	    }
}
