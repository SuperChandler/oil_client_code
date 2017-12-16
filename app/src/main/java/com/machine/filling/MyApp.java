package com.machine.filling;

import android.app.Application;
import android.content.Context;

import com.zhy.http.okhttp.OkHttpUtils;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class MyApp extends Application {
    private static final String TAG = "MyApp";
    public static MyApp context;
    public static Map<String, Long> map;
    private static OkHttpUtils okHttpUtils;
    private static boolean isAllowDebug;

    public static Context getContext() {
        return context;
    }

    /**
     * 初始化okhttp
     */
    private static void initOkHttp() {
        okHttpUtils = OkHttpUtils.getInstance();
        okHttpUtils.setConnectTimeout(30, TimeUnit.SECONDS);
        okHttpUtils.setReadTimeout(30, TimeUnit.SECONDS);
        okHttpUtils.setWriteTimeout(30, TimeUnit.SECONDS);

    }

    public static OkHttpUtils getOkHttpUtils() {
        return okHttpUtils;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        isAllowDebug = false;
        context = this;// 赋值
        initOkHttp();
    }
}
