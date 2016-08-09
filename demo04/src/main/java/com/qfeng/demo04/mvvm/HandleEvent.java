package com.qfeng.demo04.mvvm;

import android.view.View;
import android.widget.Toast;

import com.qfeng.demo04.mvvm.model.User;

/**
 * Created by innershows on 16/8/9.
 *
 * @author innershows
 * @date 16/8/9
 * @e_mail innershow@gmail.com
 */
public class HandleEvent {
    public void handleClick(View v) {
        Toast.makeText(v.getContext(), "呵呵哒", Toast.LENGTH_SHORT).show();
        //System.out.println("====>"+user.getName());
    }

    public void handleClick01(User user) {
        //Toast.makeText(v.getContext(), "呵呵哒", Toast.LENGTH_SHORT).show();
        System.out.println("====>"+user.getName());
    }
}
