package com.luocj.pattern.lesson4;

import java.lang.reflect.Method;

/**
 * @auth cj.luo
 * @date 2020/3/3
 */
public class Meipo implements CustomerInvocationHandler {

    private Person target;

    public Object  getInstance(Person target){
        this.target = target;
        Class clazz = target.getClass();
        return CustomerProxy.newProxyInstance(new CustomerClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("要求的条件");
        method.invoke(target,args);
        System.out.println("开始匹配");
        return null;
    }
}
