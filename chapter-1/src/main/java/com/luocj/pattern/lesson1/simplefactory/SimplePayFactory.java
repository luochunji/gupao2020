package com.luocj.pattern.lesson1.simplefactory;

import com.luocj.pattern.lesson1.Pay;

/**
 * 简单支付工厂
 *
 * @auth cj.luo
 * @date 2020/2/23
 */
public class SimplePayFactory {

    public static Pay createPay(String option) {
        if ("wechatpay".equalsIgnoreCase(option)) {
            return new WechatPay();
        } else if ("alipay".equalsIgnoreCase(option)) {
            return new AliPay();
        } else if ("unionpay".equalsIgnoreCase(option)) {
            return new UnionPay();
        } else if ("paypal".equalsIgnoreCase(option)) {
            return new Paypal();
        } else {
            throw new RuntimeException("请选择支付方式");
        }
    }
}
