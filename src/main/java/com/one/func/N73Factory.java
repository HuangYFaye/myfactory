package com.one.func;

import com.one.product.N73;
import com.one.product.Nokia;
import com.one.product.Phone;

/**
 * Created by huangyifei on 2018/8/12.
 */
public class N73Factory implements Factory {

    @Override
    public Phone getPhone() {
        return new N73();
    }
}
