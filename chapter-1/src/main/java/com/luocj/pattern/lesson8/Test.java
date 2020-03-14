package com.luocj.pattern.lesson8;

/**
 * @auth cj.luo
 * @date 2020/3/14
 */
public class Test {

    public static void main(String[] args) {
        Cook riceCook = new RiceCook();
        riceCook.cook();
        System.out.println("======================");
        Cook meatCook = new MeatCook();
        meatCook.cook();
    }
}
