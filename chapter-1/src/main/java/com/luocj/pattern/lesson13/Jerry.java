package com.luocj.pattern.lesson13;

import com.google.common.eventbus.Subscribe;

/**
 * @author cj.luo
 * @date 2020/3/23
 */
public class Jerry extends Teacher {

    public Jerry(String name) {
        super(name);
    }

    @Subscribe
    public void addQuestion(Question question) {
        if ("Jerry".equalsIgnoreCase(question.getTeacher())) {
            printf(question);
        }

    }
}
