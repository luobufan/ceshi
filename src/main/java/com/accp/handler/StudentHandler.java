package com.accp.handler;

import com.accp.entity.Grade;
import com.accp.entity.Student;
import com.accp.service.StudentService;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

/**
 * @author ACER
 * @create 2018-12-2018/12/16-13:55
 */
@Controller
public class StudentHandler {
    @Resource
    private StudentService sss;
//    public void setSss(StudentService sss) {
//        this.sss = sss;
//    }

    @RequestMapping("/findAll")
    public String findAll(Model model, Integer page,HttpServletRequest request){
//        if(page==null){
//            page=0;
//        }
//        Page<Student> list = sss.findAll(new PageRequest(page, 5));
//        int pages = list.getTotalPages()-1;
//        List<Student> ulist = sss.findAll();
//        model.addAttribute("page",page);
//        model.addAttribute("pages",pages);
        request.getSession().setAttribute("ulist",sss.findAll());
        return "findAll";
    }
    @RequestMapping("/delete")
    public void delete(int id, HttpServletResponse response) throws IOException {
        String s = sss.delete(id);
        response.getWriter().print("<script>alert('" + s + "');location.href='findAll';</script>");
    }
    @RequestMapping("/add")
    public String add(HttpServletRequest request){
        List<Grade> list = sss.findGrade();
        request.setAttribute("listt",list);
        return "add";
    }
    @RequestMapping("/insert")
    public void  insert(Student stu,HttpServletResponse response,HttpServletRequest request) throws IOException {
      //  Student stu=new Student(request.getParameter("name"),new Grade(Integer.valueOf(request.getParameter("grade.gid"))));
        String s = sss.insert(stu);
        response.getWriter().print("<script>alert('" + s + "');" +
                "location.href='findAll';</script>");
    }
    @RequestMapping("/findid")
    public String findid(int id,HttpServletRequest request){
        Student student= sss.findid(id);
        request.setAttribute("stu",student);
        List<Grade> grade = sss.findGrade();
        request.setAttribute("gra",grade);
        return "findid";
    }
    @RequestMapping("/update")
    public void update(Student stu,HttpServletResponse response,HttpServletRequest request) throws IOException {
       // Student stu=new Student(Integer.valueOf(request.getParameter("id")),request.getParameter("name"),new Grade(Integer.valueOf(request.getParameter("grade.gid"))));
        String s = sss.update(stu);
        response.getWriter().print("<script>alert('" + s + "');location.href='findAll';</script>");
    }
}
