package com.kq.dao;

import com.kq.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //增删改需要提交事务
    //获取全部用户数据
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //添加用户
    int addUser(User user);
    //Map形式添加用户
    int addUser2(Map<String, Object> map);
    //修改用户
    int updateUser(User user);
    //删除用户
    int deleteUser(int id);

    //limit获取数据
    List<User> userLimit (Map<String,Integer> map);
}
