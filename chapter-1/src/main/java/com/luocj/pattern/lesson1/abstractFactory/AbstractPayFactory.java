package com.luocj.pattern.lesson1.abstractFactory;

import com.luocj.pattern.lesson1.Pay;
import com.luocj.pattern.lesson1.simplefactory.AliPay;
import com.luocj.pattern.lesson1.simplefactory.Paypal;
import com.luocj.pattern.lesson1.simplefactory.UnionPay;
import com.luocj.pattern.lesson1.simplefactory.WechatPay;

/**
 * @auth cj.luo
 * @date 2020/2/24
 */
public abstract class AbstractPayFactory {

    protected abstract Pay getPay();

    public Pay getPay(String name) {
        if ("alipay".equalsIgnoreCase(name)) {
            return new AliPayFactory().getPay();
        } else if ("wechat".equalsIgnoreCase(name)) {
            return new WechatPayFactory().getPay();
        } else if ("union".equalsIgnoreCase(name)) {
            return new UnionPayFactory().getPay();
        } else if ("paypal".equalsIgnoreCase(name)) {
            return new PaypalFactory().getPay();
        } else {
            throw new RuntimeException("没有对应的支付方式");
        }
    }
}
