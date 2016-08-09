# EventBus 、RxAndroid 简单使用

###EventBus使用方法：
> 官方代码地址:[EventBus](https://github.com/greenrobot/EventBus)

    *EventBus的作用：事件解耦。可以用来任意传递事件*

#### 一、添加gradle依赖
```groovy
dependencies {
   //添加依赖
     compile 'compile 'org.greenrobot:eventbus:3.0.0''
}
```

#### 二、使用，见代码
```java

    @Override
    protected void onResume() {
        super.onResume();
        //注册
        EventBus.getDefault().register(this);//这里传的是this，其实也可是是个对象。
    }

    @Override
    protected void onPause() {
        super.onPause();
        //注销
        EventBus.getDefault().unregister(this);
    }

    public void hehe(View view) {
        //当点击事件出发的时候，发送一个事件
        EventBus.getDefault().post("呵呵哒");
    }

    //在这个方法里面获取到事件，这里获取到的demo，就是呵呵哒
    //设置threadMode 可以有多个，主线程、子线程等等。
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(String demo) {
        Toast.makeText(MainActivity.this, demo, Toast.LENGTH_SHORT).show();
    }
```

> tips:EventBus 采用事件的订阅模式，理解起来，类似于广播。注册广播，发送的东西，就被广播接收到。
 可以用于页面间传值


###RxAndroid简单用法
> 官方代码地址:[RxAndroid](https://github.com/ReactiveX/RxAndroid)
   
*from Android大神 **JakeWharton***

#### 一、添加gradle依赖
```groovy
compile 'io.reactivex:rxandroid:1.2.1'
// Because RxAndroid releases are few and far between, it is recommended you also
// explicitly depend on RxJava's latest version for bug fixes and new features.
compile 'io.reactivex:rxjava:1.1.6'
```

#### 二、简单使用
    RxAndroid采用的是异步的原理，使用链式结构，用起来方便，看起来大气。
    设计思想：观察者模式 
    观察者   :Subscribers
    被观察者 :Observables
    
*具体使用，请见demo01*
    
    

    



  