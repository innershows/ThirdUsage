package com.qfeng.demo03;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class RetrofitDemo extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_demo);
        tv = (TextView) findViewById(R.id.tv);
    }

    //具体的使用。 这个框架比较使用于适合restful 设计的 接口。
    //只需要一个接口用于定义这些东西，即可自动返回结果。
    //参见 ： API.java
    public void download(View view) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://lol.data.shiwan.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        API api = retrofit.create(API.class);

        api.getNews(207).enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                tv.setText(response.body().toString());
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {

            }
        });

    }

    public void download2(View view) {
        //RxAndroid 和 Retrofit 的综合使用。 比较流行的框架
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://lol.data.shiwan.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        APIWithRx api = retrofit.create(APIWithRx.class);

        api.getNews(207)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Data>() {
                    @Override
                    public void call(Data data) {
                        tv.setText(data.toString());
                    }
                });
    }
}
