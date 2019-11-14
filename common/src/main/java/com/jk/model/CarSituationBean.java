package com.jk.model;

public class CarSituationBean {
    private Integer carsituationid;

    private String carsituationname;

    public Integer getCarsituationid() {
        return carsituationid;
    }

    public void setCarsituationid(Integer carsituationid) {
        this.carsituationid = carsituationid;
    }

    public String getCarsituationname() {
        return carsituationname;
    }

    public void setCarsituationname(String carsituationname) {
        this.carsituationname = carsituationname == null ? null : carsituationname.trim();
    }

    @Override
    public String toString() {
        return "CarSituationBean{" +
                "carsituationid=" + carsituationid +
                ", carsituationname='" + carsituationname + '\'' +
                '}';
    }
}