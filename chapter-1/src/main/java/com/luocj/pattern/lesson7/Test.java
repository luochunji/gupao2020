package com.luocj.pattern.lesson7;

import com.luocj.pattern.lesson7.adapters.LoginForQQAdapter;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThirdAdapter();
        adapter.login(LoginForQQAdapter.class, "sdfasdfasfasfas");
    }
}
