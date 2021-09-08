package com.kq;

import com.kq.dao.UserMapper;
import com.kq.pojo.User;
import com.kq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.sqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> getuser = mapper.getuser();
        for (User user : getuser) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    /**
     *
     */
    public void adduser(){

    }
}
