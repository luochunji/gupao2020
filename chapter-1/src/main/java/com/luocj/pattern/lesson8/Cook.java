package com.luocj.pattern.lesson8;

/**
 * 烹饪
 *
 * @auth cj.luo
 * @date 2020/3/14
 */
public interface Cook {


    default void step1() {
        System.out.println("打开锅盖");
    }

    default void step2() {
        System.out.println("放入食材");
    }

    default void step3() {
        System.out.println("放入调料");
    }

    default void step4() {
    }

    default void step5() {
        System.out.println("出锅");
    }

    default void cook() {
        step1();
        step2();
        step3();
        step4();
        step5();
    }

}
