package com.machine.filling.util;

import com.machine.filling.MyApp;
import com.zhy.http.okhttp.builder.PostFormBuilder;
import com.zhy.http.okhttp.callback.Callback;

import java.io.File;
import java.util.Map;


/**
 * Created by Administrator on 2016/8/23.
 */
public class OkHttpUtils {

    /**
     * post提交文本数据
     *
     * @param url      提交的地址
     * @param dataMap  提交的数据
     * @param callback 数据回调
     */
    public static void postDataMap(String url, Map<String, String> dataMap, Callback callback) {
        PostFormBuilder postFormBuilder = MyApp.getOkHttpUtils()
                .post()
                .tag(url)
                .url(url);
        if (dataMap != null) {
            for (Map.Entry<String, String> entry : dataMap.entrySet()) {
                postFormBuilder.addParams(entry.getKey(), entry.getValue());
            }
        }
        postFormBuilder.build().execute(callback);
    }

    /**
     * 提交文本数据 和文件
     *
     * @param url      提交的地址
     * @param dataMap  提交的数据
     * @param callback 数据回调
     */
    public static void postDataMapAndFile(String url, Map<String, String> dataMap, Map<String, File> fileMap,Callback callback) {
        PostFormBuilder postFormBuilder = MyApp.getOkHttpUtils()
                .post()
                .tag(url)
                .url(url);

        for (Map.Entry<String, String> entry : dataMap.entrySet()) {
            postFormBuilder.addParams(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, File> entry : fileMap.entrySet()) {
            postFormBuilder.addFile(entry.getKey(), entry.getValue().getName(), entry.getValue());
        }

        postFormBuilder.build().execute(callback);
    }


}
