package com.luocj.pattern.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auth cj.luo
 * @date 2020/3/1
 */
public class Test {

    public static void main(String[] args) {
        User tom = new User();
        tom.setName("Tom");
        tom.setAge(18);
        List<String> hobbies = new ArrayList<>();
        hobbies.addAll(Arrays.asList("书法", "美术"));
        tom.setHobbies(hobbies);

        try {
            User james = (User) tom.clone();
            james.getHobbies().add("Java");
            System.out.println(tom);
            System.out.println(james);
            System.out.println(tom == james);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
