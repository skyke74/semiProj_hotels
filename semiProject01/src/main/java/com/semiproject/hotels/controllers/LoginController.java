package com.semiproject.hotels.controllers;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.semiproject.hotels.model.FavVo;
import com.semiproject.hotels.model.HotelsVo;
import com.semiproject.hotels.model.ResvVo;
import com.semiproject.hotels.model.UsersVo;

@Controller
@RequestMapping("/")
public class LoginController {
	
	String url="http://localhost:8080/api01/";

	@GetMapping("login")
	public String login() {
		return "login/login";
	}
	@GetMapping("login_")
	public String login(Model model,@RequestParam String redr) {
		model.addAttribute("redr", redr);
		return "login/login";
	}
	@PostMapping("login/access")
	public String loginPOST(HttpSession session,Model model, String email) {
		System.out.println(email);
		RestTemplate template=new RestTemplate();
		UsersVo list=(UsersVo) template.getForObject(url+"hotels/searchEmail/"+email, UsersVo.class);
		model.addAttribute("list", list);
		System.out.println(list);
		if(list==null) {
			model.addAttribute("redr", email);
			return "redirect:/login_";
		}
		session.setAttribute("email", email);
		session.setAttribute("pw", list.getPassword());
		session.setAttribute("bd", list.getBirth_date());
		String[] user=email.split("@");
		session.setAttribute("user", user[0]);
		session.setAttribute("user_id", list.getUser_id());
		return "redirect:/mypage";
	}
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	@GetMapping("mypage")
	public String mypage(Model model,HttpSession session) {
		int user_id=(int) session.getAttribute("user_id");
		RestTemplate template=new RestTemplate();
		List<ResvVo> resvList=template.getForObject(url+"hotels/userResv/"+session.getAttribute("user_id"), List.class);
		model.addAttribute("resvList", resvList);
		
		List<FavVo> favList=template.getForObject(url+"hotels/userFav/"+user_id, List.class);
		model.addAttribute("favList", favList);
		return "my/mypage";
	}
	@PostMapping("addResv")
	public String reserv(Model model,HttpSession Session,@ModelAttribute ResvVo bean) {
		System.out.println(bean);
		RestTemplate template=new RestTemplate();
		int list=template.getForObject(url+"hotels/addResv/"+bean, int.class);
		return "redirect:/mypage";
	}
	@PostMapping("rmResv/{reservation_id}")
	public String rmResv(@PathVariable int reservation_id) {
		System.out.println(reservation_id);
		RestTemplate template=new RestTemplate();
		int result=template.getForObject(url+"hotels/rmResv/"+reservation_id, int.class);
		System.out.println(result);
		return null;
	}
	@GetMapping("signup")
	public String signup() {
		return "login/signup";
	}
	@PostMapping("signup/new")
	public String signupNew(@ModelAttribute UsersVo bean) {
		System.out.println(bean);
		RestTemplate template=new RestTemplate();
		int result=template.getForObject(url+"hotels/addUser/name="+bean.getName()+",email="+bean.getEmail()+",password="+bean.getPassword()+",address="+bean.getAddress()+",birth_date="+bean.getBirth_date(), int.class);
		System.out.println(result);
		return "redirect:/login";
	}
	@GetMapping("changePW")
	public String changePW() {
		return "my/changePW";
	}
	@PostMapping("changePW/set")
	public String changePW(HttpSession session,String new_password) {
		int user_id=(int) session.getAttribute("user_id");
		RestTemplate template=new RestTemplate();
		boolean result=template.getForObject(url+"hotels/editPW/"+new_password+"."+user_id, boolean.class);
		if(result) {session.setAttribute("pw", new_password);}
		return null;
	}
}

