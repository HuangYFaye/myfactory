package com.one.simple;

import com.one.product.*;

/**
 * Created by huangyifei on 2018/8/12.
 */
public class SimpleFactory {

    Phone phone = null;
    //每新增一个新型号手机都需要在工厂里添加与业务相关的逻辑判断（例如：Iphonex,N73），并且每次都要来修改这个工厂类，
    //这样是不符合开闭原则的
    public Phone getPhone(String brand) {

        if (brand.equals("Iphonex")) {
            phone = new IphoneX();
            return phone;
        }

        if (brand.equals("N73")) {
            phone = new N73();
            return phone;
        }
        return null;
    }
}
