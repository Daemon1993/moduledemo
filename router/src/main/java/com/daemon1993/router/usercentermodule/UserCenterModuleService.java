package com.daemon1993.router.usercentermodule;

import android.content.Context;

import io.reactivex.Observable;

/**
 * Created by Daemon1993 on 2018/10/28 上午10:52.
 */
public interface UserCenterModuleService {
    /*
     * 启动 module2 模块的 Activity
     */
    void startActivityOfUserCenterModule(Context context,String jsonData);

    /**
     * 普通的同步方法调用
     */
    String callMethodSyncOfModule2();

    /**
     * 以 Callback 形式封装的异步方法
     */
    void callMethodAsyncOfModule2(UserCenterCallBack<UserCenterEntity> callback);

    /**
     * 以 RxJava 形式封装的异步方法
     */
    Observable<UserCenterEntity> observableOfModule2();

}
