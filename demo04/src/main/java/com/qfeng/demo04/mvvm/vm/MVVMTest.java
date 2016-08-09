package com.qfeng.demo04.mvvm.vm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.qfeng.demo04.R;
import com.qfeng.demo04.databinding.ActivityMvvmtestBinding;
import com.qfeng.demo04.mvvm.HandleEvent;
import com.qfeng.demo04.mvvm.model.User;

public class MVVMTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_mvvmtest);
        ActivityMvvmtestBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_mvvmtest);
        User user = new User("刘德华","51");
        binding.setUser(user);
        binding.setHandlers(new HandleEvent());
    }
}
