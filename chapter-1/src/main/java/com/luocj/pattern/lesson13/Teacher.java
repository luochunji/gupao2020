package com.luocj.pattern.lesson13;

/**
 * @author cj.luo
 * @date 2020/3/23
 */
public abstract class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    protected void printf(Question question) {
        System.out.println("你好，"+name+"！这是你的消息");
        System.out.println("提问内容：" + question.getContent());
        System.out.println("提问人：" + question.getName());
    }
}
