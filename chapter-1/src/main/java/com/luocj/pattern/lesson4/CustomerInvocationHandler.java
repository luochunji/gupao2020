package com.luocj.pattern.lesson4;

import java.lang.reflect.Method;

/**
 * @auth cj.luo
 * @date 2020/3/3
 */
public interface CustomerInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
