package com.luocj.pattern.lesson9;

/**
 * @auth cj.luo
 * @date 2020/3/15
 */
public class Test {

    public static void main(String[] args) {
        SendDataContext contextA = new SendDataContext(Bank.A);
        SendDataContext contextB = new SendDataContext(Bank.B);
        contextA.sendData("1233");
        contextB.sendData("1233");
    }
}
