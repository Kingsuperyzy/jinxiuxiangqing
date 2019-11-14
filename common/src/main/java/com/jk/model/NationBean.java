package com.jk.model;

public class NationBean {
    private Integer nationid;

    private String nationname;

    public Integer getNationid() {
        return nationid;
    }

    public void setNationid(Integer nationid) {
        this.nationid = nationid;
    }

    public String getNationname() {
        return nationname;
    }

    public void setNationname(String nationname) {
        this.nationname = nationname == null ? null : nationname.trim();
    }

    @Override
    public String toString() {
        return "NationBean{" +
                "nationid=" + nationid +
                ", nationname='" + nationname + '\'' +
                '}';
    }
}