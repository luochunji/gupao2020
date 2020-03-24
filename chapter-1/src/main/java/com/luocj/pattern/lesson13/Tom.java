package com.luocj.pattern.lesson13;

import com.google.common.eventbus.Subscribe;

/**
 * @author cj.luo
 * @date 2020/3/23
 */
public class Tom extends Teacher {

    public Tom(String name) {
        super(name);
    }

    @Subscribe
    public void addQuestion(Question question) {
        if ("Tom".equalsIgnoreCase(question.getTeacher())) {
            printf(question);
        }

    }
}
