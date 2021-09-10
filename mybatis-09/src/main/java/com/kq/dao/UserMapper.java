package com.kq.dao;

import com.kq.pojo.User;

import java.util.List;

public interface UserMapper {

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    List<User> queryUserById(int id);
}
