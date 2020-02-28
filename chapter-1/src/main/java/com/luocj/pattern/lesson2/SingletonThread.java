package com.luocj.pattern.lesson2;

/**
 * @auth cj.luo
 * @date 2020/2/28
 */
public class SingletonThread implements Runnable {
    @Override
    public void run() {
        ContainerSingleton.put("object", new Object());
        System.out.println(Thread.currentThread().getName() + "--" + ContainerSingleton.getInstance("object"));
    }
}
