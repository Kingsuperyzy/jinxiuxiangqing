package com.jk.model;

public class ChildrenBean {
    private Integer childrenid;

    private String childrenname;

    private Integer userid;

    public Integer getChildrenid() {
        return childrenid;
    }

    public void setChildrenid(Integer childrenid) {
        this.childrenid = childrenid;
    }

    public String getChildrenname() {
        return childrenname;
    }

    public void setChildrenname(String childrenname) {
        this.childrenname = childrenname == null ? null : childrenname.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}