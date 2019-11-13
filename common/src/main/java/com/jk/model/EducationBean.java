package com.jk.model;

public class EducationBean {
    private Integer educationid;

    private String educationname;

    public Integer getEducationid() {
        return educationid;
    }

    public void setEducationid(Integer educationid) {
        this.educationid = educationid;
    }

    public String getEducationname() {
        return educationname;
    }

    public void setEducationname(String educationname) {
        this.educationname = educationname == null ? null : educationname.trim();
    }

    @Override
    public String toString() {
        return "EducationBean{" +
                "educationid=" + educationid +
                ", educationname='" + educationname + '\'' +
                '}';
    }
}