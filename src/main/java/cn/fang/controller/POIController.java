package cn.fang.controller;

import cn.fang.common.lang.Result;
import cn.fang.domain.POI;
import cn.fang.service.POIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * layer of appearance
 */


@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/POI")
public class POIController {

    @Autowired
    private POIService poiService;

    @GetMapping("/getOne")
    public Result getOne(){
        System.out.println("appearance layer search for POI");
        POI p = poiService.getOnePOI();
//        model.addAttribute("POI", Result.succ(p));
        return Result.succ(p);
    }
}
