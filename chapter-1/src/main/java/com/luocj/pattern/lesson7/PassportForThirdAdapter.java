package com.luocj.pattern.lesson7;

import com.luocj.pattern.lesson7.adapters.ILoginAdapter;

/**
 * Created by Tom.
 */
public class PassportForThirdAdapter implements IPassportForThird {


    private ResultMsg processLogin(Class<? extends ILoginAdapter> clazz, Object... args) {
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(args);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ResultMsg login(Class<? extends ILoginAdapter> clazz, Object... args) {
        return processLogin(clazz, args);
    }
}
