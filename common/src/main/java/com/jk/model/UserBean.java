package com.jk.model;

public class UserBean {
    private Integer userid;

    private String username;

    private String password;

    private String account;

    private String sex;

    private String userphone;

    private Integer provinceid;

    private Integer cityid;

    private Integer districtid;

    private String monthlyincome;

    private String innermonologue;

    private   String  userImg;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getDistrictid() {
        return districtid;
    }

    public void setDistrictid(Integer districtid) {
        this.districtid = districtid;
    }

    public String getMonthlyincome() {
        return monthlyincome;
    }

    public void setMonthlyincome(String monthlyincome) {
        this.monthlyincome = monthlyincome;
    }

    public String getInnermonologue() {
        return innermonologue;
    }

    public void setInnermonologue(String innermonologue) {
        this.innermonologue = innermonologue;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", account='" + account + '\'' +
                ", sex='" + sex + '\'' +
                ", userphone='" + userphone + '\'' +
                ", provinceid=" + provinceid +
                ", cityid=" + cityid +
                ", districtid=" + districtid +
                ", monthlyincome='" + monthlyincome + '\'' +
                ", innermonologue='" + innermonologue + '\'' +
                ", userImg='" + userImg + '\'' +
                '}';
    }
}