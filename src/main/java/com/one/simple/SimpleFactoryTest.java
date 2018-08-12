package com.one.simple;

/**
 * Created by huangyifei on 2018/8/12.
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        //使用工厂模式，调用者不需要了解产品细节，只要知道自己要什么即可，符合迪米特法则（最少知道原则）
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.getPhone("Iphonex");
        simpleFactory.getPhone("N73");
    }

}
