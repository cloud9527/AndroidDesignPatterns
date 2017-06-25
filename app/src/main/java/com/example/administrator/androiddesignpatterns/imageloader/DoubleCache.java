package com.example.administrator.androiddesignpatterns.imageloader;

import android.graphics.Bitmap;

/**
 * Created by Administrator on 2017/6/25.
 */

public class DoubleCache implements ImageCache {
    MemoryImageCache mMemoryImageCache = new MemoryImageCache();
    DiskCache mDiskCache = new DiskCache();

    public Bitmap get(String url) {
        Bitmap bitmap = mMemoryImageCache.get(url);
        if (bitmap == null) {
            bitmap = mDiskCache.get(url);
        }
        return bitmap;
    }

    public void put(String url, Bitmap bitmap) {
        mMemoryImageCache.put(url, bitmap);
        mDiskCache.put(url, bitmap);
    }
}


