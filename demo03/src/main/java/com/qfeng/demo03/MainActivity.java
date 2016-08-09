package com.qfeng.demo03;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.Map;

/**
 * Volley 的例子
 */
public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);


        //通过Volley的一个方法，实例化一个请求队列。
        //这里请求队列可以用于全局使用，以后的每个请求都可以放在里面。
        //可以考虑使用Application或者其他形式，保存一个对象
        requestQueue = Volley.newRequestQueue(this);

    }

    //点击按钮
    public void download(View view) {
        //一个成功的监听，一个失败的监听。
        requestQueue.add(new StringRequest("http://www.baidu.com", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println("====>" + response);
                tv.setText(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("====>" + error.toString());
            }
        }) {
            //这个方法里面可以传递参数，如果是post请求。
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return super.getParams();
            }
        });
    }
}
