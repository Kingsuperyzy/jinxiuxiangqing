package com.jk.model;

public class DrinkBean {
    private Integer drinkid;

    private String drinkname;

    public Integer getDrinkid() {
        return drinkid;
    }

    public void setDrinkid(Integer drinkid) {
        this.drinkid = drinkid;
    }

    public String getDrinkname() {
        return drinkname;
    }

    public void setDrinkname(String drinkname) {
        this.drinkname = drinkname == null ? null : drinkname.trim();
    }
}