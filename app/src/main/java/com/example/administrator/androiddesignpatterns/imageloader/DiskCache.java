package com.example.administrator.androiddesignpatterns.imageloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * sd卡存储
 * Created by Administrator on 2017/6/21.
 */
public class DiskCache implements ImageCache {
    static String cacheDir = "sdcard/cache/";

    @Override
    public Bitmap get(String url) {
        return BitmapFactory.decodeFile(cacheDir + url);
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(cacheDir + url);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            CloseUtils.closeQuitely(fileOutputStream);
        }


    }
}
