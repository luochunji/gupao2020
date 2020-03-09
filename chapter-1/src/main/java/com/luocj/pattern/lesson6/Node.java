package com.luocj.pattern.lesson6;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @auth cj.luo
 * @date 2020/3/8
 */
public class Node extends AbstractNode {

    public Node(Long id, String name) {
        super(id, name);
    }

    public Node(Long id, String name, Integer level) {
        super(id,name,level);
    }

    private List<AbstractNode> children;

    public void addChild(AbstractNode node) {
        if (null == children) {
            children = new ArrayList<>();
        }
        node.setPath(this.getPath() + "/" + node.getName());
        node.setParentId(this.getId());
        node.setLevel(this.getLevel() + 1);
        children.add(node);
    }
}
