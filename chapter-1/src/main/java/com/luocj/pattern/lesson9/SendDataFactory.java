package com.luocj.pattern.lesson9;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂
 *
 * @auth cj.luo
 * @date 2020/3/15
 */
public class SendDataFactory {

    public static Map<Bank, SendDataStrategy> strategy = new HashMap<>();

    static {
        strategy.put(Bank.A, new ABankStrategy());
        strategy.put(Bank.B, new BBankStrategy());
    }

    public static SendDataStrategy getStrategyByBank(Bank bank){
        return strategy.get(bank);
    }
}
