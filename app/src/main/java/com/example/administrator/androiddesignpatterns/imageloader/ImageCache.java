package com.example.administrator.androiddesignpatterns.imageloader;

import android.graphics.Bitmap;

/**
 * Created by Administrator on 2017/6/25.
 */

public interface ImageCache {
    Bitmap get(String url);

    void put(String url, Bitmap bitmap);

}
