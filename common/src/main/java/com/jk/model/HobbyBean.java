package com.jk.model;

public class HobbyBean {
    private Integer hobbyid;

    private String hobbyname;

    private String food;

    private String celebrity;

    private String book;

    private String thingtodo;

    private Integer userid;

    public Integer getHobbyid() {
        return hobbyid;
    }

    public void setHobbyid(Integer hobbyid) {
        this.hobbyid = hobbyid;
    }

    public String getHobbyname() {
        return hobbyname;
    }

    public void setHobbyname(String hobbyname) {
        this.hobbyname = hobbyname == null ? null : hobbyname.trim();
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food == null ? null : food.trim();
    }

    public String getCelebrity() {
        return celebrity;
    }

    public void setCelebrity(String celebrity) {
        this.celebrity = celebrity == null ? null : celebrity.trim();
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book == null ? null : book.trim();
    }

    public String getThingtodo() {
        return thingtodo;
    }

    public void setThingtodo(String thingtodo) {
        this.thingtodo = thingtodo == null ? null : thingtodo.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}