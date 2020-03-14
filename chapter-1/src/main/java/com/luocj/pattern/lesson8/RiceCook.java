package com.luocj.pattern.lesson8;

/**
 * 煮饭
 * @auth cj.luo
 * @date 2020/3/14
 */
public class RiceCook implements Cook {


    @Override
    public void step2() {
        System.out.println("放入米饭和水");
    }

    @Override
    public void step3() {
        System.out.println("煮30分钟");
    }

    @Override
    public void step4() {

    }

}
