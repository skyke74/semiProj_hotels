package com.hotels.api01;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
import com.hotels.api01.model.ResvVo;
import com.hotels.api01.model.TourDao;
import com.hotels.api01.model.UsersDao;
import com.hotels.api01.model.UsersVo;

@RestController
public class HomeController {
	@Autowired
	DeptDao deptDao;
	@Autowired
	EmpDao empDao;
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
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public ResponseEntity<?> home() {
//		return ResponseEntity.ok(deptDao.pullList());
//	}
	@GetMapping("/hotels/list/")
	public ResponseEntity<?> hotels() {
		return ResponseEntity.ok(hotelsDao.pullList());
	}
	@GetMapping("/hotels/search/{loc}")
	public ResponseEntity<?> search(@PathVariable String loc) {
		return ResponseEntity.ok(hotelsDao.searchList(loc));
	}
	@GetMapping("/hotels/searchHotel/hotel_id={hotel_id},user_name={user_name}")
	public ResponseEntity<?> searchOne(@PathVariable int hotel_id,@PathVariable String user_name) {
		return ResponseEntity.ok(hotelsDao.searchHotel(hotel_id,user_name));
	}
	@GetMapping("/hotels/searchEmail/{email}")
	public ResponseEntity<?> searchUser(@PathVariable String email) {
		return ResponseEntity.ok(usersDao.searchEmail(email));
	}
	@GetMapping("/hotels/addUser/UsersVo(user_id=0, name={name}, email={email}, password={password}, address={address}, birth_date={birth_date})")
//	public void addUser(
	public ResponseEntity<?> addUser(
			@PathVariable String name,@PathVariable String email,@PathVariable String password,@PathVariable String address,@PathVariable Date birth_date) {
		System.out.println(name+", "+email+", "+password+", "+address+", "+birth_date);
		UsersVo bean=new UsersVo();
		bean.setName(name);
		bean.setEmail(email);
		bean.setPassword(password);
		bean.setAddress(address);
		String[] date=birth_date.toString().split("-");
		bean.setBirth_date(new Date(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2])));
		System.out.println("api01:"+bean);
		return ResponseEntity.ok(usersDao.addUser(bean));
	}
	@GetMapping("/hotels/editPW/UsersVo(user_id=0, name={name}, email={email}, password={password}, address={address}, birth_date={birth_date})")
	public ResponseEntity<?> editPW(
			@PathVariable String name,@PathVariable String password) {
		System.out.println(name+password);
		UsersVo bean=new UsersVo();
		bean.setName(name);
		bean.setPassword(password);
		return ResponseEntity.ok(usersDao.editPassword(bean));
	}

	/////////Tour
	@GetMapping("/hotels/searchTour/{loc_name}")
	public ResponseEntity<?> searchTour(@PathVariable String loc_name) {
		if(loc_name.equals("all")) {
			return ResponseEntity.ok(tourDao.searchTourAll());
		}else
			return ResponseEntity.ok(tourDao.searchTour(loc_name));
	}
	/////////Resv
	@GetMapping("/hotels/userResv/{user_id}")
	public ResponseEntity<?> userResv(@PathVariable int user_id) {
		return ResponseEntity.ok(resvDao.pullUserList(user_id));
	}
	@GetMapping("/hotels/rmResv/{reservation_id}")
	public ResponseEntity<?> rmResv(@PathVariable int reservation_id) {
		return ResponseEntity.ok(resvDao.rmResv(reservation_id));
	}
	//ResvVo(reservation_id=0, price=0 ,guest_name=null, hotel_name=null, room_info=null, image_url=null, check_in=null, check_out=null)
	@GetMapping("/hotels/addResv/{hotel_name},{guest_name},{checkin},{checkout},{room_info},{guests},{user_id}")
	public ResponseEntity<?> addResv(@PathVariable int user_id,@PathVariable String hotel_name, @PathVariable String guest_name,@PathVariable Date checkin,@PathVariable Date checkout,@PathVariable String room_info,@PathVariable int guests) {
		if(room_info.equals("1")) {
			return ResponseEntity.ok(resvDao.addResv1(hotel_name, guest_name, checkin, checkout,room_info,guests,user_id));
		}else if(room_info.equals("2")) {
			return ResponseEntity.ok(resvDao.addResv2(hotel_name, guest_name, checkin, checkout,room_info,guests,user_id));
		}else if(room_info.equals("3")) {
			return ResponseEntity.ok(resvDao.addResv3(hotel_name, guest_name, checkin, checkout,room_info,guests,user_id));
		}
		return null;
	}
	/////////Fav
	@GetMapping("/hotels/userFav/{user}")
	public ResponseEntity<?> userFav(@PathVariable String user) {
		return ResponseEntity.ok(favDao.pullUserList(user));
	}
	@GetMapping("/hotels/addFav/user_name={user_name},hotel_id={hotel_id}")
	public ResponseEntity<?> addFav(
			@PathVariable String user_name,@PathVariable int hotel_id) {
		return ResponseEntity.ok(favDao.addFav(user_name,hotel_id));
	}
	@GetMapping("/hotels/rmFav/user_name={user_name},hotel_id={hotel_id}")
	public ResponseEntity<?> rmFav(
			@PathVariable String user_name,@PathVariable int hotel_id) {
		return ResponseEntity.ok(favDao.rmFav(user_name,hotel_id));
	}
	
	/////////
	@RequestMapping(value = "/dept/", method = RequestMethod.GET)
	public ResponseEntity<?> dept() {
		return ResponseEntity.ok(deptDao.pullList());
	}
	@RequestMapping("/emp/")
	public ResponseEntity<?> home() {
		return ResponseEntity.ok(empDao.pullList());
	}
}
