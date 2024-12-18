package com.hotels.api01;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotels.api01.model.DeptDao;
import com.hotels.api01.model.DeptVo;
import com.hotels.api01.model.EmpDao;
import com.hotels.api01.model.FavDao;
import com.hotels.api01.model.FavVo;
import com.hotels.api01.model.HotelsDao;
import com.hotels.api01.model.ResvDao;
import com.hotels.api01.model.TourDao;
import com.hotels.api01.model.UsersDao;
import com.hotels.api01.model.UsersVo;
//test
@Controller
public class testController {
	@Autowired
	HotelsDao hotelsDao;
	@Autowired
	UsersDao usersDao;
	@Autowired
	ResvDao resvDao;
	@Autowired
	FavDao favDao;
	@Autowired
	TourDao tourDao;

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("result",hotelsDao.pullList());
		return "home";
	}
	
}
