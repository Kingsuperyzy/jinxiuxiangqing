package com.jk.model;

public class MarriedBean {
    private Integer marriedid;

    private String marriedname;

    public Integer getMarriedid() {
        return marriedid;
    }

    public void setMarriedid(Integer marriedid) {
        this.marriedid = marriedid;
    }

    public String getMarriedname() {
        return marriedname;
    }

    public void setMarriedname(String marriedname) {
        this.marriedname = marriedname == null ? null : marriedname.trim();
    }

    @Override
    public String toString() {
        return "MarriedBean{" +
                "marriedid=" + marriedid +
                ", marriedname='" + marriedname + '\'' +
                '}';
    }
}