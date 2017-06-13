package com.example.administrator.androiddesignpatterns.chapter01;

/**
 * 静态内部类
 * Created by Administrator on 2017/6/13.
 */

public class SingleInstanceStatic {
    private SingleInstanceStatic(){}
    public static SingleInstanceStatic getInstance(){
        return SingleInstanceStaticHolder.sInstance;
    }

    private static class SingleInstanceStaticHolder {
        private static final SingleInstanceStatic sInstance = new SingleInstanceStatic();
    }
}
    