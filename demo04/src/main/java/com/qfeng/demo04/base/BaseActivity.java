package com.qfeng.demo04.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by innershows on 16/6/25.
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        initView();
        setListener();
    }


    public abstract int getLayoutId();

    protected abstract void initView();

    protected abstract void setListener();

}

