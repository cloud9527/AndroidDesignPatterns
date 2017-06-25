package com.example.administrator.androiddesignpatterns.imageloaderv3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * sd卡存储
 * Created by Administrator on 2017/6/21.
 */
public class DiskCache {
    static String cacheDir = "sdcard/cache/";

    public Bitmap get(String url) {
        return BitmapFactory.decodeFile(cacheDir + url);
    }

    public void put(String url, Bitmap bitmap) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(cacheDir + url);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
