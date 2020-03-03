package com.luocj.pattern.lesson4;

/**
 * @auth cj.luo
 * @date 2020/3/3
 */
public class Zhaoliu implements Person {

    @Override
    public void findLove(String desc, String desc2) {
        System.out.println("我的条件是：" + desc + "," + desc2);
    }
}
