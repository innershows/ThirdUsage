package com.qfeng.demo04.base.presenter;

import android.os.Handler;

import com.qfeng.demo04.base.model.Entity;
import com.qfeng.demo04.base.ui.IView;

import java.util.concurrent.TimeUnit;

/**
 * Created by innershows on 16/8/9.
 *
 * @author innershows
 * @date 16/8/9
 * @e_mail innershow@gmail.com
 */
public class TestPresenter implements ITestPresenter {
    IView iView;

    //模拟数据，假装是网络下载的。
    Entity entity = new Entity("刘德华", "我是大帅哥");

    private Handler handler = new Handler();

    public TestPresenter(IView iView) {
        this.iView = iView;
    }

    @Override
    public void startDownload(String url) {

        //调用View层的代码。
        iView.startLoading();

        //模拟网络请求
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int index = 1; index <= 10; index++) {
                    try {
                        Thread.sleep(TimeUnit.SECONDS.toMillis(1));
                        iView.loading(index * 10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        iView.loadFinished(entity.getMsg());
                    }
                });
            }
        }).start();
    }


}
