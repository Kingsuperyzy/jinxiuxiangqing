package com.jk.model;

public class PartnerBean {
    private Integer partnerid;

    private Integer age;

    private String hight;

    private Integer educationid;

    private Integer maritalstatusid;

    private Integer   userId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(Integer partnerid) {
        this.partnerid = partnerid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHight() {
        return hight;
    }

    public void setHight(String hight) {
        this.hight = hight == null ? null : hight.trim();
    }

    public Integer getEducationid() {
        return educationid;
    }

    public void setEducationid(Integer educationid) {
        this.educationid = educationid;
    }

    public Integer getMaritalstatusid() {
        return maritalstatusid;
    }

    public void setMaritalstatusid(Integer maritalstatusid) {
        this.maritalstatusid = maritalstatusid;
    }

    @Override
    public String toString() {
        return "PartnerBean{" +
                "partnerid=" + partnerid +
                ", age=" + age +
                ", hight='" + hight + '\'' +
                ", educationid=" + educationid +
                ", maritalstatusid=" + maritalstatusid +
                ", userId=" + userId +
                '}';
    }
}