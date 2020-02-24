package com.luocj.pattern.lesson1.abstractFactory;

import com.luocj.pattern.lesson1.Pay;

/**
 * @auth cj.luo
 * @date 2020/2/24
 */
public class PayTest {

    public static void main(String[] args) {
        AbstractPayFactory factory = new DefaultPayFactory();
        Pay pay = factory.getPay("union");
        pay.doPay("阿吉");
    }

}
