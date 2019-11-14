package com.jk.model;

public class LifeBean {
    private Integer lifeid;

    private Integer housingsituationid;

    private Integer carsituationid;

    private Integer smokeid;

    private Integer drinkid;

    private Integer userid;

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
                ", carsituationid=" + carsituationid +
                ", smokeid=" + smokeid +
                ", drinkid=" + drinkid +
                ", userid=" + userid +
                '}';
    }
}