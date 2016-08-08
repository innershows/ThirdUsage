package com.qfeng.demo01;

import android.content.Context;
import android.widget.Toast;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by innershows on 16/8/8.
 *
 * @author innershows
 * @date 16/8/8
 * @e_mail innershow@gmail.com
 */
public class HandleEvent {
    private final String msg;
    private final Context ctx;

    public HandleEvent(String msg, Context ctx) {
        this.msg = msg;
        this.ctx = ctx;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void handle(String event) {
        Toast.makeText(ctx, event, Toast.LENGTH_SHORT).show();
    }
}
