package com.daemon1993.common;

import android.app.Application;

/**
 * Created by Daemon1993 on 2018/10/28 下午12:07.
 */
public class AppBase extends Application {
    public static Application INSTANCE;
    @Override
    public void onCreate() {
        super.onCreate();

        INSTANCE = (Application) getApplicationContext();
    }
}
