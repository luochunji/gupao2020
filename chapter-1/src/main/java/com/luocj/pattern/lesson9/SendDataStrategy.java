package com.luocj.pattern.lesson9;

/**
 * 数据发送策略
 *
 * @auth cj.luo
 * @date 2020/3/15
 */
public interface SendDataStrategy {

    /**
     * 发送数据步骤
     * 组装数据 -> 发送数据
     * @param data
     * @return
     */
    default boolean sendData(String data){
        return doSend(buildData(data));
    }

    /**
     * 处理数据发送具体逻辑
     * @param buildData
     */
    boolean doSend(Object buildData);

    /**
     * 组装数据，根据不同银行的要求封装数据格式
     * @param data
     * @return
     */
    Object buildData(String data);
}
