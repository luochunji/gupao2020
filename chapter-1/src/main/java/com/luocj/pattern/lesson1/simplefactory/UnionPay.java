package com.luocj.pattern.lesson1.simplefactory;

import com.luocj.pattern.lesson1.Pay;

/**
 * 银联支付
 *
 * @auth cj.luo
 * @date 2020/2/24
 */
public class UnionPay implements Pay {
    @Override
    public void doPay(String username) {
        System.out.println(username + "使用了银联支付");
    }
}
