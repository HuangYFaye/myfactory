package com.one.func;

import com.one.product.Phone;

/**
 * Created by huangyifei on 2018/8/12.
 */
public interface Factory {
    //Factory的共同行为
    public Phone getPhone();
}
