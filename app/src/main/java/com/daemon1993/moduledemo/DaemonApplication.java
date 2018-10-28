package com.daemon1993.moduledemo;

import android.app.Application;
import android.util.Log;

import com.daemon1993.common.AppBase;
import com.daemon1993.loginmodule.GsonUtils;

import io.github.prototypez.appjoint.core.AppSpec;
import io.github.prototypez.appjoint.core.ModuleSpec;

/**
 * Created by Daemon1993 on 2018/10/28 上午11:37.
 */
@AppSpec
public class DaemonApplication  extends AppBase {

    @Override
    public void onCreate() {
        super.onCreate();

        Log.e("DaemonApplication","AAAAa");
    }
}
