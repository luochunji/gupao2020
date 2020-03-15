package com.luocj.pattern.lesson9;

/**
 * @auth cj.luo
 * @date 2020/3/15
 */
public enum Bank {
    A("银行A"),
    B("银行B"),
    ;

    private String name;

    Bank(String name) {
        this.name = name;
    }

}
