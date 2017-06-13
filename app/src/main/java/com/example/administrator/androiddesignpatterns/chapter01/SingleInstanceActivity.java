package com.example.administrator.androiddesignpatterns.chapter01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.administrator.androiddesignpatterns.R;

public class SingleInstanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);
        SingleInstanceHungry class1 = SingleInstanceHungry.getSingleInstanceHungry();
        SingleInstanceHungry class2 = SingleInstanceHungry.getSingleInstanceHungry();
        SingleInstanceHungry class3 = SingleInstanceHungry.getSingleInstanceHungry();
        Log.e("TAG", "SingleInstanceHungry" + class1.toString());
        Log.e("TAG", "SingleInstanceHungry" + class2.toString());
        Log.e("TAG", "SingleInstanceHungry" + class3.toString());
        SingleInstanceLazy class4 = SingleInstanceLazy.getInstance();
        SingleInstanceLazy class5 = SingleInstanceLazy.getInstance();
        SingleInstanceLazy class6 = SingleInstanceLazy.getInstance();
        Log.e("TAG", "SingleInstanceLazy" + class4.toString());
        Log.e("TAG", "SingleInstanceLazy" + class5.toString());
        Log.e("TAG", "SingleInstanceLazy" + class6.toString());
        SingleInstanceDoubleCheck class7 = SingleInstanceDoubleCheck.getInstance();
        SingleInstanceDoubleCheck class8 = SingleInstanceDoubleCheck.getInstance();
        SingleInstanceDoubleCheck class9 = SingleInstanceDoubleCheck.getInstance();
        Log.e("TAG", "SingleInstanceDoubleCheck" + class7.toString());
        Log.e("TAG", "SingleInstanceDoubleCheck" + class8.toString());
        Log.e("TAG", "SingleInstanceDoubleCheck" + class9.toString());
        Log.e("TAG", "SingleInstanceEnum.INSTANCE" + SingleInstanceEnum.INSTANCE.toString());
        Log.e("TAG", "SingleInstanceEnum.INSTANCE" + SingleInstanceEnum.INSTANCE.toString());
        Log.e("TAG", "SingleInstanceEnum.INSTANCE" + SingleInstanceEnum.INSTANCE.toString());
        SingleInstanceStatic class10 = SingleInstanceStatic.getInstance();
        SingleInstanceStatic class11 = SingleInstanceStatic.getInstance();
        SingleInstanceStatic class12 = SingleInstanceStatic.getInstance();
        Log.e("TAG", "SingleInstanceStatic" + class10.toString());
        Log.e("TAG", "SingleInstanceStatic" + class11.toString());
        Log.e("TAG", "SingleInstanceStatic" + class12.toString());

        SingleInstanceManager.registerService("1","String1");
        SingleInstanceManager.registerService("1","String1");
        SingleInstanceManager.registerService("1","String1");
        Log.e("TAG", "SingleInstanceStatic" + SingleInstanceManager.getInstance("1"));
        Log.e("TAG", "SingleInstanceStatic" + SingleInstanceManager.getInstance("1"));
        Log.e("TAG", "SingleInstanceStatic" + SingleInstanceManager.getInstance("1"));
    }

}
