package com.luocj.pattern.lesson1.methodfactory;

import com.luocj.pattern.lesson1.Pay;
import com.luocj.pattern.lesson1.simplefactory.AliPay;

/**
 * @auth cj.luo
 * @date 2020/2/24
 */
public class MethodFactoryTest {

    private static final String USERNAME = "阿吉";

    public static void main(String[] args) {
        Pay aliPay = new AliPayFactory().getPay();
        aliPay.doPay(USERNAME);
        Pay wechatPay = new WechatPayFactory().getPay();
        wechatPay.doPay(USERNAME);
        Pay unionPay = new UnionPayFactory().getPay();
        unionPay.doPay(USERNAME);
        Pay payPal = new PaypalFactory().getPay();
        payPal.doPay(USERNAME);
    }
}
