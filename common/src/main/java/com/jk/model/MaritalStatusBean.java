package com.jk.model;

public class MaritalStatusBean {
    private Integer maritalstatusid;

    private String maritalstatusname;

    public Integer getMaritalstatusid() {
        return maritalstatusid;
    }

    public void setMaritalstatusid(Integer maritalstatusid) {
        this.maritalstatusid = maritalstatusid;
    }

    public String getMaritalstatusname() {
        return maritalstatusname;
    }

    public void setMaritalstatusname(String maritalstatusname) {
        this.maritalstatusname = maritalstatusname == null ? null : maritalstatusname.trim();
    }
}