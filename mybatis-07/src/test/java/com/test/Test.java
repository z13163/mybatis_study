package com.test;

import com.kq.dao.TeacherMapper;
import com.kq.pojo.Teacher;
import com.kq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {

    @org.junit.Test
    public void getTeacherStudent(){
        SqlSession sqlSession = MybatisUtils.sqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherStudent = mapper.getTeacherStudent(1);

        System.out.println(teacherStudent);

        sqlSession.close();
    }

    @org.junit.Test
    public void getTeacherStudent2(){
        SqlSession sqlSession = MybatisUtils.sqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherStudent2 = mapper.getTeacherStudent2(1);
        System.out.println(teacherStudent2);
        sqlSession.close();
    }
}
