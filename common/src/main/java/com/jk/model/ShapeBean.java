package com.jk.model;

public class ShapeBean {
    private Integer shapeid;

    private String shapename;

    public Integer getShapeid() {
        return shapeid;
    }

    public void setShapeid(Integer shapeid) {
        this.shapeid = shapeid;
    }

    public String getShapename() {
        return shapename;
    }

    public void setShapename(String shapename) {
        this.shapename = shapename == null ? null : shapename.trim();
    }

    @Override
    public String toString() {
        return "ShapeBean{" +
                "shapeid=" + shapeid +
                ", shapename='" + shapename + '\'' +
                '}';
    }
}