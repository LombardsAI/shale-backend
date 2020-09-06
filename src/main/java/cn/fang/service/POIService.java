package cn.fang.service;

import cn.fang.domain.POI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface POIService {

    //get a random POI
    public POI getOnePOI();

}
