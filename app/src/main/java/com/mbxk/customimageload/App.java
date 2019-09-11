package com.mbxk.customimageload;

import android.app.Application;

import com.hjq.image.ImageLoader;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 图片加载器
        ImageLoader.init(this);
    }
}
