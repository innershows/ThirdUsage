package com.qfeng.thirdusage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.lv)
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ArrayList<String> data = new ArrayList<>();
        for (int index = 0; index < 20; index++) {
            data.add("隔壁老王" + index);
        }
        data.add(getString(R.string.vertical_ellipsis));

        lv.setAdapter(new MyAdapter(data));
    }
}
