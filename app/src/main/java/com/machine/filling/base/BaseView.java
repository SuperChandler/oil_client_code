package com.machine.filling.base;

/**
 * Created by LENOVO on 2017/12/16.
 */

public interface BaseView {

    /**
     * 显示加载框
     * @param loadingStr
     */
    void showProgress(String loadingStr);

    /**
     * 隐藏加载框
     */
    void hideProgress();
}
