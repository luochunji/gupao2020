package com.luocj.pattern.lesson13;

import com.google.common.eventbus.EventBus;

/**
 * @author cj.luo
 * @date 2020/3/24
 */
public class Test {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();


        Tom tomEvent = new Tom("Tom");
        Jerry jerryEvent = new Jerry("Jerry");
        eventBus.register(tomEvent);
        eventBus.register(jerryEvent);

        Question question = new Question();
        question.setName("学生A");
        question.setContent("问题内容");
        question.setTeacher("jerry");
        eventBus.post(question);
    }
}
