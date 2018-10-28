package com.daemon1993.loginmodule;

import android.databinding.ObservableField;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Created by Daemon1993 on 2018/10/28 上午11:59.
 */
public class ObservableFiledGsonAdapter extends TypeAdapter<ObservableField> {
    @Override
    public void write(JsonWriter out, ObservableField value) throws IOException {
        Object obj = value.get();

        if(obj==null){
            out.value("");
        }else if(obj instanceof String){
            out.value(obj.toString());
        }else if(obj instanceof  Integer){
            out.value((Integer)obj);
        }else {
            out.value(obj.toString());
        }

    }

    @Override
    public ObservableField read(JsonReader in) throws IOException {
        return null;
    }
}
