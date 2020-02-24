package com.luocj.pattern.lesson1.methodfactory;

import com.luocj.pattern.lesson1.Pay;
import com.luocj.pattern.lesson1.simplefactory.AliPay;

/**
 * @auth cj.luo
 * @date 2020/2/24
 */
public class AliPayFactory implements PayFactory {
    @Override
    public Pay getPay() {
        return new AliPay();
    }
}
