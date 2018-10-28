package com.daemon1993.loginmodule;

import android.content.Context;
import android.content.Intent;

import com.daemon1993.router.loginmodule.LoginModuleService;

import io.github.prototypez.appjoint.core.ServiceProvider;

/**
 * Created by Daemon1993 on 2018/10/28 上午10:59.
 */
@ServiceProvider
public class LoginModuleServiceImpl implements LoginModuleService {
    @Override
    public void startLoginMainActivity(Context context) {
        context.startActivity(new Intent(context,MainActivity.class));
    }
}
