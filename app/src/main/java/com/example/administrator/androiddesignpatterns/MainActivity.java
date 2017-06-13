package com.example.administrator.androiddesignpatterns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.androiddesignpatterns.chapter01.SingleInstanceActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String url = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1497404767836&di=d9a7ac789b1dfa441cba2f5479d2b8e2&imgtype=0&src=http%3A%2F%2Fbbsatt.yineitong.com%2Fforum%2F2011%2F03%2F25%2F110325164993a2105258f0d314.jpg";
        ImageView iv = (ImageView) findViewById(R.id.iv);
        ImageLoader imageLoader = new ImageLoader();
        imageLoader.displayImage(url,iv);
    }

    public void click(View view) {
        startActivity(new Intent(this, SingleInstanceActivity.class));
    }
}
