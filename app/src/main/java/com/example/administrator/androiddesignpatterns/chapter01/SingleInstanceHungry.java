package com.example.administrator.androiddesignpatterns.chapter01;

/**
 * 饿汉式
 * Created by Administrator on 2017/6/13.
 */

public class SingleInstanceHungry {
    private static final SingleInstanceHungry M_SINGLE_INSTANCE_HUNGRY = new SingleInstanceHungry();
    private SingleInstanceHungry(){

    }
    public static SingleInstanceHungry getSingleInstanceHungry(){
        return M_SINGLE_INSTANCE_HUNGRY;
    }
}
