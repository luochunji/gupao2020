package com.luocj.pattern.lesson5;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 访客的导航
 * @auth cj.luo
 * @date 2020/3/7
 */
public class GuestNavicator implements Navicator{

    @Override
    public JSONArray getMenu() {
        JSONArray menus = new JSONArray();
        menus.add(JSONObject.toJSON(Menu.builder().url("/index").name("问答").build()));
        menus.add(JSONObject.toJSON(Menu.builder().url("/article").name("文章").build()));
        menus.add(JSONObject.toJSON(Menu.builder().url("/resources").name("精品课").build()));
        menus.add(JSONObject.toJSON(Menu.builder().url("/bubblings").name("冒泡").build()));
        menus.add(JSONObject.toJSON(Menu.builder().url("/shop").name("精品课").build()));
        return menus;
    }
}
