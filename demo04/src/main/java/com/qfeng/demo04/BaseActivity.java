package com.qfeng.demo04;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by innershows on 16/8/9.
 *
 * @author innershows
 * @date 16/8/9
 * @e_mail innershow@gmail.com
 */
public abstract class BaseActivity extends AppCompatActivity {

    //////生命周期。 让代码，变简单，让逻辑，变easy。
    @Override
    public final void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        //加载布局
        setContentView(getLayoutId());

        Intent intent = getIntent();
        initView(intent);
        setAdapter();
        setListener();
    }

    /**
     * 这个方法，用来设置资源id。
     *
     * @return layoutId
     */
    protected abstract int getLayoutId();

    /**
     * 这个方法，用来给View进行一些初始化的操作。
     */
    protected abstract void initView(Intent intent);

    /**
     * 设置适配器
     */
    protected void setAdapter() {
    }

    /**
     * 设置监听
     */
    protected void setListener() {
    }


    @Override
    protected final void onStart() {
        super.onStart();
    }

    @Override
    protected final void onResume() {
        super.onResume();
        processOperation();

    }

    /**
     * 处理动作
     */
    protected abstract void processOperation();


    @Override
    protected final void onPause() {
        super.onPause();
        loseUser();
    }

    /**
     * 失去焦点
     */
    private void loseUser() {

    }


    @Override
    protected final void onRestart() {
        super.onRestart();
    }

    @Override
    protected final void onStop() {
        super.onStop();
    }


    @Override
    protected final void onDestroy() {
        super.onDestroy();
        recyleResource();
    }

    /**
     * 回收资源
     */
    protected abstract void recyleResource();
}
