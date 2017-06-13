package com.example.administrator.androiddesignpatterns.chapter01;

/**
 * 枚举方式
 * Created by Administrator on 2017/6/13.
 */

public enum  SingleInstanceEnum {
    INSTANCE;
    public void method(){
        System.out.println("method");
    }
}
    