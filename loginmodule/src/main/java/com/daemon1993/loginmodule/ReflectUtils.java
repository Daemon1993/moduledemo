package com.daemon1993.loginmodule;

import android.databinding.ObservableField;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Daemon1993 on 2018/10/28 下午12:39.
 */
public class ReflectUtils {
    public static Map<String,Object> getObjAttr(Object obj) {
        // 获取对象obj的所有属性域
        Field[] fields = obj.getClass().getDeclaredFields();

        Map<String,Object> maps=new LinkedHashMap<>();

        for (Field field : fields) {
            // 对于每个属性，获取属性名
            String varName = field.getName();
            try {
                boolean access = field.isAccessible();
                if (!access) field.setAccessible(true);

                //从obj中获取field变量
                Object o = field.get(obj);

                if(o instanceof ObservableField){
                    o=((ObservableField) o).get();
                }
                System.out.println("变量： " + varName + " = " + o);
                maps.put(varName,o);

                if (!access) field.setAccessible(false);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return maps;
    }


}
