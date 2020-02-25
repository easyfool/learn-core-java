package com.github.wangfeng.core.serialize.v2;

import java.io.Serializable;
import java.util.List;

/**
 * 对象中包含List 和其他引用类型对象
 */
public class Teacher implements Serializable {
    private List<Student> students;
    private Teacher teacher;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
