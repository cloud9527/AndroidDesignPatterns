package com.example.administrator.androiddesignpatterns.chapter01;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器式
 * Created by Administrator on 2017/6/13.
 */

public class SingleInstanceManager {
    private static Map<String ,Object> objMap = new HashMap<String ,Object>();
    private SingleInstanceManager(){}
    public static void registerService(String key, Object instance){
        if(!objMap.containsKey(key)){
            objMap.put(key,instance);
        }
    }
    public static Object getInstance(String key){
        return objMap.get(key);
    }
}
    