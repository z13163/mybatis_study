package com.kq.dao;

import com.kq.pojo.User;
import com.kq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {

    @Test
    public void test(){
        //获取sqlseesion对象
        SqlSession sqlSession = MybatisUtils.sqlSession();
        try {
//        方式一 getmapper执行SQL 获取Mapper
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();
            System.out.println(userList);

            //方式二 旧方法
//        List<User> userList = sqlSession.selectList("com.mon.dao.UserMapper.getUserList");
            for(User user:userList){
                System.out.println(user);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭连接
            sqlSession.close();
        }

//        User userById = mapper.getUserById(1);
//        System.out.println(userById);
    }
    @Test
    public void getUserById(){
        //获取sqlseesion对象
        SqlSession sqlSession = MybatisUtils.sqlSession();
        //方式一 getmapper执行SQL 获取Mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        //关闭连接
        sqlSession.close();
    }


    //增删改需要提交事务commit
    @Test
    public void addUser(){
        //获取sqlseesion对象
        SqlSession sqlSession = MybatisUtils.sqlSession();
        //方式一 getmapper执行SQL 获取Mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(6,"zk6","123");
        int res = mapper.addUser(user);
        if (res>0){
            sqlSession.commit();
            System.out.println("增加成功");
        }else{
            System.out.println("增加失败");
        }
        sqlSession.close();

    }

    @Test
    public void addUser2(){
        SqlSession sqlSession = MybatisUtils.sqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userid",5);
        map.put("Name","Z");

        mapper.addUser2(map);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.sqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.updateUser(new User(6,"666","666"));
        if (res>0){
            sqlSession.commit();
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.sqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.deleteUser(6);
        if(res>0){
            sqlSession.commit();
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        sqlSession.close();
    }
}
