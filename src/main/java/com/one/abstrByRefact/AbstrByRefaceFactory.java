package com.one.abstrByRefact;

import com.one.abstrByRefact.AbstractFactory;
import com.one.product.Apple;
import com.one.product.Nokia;
import com.one.product.Phone;

/**
 * Created by huangyifei on 2018/8/12.
 */
public class AbstrByRefaceFactory extends AbstractFactory {

    //一类产品簇可以通过工厂来生产，只需要告诉工厂对应的具体产品类，
    // 新增新的产品簇成员时，也只需要创建新的Class，完全符合开闭原则,
    // 同时不需要新增或者修改工厂，是最完美的实现。
    @Override
    public Phone getApple(Class<? extends Apple> clazz) {
        try {
            return (Phone)clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Phone getNokia(Class<? extends Nokia> clazz) {
        try {
            return (Phone)clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
