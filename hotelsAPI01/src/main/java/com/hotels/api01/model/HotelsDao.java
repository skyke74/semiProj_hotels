package com.hotels.api01.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface HotelsDao {

	@Select("SELECT H.hotel_id, H.hotel_name, L.loc_name, H.star_rating, H.contact_number,\n" + 
			"			H.address, GROUP_CONCAT(A.amenity_name SEPARATOR ', ') AS amenities, H.image_url1, H.image_url2, H.image_url3, H.homepage_url\n" + 
			"			FROM Hotels H\n" + 
			"			JOIN HotelAmenities HA ON H.hotel_id = HA.hotel_id\n" + 
			"			JOIN Amenities A ON HA.amenity_id = A.amenity_id\n" + 
			"			JOIN Location L ON H.loc_id = L.loc_id\n" + 
			"			GROUP BY H.hotel_id, H.hotel_name, L.loc_name, H.star_rating, H.contact_number, H.address, H.image_url1, H.image_url2, H.image_url3, H.homepage_url;")
	List<HotelsVo> pullList();

	@Select("SELECT \n" + 
			"			    H.hotel_id, \n" + 
			"			    H.hotel_name, \n" + 
			"			    L.loc_name,  \n" + 
			"			    H.contact_number, \n" + 
			"			    H.address,\n" + 
			"			    GROUP_CONCAT(A.amenity_name SEPARATOR ', ') AS amenities,\n" + 
			"			    H.image_url1, \n" + 
			"			    H.image_url2, \n" + 
			"			    H.image_url3, \n" + 
			"			    H.homepage_url, \n" + 
			"			    f.user_id           \n" + 
			"			FROM Hotels H\n" + 
			"			JOIN HotelAmenities HA ON H.hotel_id = HA.hotel_id\n" + 
			"			JOIN Amenities A ON HA.amenity_id = A.amenity_id\n" + 
			"			JOIN Location L ON H.loc_id = L.loc_id \n" + 
			"			LEFT JOIN favorites f ON H.hotel_id = f.hotel_id \n" + 
			"			LEFT JOIN users u ON f.user_id = u.user_id WHERE L.loc_name=#{String}\n" + 
			"			GROUP BY H.hotel_id,\n" + 
			"			         f.user_id,\n" + 
			"			         H.hotel_name,  \n" + 
			"			         L.loc_name, \n" + 
			"			         H.contact_number,  \n" + 
			"			         H.address, \n" + 
			"			         H.image_url1, \n" + 
			"			         H.image_url2, \n" + 
			"			         H.image_url3, \n" + 
			"			         H.homepage_url")
	List<HotelsVo> searchList(String loc);
	
	@Select("SELECT \n" + 
			"			    H.hotel_id, \n" + 
			"			    H.hotel_name, \n" + 
			"			    L.loc_name,  \n" + 
			"			    H.contact_number, \n" + 
			"			    H.address,\n" + 
			"			    GROUP_CONCAT(A.amenity_name SEPARATOR ', ') AS amenities,\n" + 
			"			    H.image_url1, \n" + 
			"			    H.image_url2, \n" + 
			"			    H.image_url3, \n" + 
			"			    H.homepage_url, \n" + 
			"			    f.user_id           \n" + 
			"			FROM Hotels H\n" + 
			"			JOIN HotelAmenities HA ON H.hotel_id = HA.hotel_id\n" + 
			"			JOIN Amenities A ON HA.amenity_id = A.amenity_id\n" + 
			"			JOIN Location L ON H.loc_id = L.loc_id \n" + 
			"			LEFT JOIN favorites f ON H.hotel_id = f.hotel_id \n" + 
			"			LEFT JOIN users u ON f.user_id = u.user_id WHERE H.typeH=#{String}\n" + 
			"			GROUP BY H.hotel_id,\n" + 
			"			         f.user_id,\n" + 
			"			         H.hotel_name,  \n" + 
			"			         L.loc_name, \n" + 
			"			         H.contact_number,  \n" + 
			"			         H.address, \n" + 
			"			         H.image_url1, \n" + 
			"			         H.image_url2, \n" + 
			"			         H.image_url3, \n" + 
			"			         H.homepage_url")
	List<HotelsVo> searchType(String type);
	
	@Select("SELECT \n" + 
			"			    H.hotel_id, \n" + 
			"			    H.hotel_name, \n" + 
			"			    L.loc_name, \n" + 
			"			    H.star_rating,  \n" + 
			"			    H.standard_price,      \n" + 
			"			    H.deluxe_price,          \n" + 
			"			    H.premium_price,         \n" + 
			"			    H.standard_r,  \n" + 
			"			    H.deluxe_r,      \n" + 
			"			    H.premium_r,     \n" + 
			"			    H.contact_number, \n" + 
			"			    H.address, \n" + 
			"			    GROUP_CONCAT(A.amenity_name SEPARATOR ', ') AS amenities,\n" + 
			"			    H.image_url1, \n" + 
			"			    H.image_url2, \n" + 
			"			    H.image_url3, \n" + 
			"			    H.image_urls, \n" + 
			"			    H.image_urlp, \n" + 
			"			    H.image_urld, \n" + 
			"			    H.homepage_url,\n" + 
			"			    f.user_id         \n" + 
			"			FROM Hotels H \n" + 
			"			JOIN HotelAmenities HA ON H.hotel_id = HA.hotel_id\n" + 
			"			JOIN Amenities A ON HA.amenity_id = A.amenity_id\n" + 
			"			JOIN Location L ON H.loc_id = L.loc_id\n" + 
			"			LEFT JOIN favorites f ON H.hotel_id = f.hotel_id \n" + 
			"			LEFT JOIN users u ON f.user_id = u.user_id WHERE H.hotel_id=#{arg0}\n" + 
			"			GROUP BY H.hotel_id, \n" + 
			"			         f.user_id,\n" + 
			"			         H.hotel_name, \n" + 
			"			         L.loc_name, \n" + 
			"			         H.star_rating, \n" + 
			"			         H.standard_price,  \n" + 
			"			         H.deluxe_price, \n" + 
			"			         H.premium_price, \n" + 
			"			         H.standard_r, \n" + 
			"			         H.deluxe_r, \n" + 
			"			         H.premium_r, \n" + 
			"			         H.contact_number, \n" + 
			"			         H.address, \n" + 
			"			         H.image_url1, \n" + 
			"			         H.image_url2, \n" + 
			"			         H.image_url3, \n" + 
			"			    	 H.image_urls, \n" + 
			"			    	 H.image_urlp, \n" + 
			"			    	 H.image_urld, \n" + 
			"			         H.homepage_url")
	HotelsVo searchHotel(int hotel_id);
	
	@Select("SELECT * FROM (\n" + 
			"			SELECT \n" + 
			"			    H.hotel_id, \n" + 
			"			    H.hotel_name, \n" + 
			"			    L.loc_name, \n" + 
			"			    H.star_rating,  \n" + 
			"			    H.standard_price,      \n" + 
			"			    H.deluxe_price,          \n" + 
			"			    H.premium_price,         \n" + 
			"			    H.standard_r,  \n" + 
			"			    H.deluxe_r,      \n" + 
			"			    H.premium_r,     \n" + 
			"			    H.contact_number, \n" + 
			"			    H.address, \n" + 
			"			    GROUP_CONCAT(A.amenity_name SEPARATOR ', ') AS amenities,\n" + 
			"			    H.image_url1, \n" + 
			"			    H.image_url2, \n" + 
			"			    H.image_url3,\n" + 
			"			         H.image_urls, \n" + 
			"			         H.image_urlp, \n" + 
			"			         H.image_urld,  \n" + 
			"			    H.homepage_url,\n" + 
			"			    f.user_id         \n" + 
			"			FROM Hotels H \n" + 
			"			JOIN HotelAmenities HA ON H.hotel_id = HA.hotel_id\n" + 
			"			JOIN Amenities A ON HA.amenity_id = A.amenity_id\n" + 
			"			JOIN Location L ON H.loc_id = L.loc_id\n" + 
			"			LEFT JOIN favorites f ON H.hotel_id = f.hotel_id \n" + 
			"			LEFT JOIN users u ON f.user_id = u.user_id WHERE H.hotel_id=#{arg0}\n" + 
			"			GROUP BY H.hotel_id, \n" + 
			"			         f.user_id,\n" + 
			"			         H.hotel_name, \n" + 
			"			         L.loc_name, \n" + 
			"			         H.star_rating, \n" + 
			"			         H.standard_price,  \n" + 
			"			         H.deluxe_price, \n" + 
			"			         H.premium_price, \n" + 
			"			         H.standard_r, \n" + 
			"			         H.deluxe_r, \n" + 
			"			         H.premium_r, \n" + 
			"			         H.contact_number, \n" + 
			"			         H.address, \n" + 
			"			         H.image_url1, \n" + 
			"			         H.image_url2, \n" + 
			"			         H.image_url3,\n" + 
			"			         H.image_urls, \n" + 
			"			         H.image_urlp, \n" + 
			"			         H.image_urld,  \n" + 
			"			         H.homepage_url) SE \n" + 
			"						WHERE SE.user_id=#{arg1} or SE.user_id IS null")
	HotelsVo searchHotelUser(int hotel_id,int user_id);
	
	@Update("UPDATE hotels SET standard_r=#{arg1} WHERE hotel_id=#{arg1};")
	boolean updateStandardCount(int hotel_id,int roomcount);
	@Update("UPDATE hotels SET deluxe_r=#{arg1} WHERE hotel_id=#{arg1};")
	boolean updateDeluxCount(int hotel_id,int roomcount);
	@Update("UPDATE hotels SET premium_r=#{arg1} WHERE hotel_id=#{arg1};")
	boolean updatePremiumCount(int hotel_id,int roomcount);
}
	