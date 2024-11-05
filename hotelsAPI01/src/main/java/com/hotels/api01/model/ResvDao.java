package com.hotels.api01.model;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ResvDao {

	@Select("SELECT H.hotel_name,R.reservation_id,R.check_in,R.check_out,R.hotel_id,R.room_info,R.price,H.image_url1,H.image_url2,H.image_url3,R.guest_name FROM room_reservation R \n" + 
			"			JOIN hotels H ON H.hotel_id=R.hotel_id WHERE user_id=#{int}")
	List<ResvVo> pullUserList(int user_id);
	
	@Delete("DELETE FROM room_reservation WHERE  reservation_id=#{int}")
	int rmResv(int reservation_id);
	
	@Insert("INSERT INTO room_reservation\n" + 
			"			(user_id,guest_name,check_in,check_out,hotel_id,room_info,price) VALUES\n" + 
			"			(#{arg0},#{arg1},#{arg2},#{arg3},#{arg4},'½ºÅÄ´Ùµå ·ë',#{arg5})")
	int addResvStand(int user_id,String guest_name,Date checkin,Date checkout,int hotel_id,int price);
	@Insert("INSERT INTO room_reservation\n" + 
			"			(user_id,guest_name,check_in,check_out,hotel_id,room_info,price) VALUES\n" + 
			"			(#{arg0},#{arg1},#{arg2},#{arg3},#{arg4},'ÇÁ¸®¹Ì¾ö ·ë',#{arg5})")
	int addResvPrem(int user_id,String guest_name,Date checkin,Date checkout,int hotel_id,int price);
	@Insert("INSERT INTO room_reservation\n" + 
			"			(user_id,guest_name,check_in,check_out,hotel_id,room_info,price) VALUES\n" + 
			"			(#{arg0},#{arg1},#{arg2},#{arg3},#{arg4},'µð·°½º ·ë',#{arg5})")
	int addResvDelux(int user_id,String guest_name,Date checkin,Date checkout,int hotel_id,int price);

}