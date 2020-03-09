package com.luocj.pattern.lesson7.adapters;


import com.luocj.pattern.lesson7.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForTelAdapter extends AbstraceAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(Object... args) {
        return super.loginForRegist(String.valueOf(args[0]),null);
    }

}
