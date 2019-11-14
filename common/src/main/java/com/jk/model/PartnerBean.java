package com.jk.model;

public class PartnerBean {
    private Integer partnerid;

    private Integer age;

    private String hight;

    private Integer educationId;
    private String educationName;

    private Integer maritalstatusid;

    private Integer   userId;

    private   String   monthlyIncome;

    private  Integer  provinceId;


    private   Integer   cityId;

    private   Integer  districtId;

    private   Integer  childrenId;

    private   Integer  smokeId;

    private   Integer  drinkId;


    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
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
        this.hight = hight;
    }

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public Integer getMaritalstatusid() {
        return maritalstatusid;
    }

    public void setMaritalstatusid(Integer maritalstatusid) {
        this.maritalstatusid = maritalstatusid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(String monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getChildrenId() {
        return childrenId;
    }

    public void setChildrenId(Integer childrenId) {
        this.childrenId = childrenId;
    }

    public Integer getSmokeId() {
        return smokeId;
    }

    public void setSmokeId(Integer smokeId) {
        this.smokeId = smokeId;
    }

    public Integer getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(Integer drinkId) {
        this.drinkId = drinkId;
    }

    @Override
    public String toString() {
        return "PartnerBean{" +
                "partnerid=" + partnerid +
                ", age=" + age +
                ", hight='" + hight + '\'' +
                ", educationId=" + educationId +
                ", educationName='" + educationName + '\'' +
                ", maritalstatusid=" + maritalstatusid +
                ", userId=" + userId +
                ", monthlyIncome='" + monthlyIncome + '\'' +
                ", provinceId=" + provinceId +
                ", cityId=" + cityId +
                ", districtId=" + districtId +
                ", childrenId=" + childrenId +
                ", smokeId=" + smokeId +
                ", drinkId=" + drinkId +
                '}';
    }
}