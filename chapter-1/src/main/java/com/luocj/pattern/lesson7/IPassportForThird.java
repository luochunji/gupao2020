package com.luocj.pattern.lesson7;


import com.luocj.pattern.lesson7.adapters.ILoginAdapter;

/**
 * Created by Tom.
 */
public interface IPassportForThird {

    ResultMsg login(Class<? extends ILoginAdapter> clazz,Object... args);

}
