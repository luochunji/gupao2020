package com.luocj.pattern.lesson1.abstractFactory;

import com.luocj.pattern.lesson1.Pay;
import com.luocj.pattern.lesson1.simplefactory.Paypal;
import com.luocj.pattern.lesson1.simplefactory.UnionPay;

/**
 * @auth cj.luo
 * @date 2020/2/24
 */
public class PaypalFactory extends AbstractPayFactory {
    @Override
    protected Pay getPay() {
        return new Paypal();
    }
}
