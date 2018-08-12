package com.one.product;

/**
 * Created by huangyifei on 2018/8/12.
 */
public class Apple extends Phone {

    public Apple() {
        super("Apple",PhoneColor.BLACK);
    }

    public Apple(String brand, PhoneColor color) {
        super(brand,color);
    }
}
