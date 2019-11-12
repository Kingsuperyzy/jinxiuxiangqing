package com.jk.model;

public class SmokeBean {
    private Integer smokeid;

    private String smokename;

    public Integer getSmokeid() {
        return smokeid;
    }

    public void setSmokeid(Integer smokeid) {
        this.smokeid = smokeid;
    }

    public String getSmokename() {
        return smokename;
    }

    public void setSmokename(String smokename) {
        this.smokename = smokename == null ? null : smokename.trim();
    }


    @Override
    public String toString() {
        return "SmokeBean{" +
                "smokeid=" + smokeid +
                ", smokename='" + smokename + '\'' +
                '}';
    }
}