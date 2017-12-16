package com.machine.filling.base;

import com.google.gson.Gson;
import com.machine.filling.responseBean.BaseHttpResponseBean;
import com.zhy.http.okhttp.callback.Callback;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by LENOVO on 2017/12/16.
 */

public abstract class BaseStringCallback extends StringCallback {

    @Override
    public String parseNetworkResponse(Response response) {
        return response.body().toString();
    }

    @Override
    public void onError(Call call, Exception e) {
        onFailed(-987654321,e.toString(),e);
    }

    @Override
    public void onResponse(Call call, String s) {
        try{
            BaseHttpResponseBean baseHttpResponseBean = new Gson().fromJson(s,BaseHttpResponseBean.class);
            if (baseHttpResponseBean.getCode() == 0){
                onSuccess(call,s);
            }else {
                onFailed(baseHttpResponseBean.getCode(),baseHttpResponseBean.getMsg(),null);
            }
            onFinished();
        }catch (Exception e){
            onFailed(-123456789,e.toString(),e);
        }
    }

    /**
     * 操作成功
     * @param call
     * @param result
     */
    public abstract void onSuccess(Call call, String result);

    /**
     * 请求失败；网络断开；resultcode ！=0
     * @param errorCode  有返回数据，但是处理失败为-123456789。接口异常为-987654321。其他为 接口又返回数据，处理正常
     * @param errorMsg
     * @param exception
     */
    public abstract void onFailed(int errorCode,String errorMsg,Exception exception);

    /**
     * 结束
     */
    public abstract void onFinished();

}
