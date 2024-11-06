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
	// HOTELS
	@GetMapping("/hotels/list/")
	public ResponseEntity<?> hotels() {
		return ResponseEntity.ok(hotelsDao.pullList());
	}
	@GetMapping("/hotels/search/{loc}")
	public ResponseEntity<?> search(@PathVariable String loc) {
		return ResponseEntity.ok(hotelsDao.searchList(loc));
	}
	@GetMapping("/hotels/searchHotel/hotel_id={hotel_id},user_id={user_id}")
	public ResponseEntity<?> searchOne(@PathVariable int hotel_id,@PathVariable String user_id) {
		if(user_id.equals("null")) {
			return ResponseEntity.ok(hotelsDao.searchHotel(hotel_id));
		}else {
			return ResponseEntity.ok(hotelsDao.searchHotelUser(hotel_id,Integer.parseInt(user_id)));
		}
	}
	@GetMapping("/hotels/recomm/{type}")
	public ResponseEntity<?> pullRecomm(@PathVariable String type){
		return ResponseEntity.ok(hotelsDao.searchType(type));
	}
	
	// USER
	@GetMapping("/hotels/searchEmail/{email}")
	public ResponseEntity<?> searchUser(@PathVariable String email) {
		return ResponseEntity.ok(usersDao.searchEmail(email));
	}
	@GetMapping("/hotels/addUser/name={name},email={email},password={password},address={address},birth_date={birth_date}")
//	public void addUser(
	public ResponseEntity<?> addUser(
			@PathVariable String name,@PathVariable String email,@PathVariable String password,@PathVariable String address,@PathVariable Date birth_date) {
		System.out.println(name+", "+email+", "+password+", "+address+", "+birth_date);
		UsersVo bean=new UsersVo();
		bean.setName(name);
		bean.setEmail(email);
		bean.setPassword(password);
		bean.setAddress(address);
//		String[] date=birth_date.toString().split("-");
//		bean.setBirth_date(new Date(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2])));
		bean.setBirth_date(birth_date);
		System.out.println("api01:"+bean);
		return ResponseEntity.ok(usersDao.addUser(bean));
	}
	@GetMapping("/hotels/editPW/{pw}.{id}")
	public ResponseEntity<?> editPW(
			@PathVariable String pw,@PathVariable int id) {
		return ResponseEntity.ok(usersDao.editPassword(pw,id));
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
	@GetMapping("/hotels/addResv/{user_id},guest_name={guest_name},checkin={checkin},checkout={checkout},hotel_id={hotel_id},room_info={room_info},price={price}")
	public ResponseEntity<?> addResv(@PathVariable int user_id,@PathVariable int hotel_id, @PathVariable String guest_name,
			@PathVariable Date checkin,@PathVariable Date checkout,@PathVariable String room_info,@PathVariable int price) {
//		System.out.println(user_id+hotel_id+guest_name+checkin+checkout+room_info+price);
		if(room_info.equals("스탠다드 룸")) {
			return ResponseEntity.ok(resvDao.addResvStand(user_id,guest_name,checkin,checkout,hotel_id,price));
		}else if(room_info.equals("디럭스 룸")) {
			return ResponseEntity.ok(resvDao.addResvDelux(user_id,guest_name,checkin,checkout,hotel_id,price));
		}else{
			return ResponseEntity.ok(resvDao.addResvPrem(user_id,guest_name,checkin,checkout,hotel_id,price));
		}
	}
	@GetMapping("/hotels/update/hotel_id={hotel_id},room_info={room_info},room_count={room_count}")
	public ResponseEntity<?> updateRoomCount(@PathVariable int hotel_id,@PathVariable String room_info,@PathVariable int room_count){
		if(room_info.equals("스탠다드 룸")) {
			return ResponseEntity.ok(hotelsDao.updateStandardCount(hotel_id, room_count));
		}else if(room_info.equals("디럭스 룸")) {
			return ResponseEntity.ok(hotelsDao.updateDeluxCount(hotel_id, room_count));
		}else{
			return ResponseEntity.ok(hotelsDao.updatePremiumCount(hotel_id, room_count));
		}
	}
	/////////Fav
	@GetMapping("/hotels/userFav/{user_id}")
	public ResponseEntity<?> userFav(@PathVariable int user_id) {
		return ResponseEntity.ok(favDao.pullUserList(user_id));
	}
	@GetMapping("/hotels/addFav/user_id={user_id},hotel_id={hotel_id}")
	public ResponseEntity<?> addFav(
			@PathVariable int user_id,@PathVariable int hotel_id) {
		return ResponseEntity.ok(favDao.addFav(user_id,hotel_id));
	}
	@GetMapping("/hotels/rmFav/user_id={user_id},hotel_id={hotel_id}")
	public ResponseEntity<?> rmFav(
			@PathVariable int user_id,@PathVariable int hotel_id) {
		return ResponseEntity.ok(favDao.rmFav(user_id,hotel_id));
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
