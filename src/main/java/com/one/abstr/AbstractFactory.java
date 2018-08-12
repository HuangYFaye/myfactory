package com.one.abstr;

import com.one.product.Apple;
import com.one.product.Nokia;
import com.one.product.Phone;

/**
 * Created by huangyifei on 2018/8/12.
 */
public abstract class AbstractFactory {

    //每新增一个产品需要添加抽象方法
    public abstract Phone getIphonex();
    public abstract Phone getN73();
}
