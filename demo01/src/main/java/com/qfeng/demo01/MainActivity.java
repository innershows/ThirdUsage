package com.qfeng.demo01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        EventBus.getDefault().unregister(this);
    }

    public void hehe(View view) {
        EventBus.getDefault().post("呵呵哒");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(String demo) {
        Toast.makeText(MainActivity.this, demo, Toast.LENGTH_SHORT).show();
    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent2(String demo) {
        Toast.makeText(MainActivity.this, demo+"2", Toast.LENGTH_SHORT).show();
    }

}
