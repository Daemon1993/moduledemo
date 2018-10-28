package com.daemon1993.loginmodule;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.daemon1993.loginmodule.databinding.LoginMainBinding;

import io.reactivex.plugins.RxJavaPlugins;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.login_main);

        Toast.makeText(this,"aaaaaa",Toast.LENGTH_SHORT).show();

//        ActivityM viewDataBinding = DataBindingUtil.setContentView(this, R.layout.login_main);


        LoginMainBinding activityMainBinding=DataBindingUtil.setContentView(this,R.layout.login_main);

        LoginViewModel loginViewModel=new LoginViewModel();

        LoginViewModelPresenter loginViewModelPresenter=new LoginViewModelPresenter();
        loginViewModelPresenter.setLoginViewModel(loginViewModel);

        activityMainBinding.setPresenter(loginViewModelPresenter);
        activityMainBinding.setViewmodel(loginViewModel);


    }
}
