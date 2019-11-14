package com.jk.model;

public class SmokeBean {
    private Integer smokeId;

    private String smokeName;

    public Integer getSmokeId() {
        return smokeId;
    }

    public void setSmokeId(Integer smokeId) {
        this.smokeId = smokeId;
    }

    public String getSmokeName() {
        return smokeName;
    }

    public void setSmokeName(String smokeName) {
        this.smokeName = smokeName;
    }

    @Override
    public String toString() {
        return "SmokeBean{" +
                "smokeId=" + smokeId +
                ", smokeName='" + smokeName + '\'' +
                '}';
    }
}