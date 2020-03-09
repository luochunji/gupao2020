package com.luocj.pattern.lesson6;

/**
 * @auth cj.luo
 * @date 2020/3/9
 */
public class Leaf extends AbstractNode{

    public Leaf(Long id, String name) {
        super(id, name);
    }

    public Leaf(Long id, String name, Integer level) {
        super(id, name, level);
    }
}
