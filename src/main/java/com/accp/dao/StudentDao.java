package com.accp.dao;

import com.accp.entity.Grade;
import com.accp.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ACER
 * @create 2019-02-2019/2/15-13:48
 */
@Repository
public interface StudentDao {
    public List<Student> findAll();
    public int delete(int id);
    public List<Grade> findGrade();
    public int insert(Student stu);
    public Student findid(int id);
    public int update(Student student);
}
