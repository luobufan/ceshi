package com.accp.service;

import com.accp.entity.Grade;
import com.accp.entity.Student;

import java.util.List;

/**
 * @author ACER
 * @create 2019-02-2019/2/15-13:48
 */

public interface StudentService {
    public List<Student> findAll();
    public String  delete(int id);
    public List<Grade> findGrade();
    public String insert(Student stu);
    public Student findid(int id);
    public String update(Student student);
}
