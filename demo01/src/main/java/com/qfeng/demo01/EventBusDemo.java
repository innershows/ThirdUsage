package com.qfeng.demo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.greenrobot.eventbus.EventBus;

public class EventBusDemo extends AppCompatActivity {

    private HandleEvent 处理事件;
    //可以用于页面传值

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_bus_demo);
        处理事件 = new HandleEvent("测试", this);
        EventBus.getDefault().register(处理事件);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(处理事件);
    }

    public void onClick(View view) {
        EventBus.getDefault().post("按钮1");
    }

    public void onClick02(View view) {
        EventBus.getDefault().post("按钮2");
    }
}
