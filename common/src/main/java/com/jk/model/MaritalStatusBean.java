package com.jk.model;

public class MaritalStatusBean {
    private Integer maritalstatusId;

    private String maritalstatusName;

    public Integer getMaritalstatusId() {
        return maritalstatusId;
    }

    public void setMaritalstatusId(Integer maritalstatusId) {
        this.maritalstatusId = maritalstatusId;
    }

    public String getMaritalstatusName() {
        return maritalstatusName;
    }

    public void setMaritalstatusName(String maritalstatusName) {
        this.maritalstatusName = maritalstatusName;
    }

    @Override
    public String toString() {
        return "MaritalStatusBean{" +
                "maritalstatusId=" + maritalstatusId +
                ", maritalstatusName='" + maritalstatusName + '\'' +
                '}';
    }
}