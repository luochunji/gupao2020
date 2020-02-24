package com.luocj.pattern.lesson1.simplefactory;

import com.luocj.pattern.lesson1.Pay;

/**
 * @auth cj.luo
 * @date 2020/2/23
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Pay pay = SimplePayFactory.createPay("alipay");
        pay.doPay("阿吉");
    }
}
