###网络框架
#### Volley
> 一个适合是快速、轻量级的网络请求框架，现已加入 OKHttp 豪华大礼包。
Google出品，必属精品

[国内Volley解析文章](http://a.codekk.com/detail/Android/grumoon/Volley%20%E6%BA%90%E7%A0%81%E8%A7%A3%E6%9E%90)
*这个网站里面的解析都是比较经典的，可以一看*


##### *用法*
- 添加gradle依赖
```groovy
//这是国内的一个开发者将Volley的源码部署到moven上面的。
//叫做 mcxiaoke
compile 'com.mcxiaoke.volley:library:1.0.19'
//或者使用,这里google官方的
//compile 'com.android.volley:volley:1.0.0'
```
[mcxiaoke](https://github.com/mcxiaoke)

- 具体使用。见*[MainActivity.java](/demo03/src/main/java/com/qfeng/demo03/MainActivity.java)*

#### Retrofit
>目前最火的一个网络框架，也是由 JakeWharton 大神主持开发的。
由开源界著名公司  [square](https://github.com/square) 出品。


- 添加gradle依赖
```groovy
    compile 'com.squareup.retrofit2:retrofit:2.0.2'
    

//如果想要使用Gson、RxAndroid，还需要：
    compile 'io.reactivex:rxandroid:1.2.1'
    compile 'io.reactivex:rxjava:1.1.6'
    compile 'com.google.code.gson:gson:2.4'
    //自动的json解析
    compile 'com.squareup.retrofit2:converter-gson:2.0.2'
    //使用链式结构
    compile 'com.squareup.retrofit2:adapter-rxjava:2.0.2'
```

- 具体使用。见*[MainActivity.java](/demo03/src/main/java/com/qfeng/demo03/RetrofitDemo.java)*