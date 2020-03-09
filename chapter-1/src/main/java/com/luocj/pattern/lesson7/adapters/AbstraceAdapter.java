package com.luocj.pattern.lesson7.adapters;

import com.luocj.pattern.lesson7.PassportService;
import com.luocj.pattern.lesson7.ResultMsg;

/**
 * Created by Tom.
 */
public abstract class AbstraceAdapter extends PassportService implements ILoginAdapter {
    protected ResultMsg loginForRegist(String username, String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
