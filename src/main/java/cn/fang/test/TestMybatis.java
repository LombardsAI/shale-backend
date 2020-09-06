package cn.fang.test;

import cn.fang.dao.POIDao;
import cn.fang.domain.POI;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.apache.ibatis.io.Resources;

import java.io.InputStream;

public class TestMybatis {

    @Test
    public void run1() throws Exception{
        //load configuration file
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //create SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //create SqlSession
        SqlSession session = factory.openSession();
        //get agent object
        POIDao dao = session.getMapper(POIDao.class);
        //get a POI
        POI p = dao.getOnePOI();
        System.out.println(p);
        session.close();
        in.close();
    }
}
