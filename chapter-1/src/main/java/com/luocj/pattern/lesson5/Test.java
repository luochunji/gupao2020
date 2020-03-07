package com.luocj.pattern.lesson5;

/**
 * @auth cj.luo
 * @date 2020/3/7
 */
public class Test {

    public static void main(String[] args) {

        GuestNavicator guestNavicator = new GuestNavicator();
        System.out.println("访客导航："+guestNavicator.getMenu());
        StudentNavicator studentNavicator = new StudentNavicator(guestNavicator);
        System.out.println("学员导航：" + studentNavicator.getMenu());

    }
}
