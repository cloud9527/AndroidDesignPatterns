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
        String url = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498603996&di=f3b9a7a4d003d52bf5aeea01bcf7efab&imgtype=jpg&er=1&src=http%3A%2F%2Fwww.1tong.com%2Fuploads%2Fwallpaper%2Flandscapes%2F273-1-1920x1200.jpg";
        ImageView iv = (ImageView) findViewById(R.id.iv);
        ImageLoader imageLoader = new ImageLoader();
        imageLoader.displayImage(url,iv);
    }

    public void click(View view) {
        startActivity(new Intent(this, SingleInstanceActivity.class));
    }
}
