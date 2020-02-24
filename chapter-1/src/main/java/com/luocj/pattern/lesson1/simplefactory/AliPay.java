package com.luocj.pattern.lesson1.simplefactory;

import com.luocj.pattern.lesson1.Pay;

/**
 * @auth cj.luo
 * @date 2020/2/23
 */
public class AliPay implements Pay {
    @Override
    public void doPay(String username) {
        System.out.println(username+"使用了支付宝支付");
    }
}
