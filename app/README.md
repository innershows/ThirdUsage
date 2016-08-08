# ButterKnife 简单使用
##### 中文： 黄油刀

###使用方法：
#### 一、添加插件
![截图](/app/Captures/installPlugin.png)
#### 二、添加gradle
- 项目的build.gradle

```groovy
dependencies {
     classpath 'com.android.tools.build:gradle:2.1.0'
     //添加下面这一句
     **classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'**
 }
```

- Module的build.gradle
```groovy
//添加插件的使用
**apply plugin: 'android-apt'**
android {
  ...
}
dependencies {
   //添加依赖
     **compile 'com.jakewharton:butterknife:8.2.1'
     apt 'com.jakewharton:butterknife-compiler:8.2.1'**
}
```

#### 三、使用插件，生成代码
![截图](/app/Captures/gen01.png)
![截图](/app/Captures/gen02.png)
![截图](/app/Captures/gen03.png)
![截图](/app/Captures/gen04.png)
![截图](/app/Captures/gen05.png)

#### 四、**大功告成**


> 关于ViewHolder的资源的自动生成，请参考官方案例。




  