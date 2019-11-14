package com.jk.model;

public class ChildrenBean {
    private Integer childrenId;

    private String childrenName;


    public Integer getChildrenId() {
        return childrenId;
    }

    public void setChildrenId(Integer childrenId) {
        this.childrenId = childrenId;
    }

    public String getChildrenName() {
        return childrenName;
    }

    public void setChildrenName(String childrenName) {
        this.childrenName = childrenName;
    }


    @Override
    public String toString() {
        return "ChildrenBean{" +
                "childrenId=" + childrenId +
                ", childrenName='" + childrenName + '\'' +
                '}';
    }
}