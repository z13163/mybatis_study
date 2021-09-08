package com.test;

import com.kq.dao.TeacherMapper;
import com.kq.pojo.Teacher;
import com.kq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TeacherTest {

    @Test
    public void getTeacherById(){
        SqlSession sqlSession = MybatisUtils.sqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
