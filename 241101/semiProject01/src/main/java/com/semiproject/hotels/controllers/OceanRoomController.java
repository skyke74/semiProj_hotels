package com.semiproject.hotels.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OceanRoomController {

    // oceanroom1 페이지로 이동
    @GetMapping("/oceanroom1")
    public String oceanroom1() {
        return "oceanroom/oceanroom1";  // oceanRoom 폴더의 oceanroom1.jsp로 이동
    }

    // oceanroom2 페이지로 이동
    @GetMapping("/oceanroom2")
    public String oceanroom2() {
        return "oceanroom/oceanroom2";  // oceanRoom 폴더의 oceanroom2.jsp로 이동
    }

    // oceanroom3 페이지로 이동
    @GetMapping("/oceanroom3")
    public String oceanroom3() {
        return "oceanroom/oceanroom3";  // oceanRoom 폴더의 oceanroom3.jsp로 이동
    }
}
