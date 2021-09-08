package com.kq.pojo;

public class Student {

    private int id;
    private String name;
    //学生有一个老师，所以不这样写
    private int tid;
    private Teacher teacher;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student(int id, String name, int tid, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.tid = tid;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tid=" + tid +
                ", teacher=" + teacher +
                '}';
    }
}
