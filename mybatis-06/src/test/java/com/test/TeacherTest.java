package com.test;

import com.kq.dao.StudentMapper;
import com.kq.dao.TeacherMapper;
import com.kq.pojo.Student;
import com.kq.pojo.Teacher;
import com.kq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TeacherTest {

    @Test
    public void getTeacherById(){
        SqlSession sqlSession = MybatisUtils.sqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }


    @Test
    public void getStudentAndTeacher(){
        SqlSession sqlSession = MybatisUtils.sqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }

    @Test
    public void getStudentAndTeacher2(){
        SqlSession sqlSession = MybatisUtils.sqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student2 = mapper.getStudent2();
        for (Student student : student2) {
            System.out.println(student);
        }
    }
}
