package com.example.administrator.androiddesignpatterns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.androiddesignpatterns.chapter01.SingleInstanceActivity;
import com.example.administrator.androiddesignpatterns.imageloaderv3.ImageLoaderV3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String url = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498065672940&di=0f6ffeba3b712a4a4fbad0e2257fb9db&imgtype=0&src=http%3A%2F%2Fimg1.skqkw.cn%3A888%2F2014%2F11%2F20%2F12%2F3o5geq2jkyr-72668.jpg";
        ImageView iv = (ImageView) findViewById(R.id.iv);
        ImageLoaderV3 imageLoaderV3 = new ImageLoaderV3();
        imageLoaderV3.setUseDisCahe(true);
        imageLoaderV3.displayImage(url,iv);
    }

    public void click(View view) {
        startActivity(new Intent(this, SingleInstanceActivity.class));
    }
}
