package cn.fang.service.impl;

import cn.fang.dao.POIDao;
import cn.fang.domain.POI;
import cn.fang.service.POIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("POIService")
public class POIServiceImpl implements POIService {

    @Autowired
    private POIDao poiDao;

    @Override
    public POI getOnePOI() {
        System.out.println("Service search POI");
        return poiDao.getOnePOI();
    }
}
