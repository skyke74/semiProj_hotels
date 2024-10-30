package com.hotels.api01.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TourVo {
	int loc_id;
	String attraction_name,features,address,homepage,image_url,loc_name;
}
