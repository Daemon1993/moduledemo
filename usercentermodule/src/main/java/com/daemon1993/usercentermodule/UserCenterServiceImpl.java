package com.daemon1993.usercentermodule;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.daemon1993.router.usercentermodule.UserCenterCallBack;
import com.daemon1993.router.usercentermodule.UserCenterEntity;
import com.daemon1993.router.usercentermodule.UserCenterModuleService;

import io.github.prototypez.appjoint.core.ServiceProvider;
import io.reactivex.Observable;

/**
 * Created by Daemon1993 on 2018/10/28 上午10:56.
 */
@ServiceProvider
public class UserCenterServiceImpl implements UserCenterModuleService {
    @Override
    public void startActivityOfUserCenterModule(Context context,String jsonData) {


        Intent intent = new Intent(context, UserCenterActivity.class);
        intent.putExtra("jsonData",jsonData);
        context.startActivity(intent);
    }

    @Override
    public String callMethodSyncOfModule2() {
        return null;
    }

    @Override
    public void callMethodAsyncOfModule2(UserCenterCallBack<UserCenterEntity> callback) {

    }

    @Override
    public Observable<UserCenterEntity> observableOfModule2() {
        return null;
    }
}
