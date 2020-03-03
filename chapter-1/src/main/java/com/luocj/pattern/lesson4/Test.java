package com.luocj.pattern.lesson4;


/**
 * @auth cj.luo
 * @date 2020/3/3
 */
public class Test {

    public static void main(String[] args) {
        Person meipo = (Person) new Meipo().getInstance(new Zhaoliu());
        meipo.findLove("高的","瘦的");
    }

}
