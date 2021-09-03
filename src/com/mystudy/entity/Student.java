package com.mystudy.entity;

public class Student {
    private int sid;
    private String sname;
    private int sage;
    private String ssex;
    private String semail;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public Student(int sid, String sname, int sage, String ssex, String semail) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
        this.ssex = ssex;
        this.semail = semail;
    }

    public Student() {
    }
}
