package com.one.abstr;

/**
 * Created by huangyifei on 2018/8/12.
 */
public class AbstrcTest {
    public static void main(String[] args) {

        //此实现我想叫它简单抽象工厂，不需要像简单工厂那样由调用者HardCode业务逻辑，也不需要像工厂方法那样不停的新增工厂，
        //但是，每次新增产品都需要改动到抽象工厂类、工厂类，不符合开闭原则
        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.getIphonex();
        phoneFactory.getN73();
    }

}
