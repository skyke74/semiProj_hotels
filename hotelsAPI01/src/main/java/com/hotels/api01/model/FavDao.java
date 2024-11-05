package com.hotels.api01.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface FavDao {

	@Select("SELECT F.user_id,H.hotel_name,F.hotel_id,H.image_url1, H.image_url2, H.image_url3 FROM favorites f\n" + 
			"			JOIN hotels H ON H.hotel_id=F.hotel_id WHERE user_id=#{int}")
	List<FavVo> pullUserList(int user_id);
	
	@Insert("INSERT INTO favorites (user_id,hotel_id) VALUES\n" + 
			"	(#{arg0},#{arg1})")
	int addFav(int user_id,int hotel_id);
	
	@Delete("DELETE FROM favorites WHERE user_id=#{arg0} AND hotel_id=#{arg1}")
	boolean rmFav(int user_id,int hotel_id);

}