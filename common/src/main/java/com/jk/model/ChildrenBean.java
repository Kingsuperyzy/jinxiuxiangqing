package com.jk.model;

public class ChildrenBean {
    private Integer childrenid;

    private String childrenname;



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


    @Override
    public String toString() {
        return "ChildrenBean{" +
                "childrenid=" + childrenid +
                ", childrenname='" + childrenname + '\'' +
                '}';
    }
}