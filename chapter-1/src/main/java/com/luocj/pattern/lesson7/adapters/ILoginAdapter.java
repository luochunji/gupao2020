package com.luocj.pattern.lesson7.adapters;


import com.luocj.pattern.lesson7.ResultMsg;

/**
 * Created by Tom.
 */
public interface ILoginAdapter {

    boolean support(Object object);

    ResultMsg login(Object...args);
}
