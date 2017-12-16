package com.machine.filling.base;

import android.support.v7.app.AppCompatActivity;

import com.machine.filling.R;

/**
 * Created by LENOVO on 2017/12/16.
 */

public class SimpleBaseActivity extends AppCompatActivity implements IView {

    @Override
    public void initView() {
        setContentView(R.layout.activity_splish);
    }

    @Override
    public void initData() {

    }
}
