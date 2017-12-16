package com.machine.filling.presenter;

import com.machine.filling.APIHttpManager;
import com.machine.filling.base.BaseStringCallback;
import com.machine.filling.contract.LoginContract;

import okhttp3.Call;

/**
 * Created by LENOVO on 2017/12/16.
 */

public class LoginPresenter implements LoginContract.Presenter {
    private LoginContract.View mView;

    @Override
    public void login(String userName, String pwd, String deviceId) {
        mView.showProgress(null);
        APIHttpManager.getInstance().login(userName, pwd, deviceId, new BaseStringCallback() {
            @Override
            public void onSuccess(Call call, String result) {

            }

            @Override
            public void onFailed(int errorCode, String errorMsg, Exception exception) {

            }

            @Override
            public void onFinished() {
                mView.hideProgress();
            }
        });
    }
}
