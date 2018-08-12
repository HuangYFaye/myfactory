package com.one.func;

/**
 * Created by huangyifei on 2018/8/12.
 */
public class funcTest {

    public static void main(String[] args) {
        //此工厂实现叫工厂方法模式，是简单工厂的优化，每个具体产品类都有自己的工厂，完全符合开闭原则，
        //但是这样下去，产品一多，工厂类的数量就会增多,维护不方便，也会增加系统编译和运行的开销
        IphoneXFactory iphoneXFactory = new IphoneXFactory();
        N73Factory n73Factory = new N73Factory();
        iphoneXFactory.getPhone();
        n73Factory.getPhone();
    }
}
