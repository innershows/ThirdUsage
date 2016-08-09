package com.qfeng.demo03;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by innershows on 16/8/9.
 *
 * @author innershows
 * @date 16/8/9
 * @e_mail innershow@gmail.com
 */
public interface APIWithRx {
    @GET("getArticleListImprove")
    Observable<Data> getNews(@Query("cid_rel") int cid_rel);//查询的参数
}
