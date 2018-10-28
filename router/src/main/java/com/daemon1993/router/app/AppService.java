package com.daemon1993.router.app;


import android.content.Context;

import io.reactivex.Observable;


/**
 * Created by Daemon1993 on 2018/10/28 上午10:47.
 */
public interface AppService {
    String callMethodSyncofApp();

    /**
     * 以 RxJava 形式封装的异步方法
     */
    Observable<AppEntity> observableOfApp();

    /**
     * 以 Callback 形式封装的异步方法
     */
    void callMethodAsyncOfApp(AppCallBack<AppEntity> callback);

    /*
     * 启动 App 模块的 Activity
     */
    void startActivityOfApp(Context context);
}
