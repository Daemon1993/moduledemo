package com.daemon1993.loginmodule;

import android.databinding.ObservableField;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Daemon1993 on 2018/10/28 下午12:03.
 */
public class GsonUtils {
    static  Gson gson=new Gson();
    public static void init(){
        gson=new GsonBuilder().registerTypeAdapter(ObservableField.class,new ObservableFiledGsonAdapter()).create();
    }
}
