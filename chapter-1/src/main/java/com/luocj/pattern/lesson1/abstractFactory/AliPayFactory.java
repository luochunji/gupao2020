package com.luocj.pattern.lesson1.abstractFactory;

import com.luocj.pattern.lesson1.Pay;
import com.luocj.pattern.lesson1.simplefactory.AliPay;
import com.luocj.pattern.lesson1.simplefactory.WechatPay;

/**
 * @auth cj.luo
 * @date 2020/2/24
 */
public class AliPayFactory extends AbstractPayFactory {
    @Override
    protected Pay getPay() {
        return new AliPay();
    }
}
