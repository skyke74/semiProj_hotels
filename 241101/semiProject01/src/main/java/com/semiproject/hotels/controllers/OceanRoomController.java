package com.semiproject.hotels.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OceanRoomController {

    // oceanroom1 �������� �̵�
    @GetMapping("/oceanroom1")
    public String oceanroom1() {
        return "oceanroom/oceanroom1";  // oceanRoom ������ oceanroom1.jsp�� �̵�
    }

    // oceanroom2 �������� �̵�
    @GetMapping("/oceanroom2")
    public String oceanroom2() {
        return "oceanroom/oceanroom2";  // oceanRoom ������ oceanroom2.jsp�� �̵�
    }

    // oceanroom3 �������� �̵�
    @GetMapping("/oceanroom3")
    public String oceanroom3() {
        return "oceanroom/oceanroom3";  // oceanRoom ������ oceanroom3.jsp�� �̵�
    }
}
