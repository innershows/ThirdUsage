package com.qfeng.demo04.base.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.qfeng.demo04.R;
import com.qfeng.demo04.base.presenter.ITestPresenter;
import com.qfeng.demo04.base.presenter.TestPresenter;

public class MVPTestActivity extends AppCompatActivity implements IView {

    private ProgressBar pb;
    private Button btn;
    private ITestPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvptest);
        pb = (ProgressBar) findViewById(R.id.progressBar);
        btn = (Button) findViewById(R.id.btn);
        //实例化
        presenter = new TestPresenter(this);
        pb.setMax(100);
    }


    //点击事件的触发
    public void onClick(View view) {
        presenter.startDownload("地址");
    }

    //只需要管理这几个生命周期，而不需要处理任何逻辑
    @Override
    public void startLoading() {
        btn.setText("下载中...");
    }

    @Override
    public void loading(int progress) {
        pb.setProgress(progress);
    }

    @Override
    public void loadFinished(String msg) {
        btn.setText(msg);
    }

}
