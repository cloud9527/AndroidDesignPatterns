package com.example.administrator.androiddesignpatterns.imageloader;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by Administrator on 2017/6/25.
 */

public class CloseUtils  {
    private CloseUtils(){}

    public static void closeQuitely(Closeable closeable){
        if (null != closeable){
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
