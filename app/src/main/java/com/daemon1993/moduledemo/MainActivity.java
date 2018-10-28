package com.daemon1993.moduledemo;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daemon1993.moduledemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMainBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);



        UserViewModel userViewModel = new UserViewModel();
        UserModelPresenter userModelPresenter=new UserModelPresenter();
        userModelPresenter.setUserViewModel(userViewModel);

        viewDataBinding.setPresenter(userModelPresenter);
        viewDataBinding.setUsermodel(userViewModel);


        viewDataBinding.tvShowName.postDelayed(new Runnable() {
            @Override
            public void run() {
                Services.loginModuleService.startLoginMainActivity(MainActivity.this);
            }
        }, 1000);


    }
}
