package com.daemon1993.loginmodule;

import android.databinding.ObservableField;

/**
 * Created by Daemon1993 on 2018/10/28 上午9:47.
 */
public class LoginViewModel {
    private ObservableField<Integer> age=new ObservableField<>();
    private ObservableField<String> name=new ObservableField<>();
    private ObservableField<String> pwd=new ObservableField<>();

    public LoginViewModel() {
        this.age.set(25);
    }

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
