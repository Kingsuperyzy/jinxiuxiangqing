package com.jk.model;

public class LifeBean {
    private Integer lifeid;

    private Integer housingsituationid;

    private String  housingsituationname;//买房情况

    private Integer carsituationid;

    private String  carsituationname;//买车情况

    private Integer smokeid;

    private String  smokename;//是否吸烟

    private Integer drinkid;

    private String  drinkname;//是否喝酒

    private Integer userid;


    public String getHousingsituationname() {
        return housingsituationname;
    }

    public void setHousingsituationname(String housingsituationname) {
        this.housingsituationname = housingsituationname;
    }

    public String getCarsituationname() {
        return carsituationname;
    }

    public void setCarsituationname(String carsituationname) {
        this.carsituationname = carsituationname;
    }

    public String getSmokename() {
        return smokename;
    }

    public void setSmokename(String smokename) {
        this.smokename = smokename;
    }

    public String getDrinkname() {
        return drinkname;
    }

    public void setDrinkname(String drinkname) {
        this.drinkname = drinkname;
    }

    public Integer getLifeid() {
        return lifeid;
    }

    public void setLifeid(Integer lifeid) {
        this.lifeid = lifeid;
    }

    public Integer getHousingsituationid() {
        return housingsituationid;
    }

    public void setHousingsituationid(Integer housingsituationid) {
        this.housingsituationid = housingsituationid;
    }

    public Integer getCarsituationid() {
        return carsituationid;
    }

    public void setCarsituationid(Integer carsituationid) {
        this.carsituationid = carsituationid;
    }

    public Integer getSmokeid() {
        return smokeid;
    }

    public void setSmokeid(Integer smokeid) {
        this.smokeid = smokeid;
    }

    public Integer getDrinkid() {
        return drinkid;
    }

    public void setDrinkid(Integer drinkid) {
        this.drinkid = drinkid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "LifeBean{" +
                "lifeid=" + lifeid +
                ", housingsituationid=" + housingsituationid +
                ", housingsituationname='" + housingsituationname + '\'' +
                ", carsituationid=" + carsituationid +
                ", carsituationname='" + carsituationname + '\'' +
                ", smokeid=" + smokeid +
                ", smokename='" + smokename + '\'' +
                ", drinkid=" + drinkid +
                ", drinkname='" + drinkname + '\'' +
                ", userid=" + userid +
                '}';
    }
}