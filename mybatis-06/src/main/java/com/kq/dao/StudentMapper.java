package com.kq.dao;

import com.kq.pojo.Student;

import java.util.List;

public interface StudentMapper {

    //查询所有的学生信息，带老师
    List<Student> getStudent();

    List<Student> getStudent2();
}
