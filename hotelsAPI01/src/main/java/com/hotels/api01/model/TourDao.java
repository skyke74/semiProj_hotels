package com.hotels.api01.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TourDao {

	@Select("SELECT TA.attraction_name, L.loc_name, TA.features, TA.address, TA.homepage, TA.image_url\n" + 
			"FROM TouristAttractions TA\n" + 
			"JOIN Location L ON L.loc_id = TA.Loc_id WHERE L.loc_name=#{String}")
	List<TourVo> searchTour(String loc_name);
	@Select("SELECT TA.attraction_name, L.loc_name, TA.features, TA.address, TA.homepage, TA.image_url\n" + 
			"FROM TouristAttractions TA\n" + 
			"JOIN Location L ON L.loc_id = TA.Loc_id")
	List<TourVo> searchTourAll();
}