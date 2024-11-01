package com.semiproject.hotels.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PensionRoomController {

	@GetMapping("/pensionroom1")
    public String pensionroom1() {
        return "pensionroom/pensionroom1";  
    }
	
	@GetMapping("/pensionroom2")
    public String pensionroom2() {
        return "pensionroom/pensionroom2";  
    }
	
	@GetMapping("/pensionroom3")
    public String pensionroom3() {
        return "pensionroom/pensionroom3";  
    }
}
