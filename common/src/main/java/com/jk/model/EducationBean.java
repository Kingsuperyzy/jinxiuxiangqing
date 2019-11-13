package com.jk.model;

public class EducationBean {
    private Integer educationId;

    private String educationName;

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    @Override
    public String toString() {
        return "EducationBean{" +
                "educationId=" + educationId +
                ", educationName='" + educationName + '\'' +
                '}';
    }
}