package com.one.abstr;

import com.one.product.*;

/**
 * Created by huangyifei on 2018/8/12.
 */
public class PhoneFactory extends AbstractFactory {

    //每新增一个产品，工作都需要实现抽象方法
    @Override
    public Phone getIphonex() {
        return new IphoneX();
    }

    @Override
    public Phone getN73() {
        return new N73();
    }
}
