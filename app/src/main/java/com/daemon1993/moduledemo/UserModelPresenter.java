package com.daemon1993.moduledemo;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Daemon1993 on 2018/10/27 下午9:03.
 */
public class UserModelPresenter {
    private UserViewModel userViewModel;

    public void setUserViewModel(UserViewModel userViewModel) {
        this.userViewModel = userViewModel;
    }

    @BindingAdapter("android:text")
    public void showNameAPwd(TextView textView,UserViewModel userViewModel){
        textView.setText(userViewModel.getName()+" - "+userViewModel.getPwd());
    }

    public void changeShowAction(View view){
        userViewModel.setName("Daemon"+Math.random());
        userViewModel.setPwd("123455-"+Math.random());
    }
}
