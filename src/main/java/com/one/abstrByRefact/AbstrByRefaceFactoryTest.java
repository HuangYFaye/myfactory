package com.one.abstrByRefact;

import com.one.product.Apple;
import com.one.product.Iphone8;
import com.one.product.Nokia;
import com.one.product.IphoneX;

/**
 * Created by huangyifei on 2018/8/12.
 */
public class AbstrByRefaceFactoryTest {
    public static void main(String[] args) {
        //此实现我想叫它为完美抽象工厂，新增现有产品簇产品只需要新增具体类，无需修改工厂，完全符合开闭原则
        AbstrByRefaceFactory abstrByRefaceFactory = new AbstrByRefaceFactory();
        abstrByRefaceFactory.getApple(Apple.class);
        abstrByRefaceFactory.getApple(IphoneX.class);
        abstrByRefaceFactory.getApple(Iphone8.class);
    }
}
