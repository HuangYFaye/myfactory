package com.one.abstrByRefact;

import com.one.product.Apple;
import com.one.product.Nokia;
import com.one.product.Phone;

/**
 * Created by huangyifei on 2018/8/12.
 */
public abstract class AbstractFactory {

    public abstract Phone getApple(Class<? extends Apple> clazz);
    public abstract Phone getNokia(Class<? extends Nokia> clazz);
}
