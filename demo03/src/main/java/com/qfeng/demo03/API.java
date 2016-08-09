package com.qfeng.demo03;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by innershows on 16/8/9.
 *
 * @author innershows
 * @date 16/8/9
 * @e_mail innershow@gmail.com
 */
public interface API {
    //http://lol.data.shiwan.com/getArticleListImprove?cid_rel=207
    //如果请求这个接口，分为： 域名、路径、参数。 restful 设计良好的api，采用的是路径里面包含参数的方式。
    //很显然，这个接口并不是，但是并不影响使用


  //  @GET
   // Call<String> getBaidu();


    //http://lol.data.shiwan.com/getArticleListImprove?cid_rel=207
    //这里是get请求
    @GET("getArticleListImprove")
    //路径
    Call<Data> getNews(@Query("cid_rel") int cid_rel);//查询的参数
}
