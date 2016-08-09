package com.qfeng.demo04;

import android.content.Intent;
import android.widget.TextView;

/**
 * Created by innershows on 16/8/9.
 *
 * @author innershows
 * @date 16/8/9
 * @e_mail innershow@gmail.com
 */
public class Demo extends BaseActivity {
    private TextView tv;

    @Override
    protected int getLayoutId() {
        return android.R.layout.simple_list_item_1;
    }

    @Override
    protected void initView(Intent intent) {
        tv = (TextView) findViewById(android.R.id.text1);
    }

    @Override
    protected void processOperation() {

    }

    @Override
    protected void recyleResource() {

    }
}
