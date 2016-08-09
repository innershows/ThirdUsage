#Fresco使用
> facebook 出品的一个图片框架。体量比较大，但是功能强大。
   
    这个例子里面的所有代码来源均来自官方文档，
    具体例子，请参见:   
[Fresco官方文档](http://fresco-cn.org/docs/getting-started.html)


- 添加权限
    *AndroidManifest.xml*
```xml
<uses-permission android:name="android.permission.INTERNET" />
```
- 添加布局
    *layout.xml*
```xml
   <com.facebook.drawee.view.SimpleDraweeView
          android:id="@+id/sd_view"
          android:layout_width="400dp"  
          android:layout_height="400dp" /> 
```
**注意:宽高必须确定大小或者match_parent**
- 初始化
```java
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化
        Fresco.initialize(this);
    }
}
```
**需要修改清单文件**
- 使用
```java
sdv = (SimpleDraweeView) findViewById(R.id.sd_view);
sdv.setImageURI(URL);
```

- 高级特性
   支持的类型：
   <br>
   
      类型|SCHEME|示例
      ---|---|---
     远程图片|http://, https://	|HttpURLConnection 或者参考 使用其他网络加载方案
    本地文件|	file://	|FileInputStream
    Content provider|	content://	|ContentResolver
    asset目录下的资源|	asset://	|AssetManager
    res目录下的资源|	res://	|Resources.openRawResource
    Uri中指定图片数据	|data:mime/type;base64,|	数据类型必须符合 rfc2397规定 (仅支持 UTF-8)
    
- 如何设置属性？

    ```java
    //用来设置一些基本属性
    GenericDraweeHierarchyBuilder builder = new GenericDraweeHierarchyBuilder(getResources());
    
    builder.setProgressBarImage(new ProgressBarDrawable());
    builder.setActualImageScaleType(ScalingUtils.ScaleType.CENTER);
    builder.setFadeDuration(1000);
    sdv.setHierarchy(builder.build());
    
    //用来设置一些高级属性，比如git图播放等
    PipelineDraweeControllerBuilder builder1 = Fresco.newDraweeControllerBuilder();
    
    builder1.setAutoPlayAnimations(true).setUri("http://g.recordit.co/vcwGk2Ft1I.gif");
    sdv.setController(builder1.build());
    ```