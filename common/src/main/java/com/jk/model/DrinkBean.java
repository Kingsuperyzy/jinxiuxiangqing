package com.jk.model;

public class DrinkBean {
    private Integer drinkId;

    private String drinkName;

    public Integer getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(Integer drinkId) {
        this.drinkId = drinkId;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    @Override
    public String toString() {
        return "DrinkBean{" +
                "drinkId=" + drinkId +
                ", drinkName='" + drinkName + '\'' +
                '}';
    }
}