package com.luocj.pattern.lesson2;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @auth cj.luo
 * @date 2020/2/28
 */
public class ContainerSingleton {

    private ContainerSingleton() {

    }

    private static ConcurrentHashMap<String, Object> singletonMap = new ConcurrentHashMap<>();

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }

    public static void put(String key, Object instance) {
        singletonMap.putIfAbsent(key,instance);
    }

}
