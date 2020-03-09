package com.luocj.pattern.lesson7.adapters;


import com.luocj.pattern.lesson7.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForTokenAdapter extends AbstraceAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    @Override
    public ResultMsg login(Object... args) {
        return super.loginForRegist(String.valueOf(args[0]),null);
    }

}
