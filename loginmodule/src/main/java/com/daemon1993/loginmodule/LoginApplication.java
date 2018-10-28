package com.daemon1993.loginmodule;

import android.util.Log;

import com.daemon1993.common.AppBase;
import com.google.gson.Gson;

import io.github.prototypez.appjoint.core.ModuleSpec;

/**
 * Created by Daemon1993 on 2018/10/28 下午12:07.
 */
@ModuleSpec
public class LoginApplication extends AppBase {

    @Override
    public void onCreate() {
        super.onCreate();

        Log.e("LoginApplication ","oncreate");


        GsonUtils.init();

    }
}
