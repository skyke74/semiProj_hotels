package com.semiproject.hotels.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HotelsVo {
	int user_id,hotel_id,loc_id,star_rating,standard_r,deluxe_r,premium_r,standard_price,deluxe_price,premium_price,amenity_id;
	String user_name,hotel_name,contact_number,homepage_url,address,image_url1,image_url2,image_url3,image_urls,image_urlp,image_urld,amenities,loc_name,typeH;
}
