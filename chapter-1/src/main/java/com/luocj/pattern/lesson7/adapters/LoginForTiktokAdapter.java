package com.luocj.pattern.lesson7.adapters;

import com.luocj.pattern.lesson7.ResultMsg;

/**
 * 抖音登录适配器
 *
 * @auth cj.luo
 * @date 2020/3/9
 */
public class LoginForTiktokAdapter extends AbstraceAdapter implements ILoginAdapter {
    @Override
    public boolean support(Object object) {
        return object instanceof LoginForTiktokAdapter;
    }

    @Override
    public ResultMsg login(Object... args) {
        //do something
        String openId = String.valueOf(args[0]);
        return super.loginForRegist(openId, null);
    }
}
