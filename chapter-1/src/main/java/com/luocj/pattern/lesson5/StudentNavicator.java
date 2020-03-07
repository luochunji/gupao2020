package com.luocj.pattern.lesson5;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 学员登录后的导航
 *
 * @auth cj.luo
 * @date 2020/3/7
 */
public class StudentNavicator extends NavicatorDecorator {

    public StudentNavicator(Navicator navicator) {
        super(navicator);
    }

    @Override
    public JSONArray getMenu() {
        JSONArray menus = super.getMenu();
        menus.add(JSONObject.toJSON(Menu.builder().url("/homework").name("作业").build()));
        menus.add(JSONObject.toJSON(Menu.builder().url("/question-bank").name("题库").build()));
        menus.add(JSONObject.toJSON(Menu.builder().url("/growth-wall").name("成长墙").build()));
        return menus;
    }
}
