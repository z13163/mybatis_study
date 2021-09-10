package com.test;

import com.kq.dao.UserMapper;
import com.kq.pojo.User;
import com.kq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {


    @org.junit.Test
    public void queryUser(){
        SqlSession sqlSession = MybatisUtils.sqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.queryUserById(1);
//        测试一级缓存(默认开始一级缓存)
//        1.在一一个sql'session当中进行两次相同查询
        for (User user : users) {
            System.out.println(user);
        }
//        手动清除缓存---执行了两次查询---并改变了地址
//        sqlSession.clearCache();
        List<User> users1 = mapper.queryUserById(1);
        for (User user : users1) {
            System.out.println(user);
        }
//        检查是否相同
        System.out.println(users==users1);
//        此处从一级缓存当中读取数据
//        增删改将会自动刷新缓存,保持一致
        sqlSession.close();
    }

    /**
     * 测试二级缓存
     */
    @org.junit.Test
    public void queryUser2(){
        SqlSession sqlSession = MybatisUtils.sqlSession();
        SqlSession sqlSession1 = MybatisUtils.sqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        List<User> users = mapper.queryUserById(1);
        sqlSession.close();
        //第一次查询完成,将缓存给二级xml----发现只查询了一次
        List<User> users1 = mapper1.queryUserById(1);
        System.out.println(users==users1);

        sqlSession1.close();
    }
}
