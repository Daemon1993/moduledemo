package com.daemon1993.moduledemo;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

/**
 * Created by Daemon1993 on 2018/10/27 下午8:57.
 */
public class UserViewModel  {
    private ObservableField<String> name=new ObservableField<>();
    private ObservableField<String> pwd=new ObservableField<>();

    public ObservableField<String> getName() {
        return name;
    }

    public void setName( String  name) {
        this.name.set(name);
    }

    public ObservableField<String> getPwd() {
        return pwd;
    }

    public void setPwd( String pwd) {
        this.pwd.set(pwd);
    }
}
