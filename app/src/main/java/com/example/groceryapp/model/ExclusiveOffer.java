package com.example.groceryapp.model;

public class ExclusiveOffer {
    String name;
    String price;
    String quantity;
//    String unit;
    Integer id;
    Integer imageurl;



    public ExclusiveOffer( String name, String price, String quantity, String unit,Integer id, Integer imageurl) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
//        this.unit = unit;
        this.id = id;
        this.imageurl = imageurl;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

//    public String getUnit() {
//        return unit;
//    }
//
//    public void setUnit(String unit) {
//        this.unit = unit;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }
}
