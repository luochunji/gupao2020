package com.luocj.pattern.lesson9;

/**
 * @auth cj.luo
 * @date 2020/3/15
 */
public class ABankStrategy implements  SendDataStrategy{
    @Override
    public boolean doSend(Object buildData) {
        System.out.println("以Webservice方式发送xml数据"+buildData);
        return true;
    }

    @Override
    public Object buildData(String data) {
        System.out.println("组装成xml格式");
        return data;
    }
}
