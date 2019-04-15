package com.accp.service;

import com.accp.dao.StudentDao;
import com.accp.entity.Grade;
import com.accp.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACER
 * @create 2019-02-2019/2/15-13:49
 */
@Service
public class StudentServiceImpl implements StudentService{
    @Resource
    private StudentDao dao;
//    public void setDao(StudentDao dao) {
//        this.dao = dao;
//    }

    public List<Student> findAll() {
        return dao.findAll();
    }

    public String delete(int id) {
        if(dao.delete(id)>0){
            return "删除成功";
        }
        return "删除失败";
    }

    public List<Grade> findGrade() {
        return dao.findGrade();
    }

    public String insert(Student stu) {
        if(dao.insert(stu)>0){
            return "添加成功";
        }
        return "添加失败";
    }

    public Student findid(int id) {
        return dao.findid(id);
    }

    public String update(Student student) {
        if(dao.update(student)>0){
            return "修改成功";
        }
        return "修改失败";
    }
}
