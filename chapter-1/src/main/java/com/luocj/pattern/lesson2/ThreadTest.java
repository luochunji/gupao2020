package com.luocj.pattern.lesson2;

/**
 * @auth cj.luo
 * @date 2020/2/28
 */
public class ThreadTest {

    public static void main(String[] args) {
        Thread[] t = new Thread[5];
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new SingletonThread());
        }
        for (int i = 0; i < t.length; i++) {
            t[i].start();
        }
    }
}
