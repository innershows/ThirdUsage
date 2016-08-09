package com.qfeng.demo02;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by innershows on 16/8/9.
 *
 * @author innershows
 * @date 16/8/9
 * @e_mail innershow@gmail.com
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化
        Fresco.initialize(this);
    }
}
