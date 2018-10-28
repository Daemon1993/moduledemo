package com.daemon1993.usercentermodule;

import android.databinding.ObservableField;

/**
 * Created by Daemon1993 on 2018/10/28 下午12:54.
 */
public class UserCenterViewModel {
    private ObservableField<String> showText=new ObservableField<>();

    public ObservableField<String> getShowText() {
        return showText;
    }

    public void setShowText(String showText) {
        this.showText.set(showText);
    }
}
