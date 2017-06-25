package com.example.administrator.androiddesignpatterns.imageloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 第二版本单一职责原则，将ImageCache抽离出来
 * Created by Administrator on 2017/6/14.
 */

public class ImageLoader {
    ImageCache mImageCache = new MemoryImageCache();

    ExecutorService mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public void displayImage(final String url, final ImageView imageView) {
        Bitmap bitmap = mImageCache.get(url);
        if (bitmap!=null){
            imageView.setImageBitmap(bitmap);
            return;
        }
        submitLoadReq(url, imageView);
    }

    private void submitLoadReq(final String url, final ImageView imageView) {
        imageView.setTag(url);
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downloadImage(url);
                if (bitmap == null) return;
                mImageCache.put(url, bitmap);
                if (imageView.getTag().equals(url)) {
                    imageView.setImageBitmap(bitmap);
                }

            }
        });
    }

    public Bitmap downloadImage(String imageUrl) {
        Bitmap bitmap = null;
        try {
            URL url = new URL(imageUrl);
            final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bitmap = BitmapFactory.decodeStream(connection.getInputStream());
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    public void setImageCache(ImageCache imageCache) {
        mImageCache = imageCache;
    }
}
