package com.qfeng.demo04.mvp.ui;

/**
 * Created by innershows on 16/8/9.
 * 模拟一个网络访问，然后可以时时更新进度
 *
 * @author innershows
 * @date 16/8/9
 * @e_mail innershow@gmail.com
 */
public interface IView {

    void startLoading();

    void loading(int progress);

    void loadFinished(String msg);
}
