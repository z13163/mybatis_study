package com.kq.dao;

import com.kq.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user.mybatis_tb")
    List<User> getuser();
}
