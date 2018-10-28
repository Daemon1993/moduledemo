package com.daemon1993.usercentermodule;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daemon1993.common.UnifiedConstants;
import com.daemon1993.usercentermodule.databinding.UsercenterMainActivityBinding;

public class UserCenterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.usercenter_main_activity);

        UsercenterMainActivityBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.usercenter_main_activity);
        String stringExtra = getIntent().getStringExtra(UnifiedConstants.json_data);

        UserCenterViewModel userCenterViewModel=new UserCenterViewModel();
        userCenterViewModel.setShowText(stringExtra);
        viewDataBinding.setUsermodel(userCenterViewModel);

    }
}
