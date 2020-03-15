package com.luocj.pattern.lesson9;

/**
 * @auth cj.luo
 * @date 2020/3/15
 */
public class BBankStrategy implements SendDataStrategy {
    @Override
    public boolean doSend(Object buildData) {
        System.out.println("以http方式发送JSON数据" + buildData);
        return true;
    }

    @Override
    public Object buildData(String data) {
        System.out.println("组装成JSON格式");
        return data;
    }
}
