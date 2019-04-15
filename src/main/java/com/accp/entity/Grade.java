package com.accp.entity;

/**
 * @author ACER
 * @create 2019-02-2019/2/15-13:46
 */
public class Grade {
    private int gid;
    private String gname;

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Grade(int gid) {
        this.gid = gid;
    }

//    public Grade(int gid, String gname) {
//
//        this.gid = gid;
//        this.gname = gname;
//    }
//
    public Grade() {
   }
}
