package com.luocj.pattern.lesson6;

/**
 * @auth cj.luo
 * @date 2020/3/9
 */
public class Test {

    public static void main(String[] args) {
        Node Node1 = new Node(1L,"D盘",1);
        Node Node2 = new Node(2L,"软件");
        Leaf Leaf1 = new Leaf(3L,"QQ.exe");
        Leaf Leaf2 = new Leaf(4L,"Wechat.exe");
        Node Node3 = new Node(5L,"电子书");
        Node Node4 = new Node(6L,"Java");
        Leaf Leaf3 = new Leaf(7L,"Java编程思想");

        Node1.addChild(Node2);
        Node1.addChild(Node3);
        Node2.addChild(Leaf1);
        Node2.addChild(Leaf2);
        Node3.addChild(Node4);
        Node4.addChild(Leaf3);

        System.out.println(Leaf3);
    }
}
