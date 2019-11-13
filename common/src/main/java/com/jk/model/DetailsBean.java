package com.jk.model;

public class DetailsBean {
    private Integer detailsid;

    private Integer shapeid;

   private String  shapename;//体型

    private Integer constellationid;
    private String constellationname;//星座

    private Integer nationid;
    private String nationname;//民族

    private Integer childrenid;
    private String childrenname;//是否想要孩子

    private Integer marriedid;

    private String marriedname;//何时结婚

    private Integer userid;


    public String getShapename() {
        return shapename;
    }

    public void setShapename(String shapename) {
        this.shapename = shapename;
    }

    public String getConstellationname() {
        return constellationname;
    }

    public void setConstellationname(String constellationname) {
        this.constellationname = constellationname;
    }

    public String getNationname() {
        return nationname;
    }

    public void setNationname(String nationname) {
        this.nationname = nationname;
    }

    public String getChildrenname() {
        return childrenname;
    }

    public void setChildrenname(String childrenname) {
        this.childrenname = childrenname;
    }

    public String getMarriedname() {
        return marriedname;
    }

    public void setMarriedname(String marriedname) {
        this.marriedname = marriedname;
    }

    public Integer getDetailsid() {
        return detailsid;
    }

    public void setDetailsid(Integer detailsid) {
        this.detailsid = detailsid;
    }

    public Integer getShapeid() {
        return shapeid;
    }

    public void setShapeid(Integer shapeid) {
        this.shapeid = shapeid;
    }

    public Integer getConstellationid() {
        return constellationid;
    }

    public void setConstellationid(Integer constellationid) {
        this.constellationid = constellationid;
    }

    public Integer getNationid() {
        return nationid;
    }

    public void setNationid(Integer nationid) {
        this.nationid = nationid;
    }

    public Integer getChildrenid() {
        return childrenid;
    }

    public void setChildrenid(Integer childrenid) {
        this.childrenid = childrenid;
    }

    public Integer getMarriedid() {
        return marriedid;
    }

    public void setMarriedid(Integer marriedid) {
        this.marriedid = marriedid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }


    @Override
    public String toString() {
        return "DetailsBean{" +
                "detailsid=" + detailsid +
                ", shapeid=" + shapeid +
                ", shapename='" + shapename + '\'' +
                ", constellationid=" + constellationid +
                ", constellationname='" + constellationname + '\'' +
                ", nationid=" + nationid +
                ", nationname='" + nationname + '\'' +
                ", childrenid=" + childrenid +
                ", childrenname='" + childrenname + '\'' +
                ", marriedid=" + marriedid +
                ", marriedname='" + marriedname + '\'' +
                ", userid=" + userid +
                '}';
    }
}