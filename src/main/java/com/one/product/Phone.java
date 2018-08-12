package com.one.product;

/**
 * Created by huangyifei on 2018/8/12.
 */
public class Phone {
    String brand;
    PhoneColor color;

    public Phone(String brand,PhoneColor color) {
        this.brand = brand;
        this.color = color;
        System.out.println("Created :" + this.getBrand() +" Coler :" + this.getColor());
    }

    public PhoneColor getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}
