package com.kq.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    //获取对象SqlSessionFactory

    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
                String resource = "mybatis-config.xml";
                InputStream inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession sqlSession(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
/*        可以设置自动提交
        return sqlSessionFactory.openSession(true);*/
        return sqlSession;
    }

}
