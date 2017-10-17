package com.ctc.anni.bean;

public class Task {
    private Integer id;

    private String name;

    private Integer price;

    private Integer firsttime;

    private Integer secondtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getFirsttime() {
        return firsttime;
    }

    public void setFirsttime(Integer firsttime) {
        this.firsttime = firsttime;
    }

    public Integer getSecondtime() {
        return secondtime;
    }

    public void setSecondtime(Integer secondtime) {
        this.secondtime = secondtime;
    }
}