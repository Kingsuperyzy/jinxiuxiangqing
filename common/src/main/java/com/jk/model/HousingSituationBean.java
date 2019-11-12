package com.jk.model;

public class HousingSituationBean {
    private Integer housingsituationid;

    private String housingsituationname;

    public Integer getHousingsituationid() {
        return housingsituationid;
    }

    public void setHousingsituationid(Integer housingsituationid) {
        this.housingsituationid = housingsituationid;
    }

    public String getHousingsituationname() {
        return housingsituationname;
    }

    public void setHousingsituationname(String housingsituationname) {
        this.housingsituationname = housingsituationname == null ? null : housingsituationname.trim();
    }
}