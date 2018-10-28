package com.daemon1993.loginmodule;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;

import java.util.Map;


/**
 * Created by Daemon1993 on 2018/10/28 上午9:48.
 */
public class LoginViewModelPresenter {

    private LoginViewModel loginViewModel;

    public void setLoginViewModel(LoginViewModel loginViewModel) {
        this.loginViewModel = loginViewModel;
    }

    public void loginAction(View view){
        Log.e("loginAction",loginViewModel.getName().get()+"  "+loginViewModel.getPwd().get());


        String s = GsonUtils.gson.toJson(loginViewModel);

        Map<String, Object> objAttr = ReflectUtils.getObjAttr(loginViewModel);

        Log.e("loginAction",new Gson().toJson(objAttr));
        Log.e("loginAction",s);
        Services.userCenterModuleService.startActivityOfUserCenterModule(view.getContext(),new Gson().toJson(objAttr));
    }
}
