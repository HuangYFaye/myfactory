package com.one.func;

import com.one.product.Apple;
import com.one.product.IphoneX;
import com.one.product.Phone;

/**
 * Created by huangyifei on 2018/8/12.
 */
public class IphoneXFactory implements Factory{
    @Override
    public Phone getPhone() {
        return new IphoneX();
    }
}
