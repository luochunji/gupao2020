package com.luocj.pattern.lesson8;

/**
 * 炒肉
 * @auth cj.luo
 * @date 2020/3/14
 */
public class MeatCook implements Cook {


    @Override
    public void step2() {
        System.out.println("放油热锅");
    }

    @Override
    public void step3() {
        System.out.println("放肉和酱料");
    }

    @Override
    public void step4() {
        System.out.println("炒10分钟");
    }

}
