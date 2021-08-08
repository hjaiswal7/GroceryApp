package com.example.groceryapp.model;

import android.graphics.drawable.Drawable;

public class Groceries {
    String name;
    Integer id;
    Integer imageurl;
    int bg;

    public Groceries(String name, Integer id, Integer imageurl, int bg) {
        this.name = name;
        this.id = id;
        this.imageurl = imageurl;
        this.bg = bg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public int getBg() {
        return bg;
    }

    public void setBg(int bg) {
        this.bg = bg;
    }

    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }
}
