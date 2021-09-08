package com.kq.dao;

import com.kq.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

    Teacher getTeacherStudent(@Param("tid") int id);
    Teacher getTeacherStudent2(@Param("tid") int id);
}
