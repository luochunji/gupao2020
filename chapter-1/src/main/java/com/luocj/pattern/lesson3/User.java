package com.luocj.pattern.lesson3;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @auth cj.luo
 * @date 2020/3/1
 */
@Data
public class User implements Cloneable, Serializable {

    private String name;

    private Integer age;

    private List<String> hobbies;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return JSONObject.parseObject(JSONObject.toJSONString(this), User.class);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}
