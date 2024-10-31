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

	@Select("SELECT R.reservation_id,R.check_in,R.check_out,R.hotel_name,R.room_info,R.price,H.image_url,R.guests FROM room_reservation R\n" + 
			"JOIN hotels H ON H.hotel_name=R.hotel_name WHERE user_id=#{int}")
	List<ResvVo> pullUserList(int user_id);
	@Delete("DELETE FROM room_reservation WHERE  reservation_id=#{int}")
	int rmResv(int reservation_id);
	
	@Insert("INSERT INTO room_reservation\n" + 
			"(user_id,guest_name,check_in,check_out,hotel_name,room_info,price,guests) VALUES\n" + 
			"(#{arg6},#{arg1},#{arg2},#{arg3},#{arg0},#{arg4},\n" + 
			"(SELECT standard_price FROM Hotels WHERE hotel_name = #{arg0}),#{arg5});")
	int addResv1(String hotel_name,String guest_name,Date checkin,Date checkout,String room_info,int guests,int user_id);
	@Insert("INSERT INTO room_reservation\n" + 
			"(user_id,guest_name,check_in,check_out,hotel_name,room_info,price,guests) VALUES\n" + 
			"(#{arg6},#{arg1},#{arg2},#{arg3},#{arg0},#{arg4},\n" + 
			"(SELECT deluxe_price FROM Hotels WHERE hotel_name = #{arg0}),#{arg5});")
	int addResv2(String hotel_name,String guest_name,Date checkin,Date checkout,String room_info,int guests,int user_id);
	@Insert("INSERT INTO room_reservation\n" + 
			"(user_id,guest_name,check_in,check_out,hotel_name,room_info,price,guests) VALUES\n" + 
			"(#{arg6},#{arg1},#{arg2},#{arg3},#{arg0},#{arg4},\n" + 
			"(SELECT premium_price  FROM Hotels WHERE hotel_name = #{arg0}),#{arg5});")
	int addResv3(String hotel_name,String guest_name,Date checkin,Date checkout,String room_info,int guests,int user_id);

}