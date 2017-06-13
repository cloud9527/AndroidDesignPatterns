package com.example.administrator.androiddesignpatterns.chapter01;

/**
 * double check lock
 * Created by Administrator on 2017/6/13.
 */

public class SingleInstanceDoubleCheck {
    private volatile static SingleInstanceDoubleCheck instance = null;

    private SingleInstanceDoubleCheck() {
    }


    public static SingleInstanceDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingleInstanceDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingleInstanceDoubleCheck();
                }
            }
        }
        return instance;
    }
}