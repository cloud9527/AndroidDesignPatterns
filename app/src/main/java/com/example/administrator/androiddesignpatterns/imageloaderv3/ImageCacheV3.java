package com.example.administrator.androiddesignpatterns.imageloaderv3;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by Administrator on 2017/6/21.
 */
public class ImageCacheV3 {
    LruCache<String, Bitmap> mImageCache;

    public ImageCacheV3() {
        initImageCache();
    }

    private void initImageCache() {
        final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        final int cacheSize = maxMemory / 4;
        mImageCache = new LruCache<String, Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight() / 1024;
            }
        };
    }

    public void put(String url, Bitmap bitmap) {
        mImageCache.put(url, bitmap);
    }

    public Bitmap get(String url) {
        return mImageCache.get(url);
    }

}
