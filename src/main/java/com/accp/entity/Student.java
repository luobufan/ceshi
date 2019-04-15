package com.accp.entity;

/**
 * @author ACER
 * @create 2019-02-2019/2/15-13:46
 */

public class Student {

    private int id;
    private String name;
    private Grade grade;

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

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

//    public Student(String name, Grade grade) {
//        this.name = name;
//        this.grade = grade;
//    }
//
//    public Student(int id, String name, Grade grade) {
//        this.id = id;
//        this.name = name;
//        this.grade = grade;
//    }
//
    public Student() {
    }
}
