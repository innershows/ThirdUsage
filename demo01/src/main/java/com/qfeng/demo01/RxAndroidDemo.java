package com.qfeng.demo01;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * Created by innershows on 16/8/8.
 *
 * @author innershows
 * @date 16/8/8
 * @e_mail innershow@gmail.com
 */
public class RxAndroidDemo extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_rx);
    }

    public void onClick0(View view) {
        //1.创建一个被观察的对象
        Observable<String> observable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                //这个方法表示 被观察的对象发生的改变
                //当改变发生的时候，应该告诉观察者，有事请发生了
                subscriber.onNext("shit happened!!!");

                //完成了观察的动作
                subscriber.onCompleted();
            }
        });

        //2.创建一个观察者对象，用来观察被观察者对象的改变
        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("====>onCompleted");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {
                System.out.println("====>onNext" + s);
            }
        };

        //将观察者和被观察者绑定在一起
        observable.subscribe(subscriber);


    }


    public void onClick1(View view) {
        //发出动作。使用内置的观察者和被观察者。
        //调用just，被观察者发出动作，调用subscribe，观察者到位。
        Observable.just("做了什么").subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                //做了事情
                System.out.println("====>call" + s);
            }
        });
    }

    public void onClick2(View view) {
        //简单的使用
        Observable.just("穿了一个值").map(new Func1<String, String>() {
            @Override
            public String call(String s) {
                return null;
            }
        });

    }

    public void onClick3(View view) {
    }

    public void onClick4(View view) {
    }


}
