package com.luocj.pattern.lesson9;

/**
 * 数据传输上下文
 *
 * @auth cj.luo
 * @date 2020/3/15
 */
public class SendDataContext {

    private Bank bank;

    public SendDataContext(Bank bank) {
        this.bank = bank;
    }

    public boolean sendData(String object) {
        return SendDataFactory.getStrategyByBank(bank).sendData(object);
    }
}
