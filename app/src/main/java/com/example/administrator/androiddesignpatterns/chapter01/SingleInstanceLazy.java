package com.example.administrator.androiddesignpatterns.chapter01;

/**
 * 懒汉式
 * Created by Administrator on 2017/6/13.
 */

public class SingleInstanceLazy {
    private static SingleInstanceLazy instance;
    private SingleInstanceLazy(){}
    public static synchronized SingleInstanceLazy getInstance(){
        if(instance == null){
            instance = new SingleInstanceLazy();
        }
        return instance;
    }
}
    