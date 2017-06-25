package com.example.administrator.androiddesignpatterns.imageloader;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by Administrator on 2017/6/21.
 */
public class MemoryImageCache implements ImageCache {
    LruCache<String, Bitmap> mMemeryChache;

    public MemoryImageCache() {
        initImageCache();
    }

    private void initImageCache() {
        final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        final int cacheSize = maxMemory / 4;
        mMemeryChache = new LruCache<String, Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight() / 1024;
            }
        };
    }

    @Override
    public Bitmap get(String url) {
        return mMemeryChache.get(url);
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        mMemeryChache.put(url, bitmap);
    }
}
