package com.jk.model;

public class ConstellationBean {
    private Integer constellationid;

    private String constellationname;

    public Integer getConstellationid() {
        return constellationid;
    }

    public void setConstellationid(Integer constellationid) {
        this.constellationid = constellationid;
    }

    public String getConstellationname() {
        return constellationname;
    }

    public void setConstellationname(String constellationname) {
        this.constellationname = constellationname == null ? null : constellationname.trim();
    }
}