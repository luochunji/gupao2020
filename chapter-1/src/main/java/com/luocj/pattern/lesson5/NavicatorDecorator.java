package com.luocj.pattern.lesson5;

import com.alibaba.fastjson.JSONArray;

/**
 * 导航条装饰抽象
 *
 * @auth cj.luo
 * @date 2020/3/7
 */
public abstract class NavicatorDecorator implements Navicator {

    private Navicator navicator;

    public NavicatorDecorator(Navicator navicator) {
        this.navicator = navicator;
    }

    @Override
    public JSONArray getMenu() {
        return navicator.getMenu();
    }
}
