package cn.fang.dao;

import cn.fang.domain.POI;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//Place of interest
@Repository
public interface POIDao {

    //get a random POI
    @Select("Select id_poi,label,description,ST_X(geo) as longitude, ST_Y(geo) as latitude,street,postalCode,locality,review,representation,type3,type4 from poi ORDER BY rand() LIMIT 1")
    public POI getOnePOI();
}
