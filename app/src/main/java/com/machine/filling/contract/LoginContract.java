package com.machine.filling.contract;

import com.machine.filling.base.BasePresenter;
import com.machine.filling.base.BaseView;

/**
 * Created by LENOVO on 2017/12/16.
 */

public class LoginContract {
    public interface View extends BaseView{
        void showLoginResult();
    }

    public interface Presenter extends BasePresenter{
        void login(String userName, String pwd, String deviceId);
    }
}
