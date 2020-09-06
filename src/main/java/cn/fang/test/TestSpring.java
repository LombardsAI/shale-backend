package cn.fang.test;

import cn.fang.service.POIService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void run1(){
        //load configuration file
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        //get object
        POIService ps = (POIService) ac.getBean("POIService");

        //use a function
        ps.getOnePOI();
    }

}
