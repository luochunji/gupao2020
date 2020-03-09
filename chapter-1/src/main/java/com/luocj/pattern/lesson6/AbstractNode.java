package com.luocj.pattern.lesson6;

import lombok.Getter;
import lombok.Setter;

/**
 * @auth cj.luo
 * @date 2020/3/9
 */
@Getter
@Setter
public abstract class AbstractNode {

    private Long id;

    private String name;

    private String path;

    private Integer level;

    private Long parentId;

    public AbstractNode(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public AbstractNode(Long id, String name, Integer level) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.path = level == 1 ? "/" + name : null;
    }


    @Override
    public String toString() {
        return "AbstractNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", level=" + level +
                ", parentId=" + parentId +
                '}';
    }
}
