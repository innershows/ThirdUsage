### Android程序架构

#### 基类 
> 写项目，基本上，很多东西，都是重复的。Fragment、Activity、Adapter
具体实例，请移步到*demo04/.../base/* 包名


#### MVC
M | V | C
---|---|---
Model|View|Controller
实体类/DAO|Layout|Activity、Fragment
数据的存储|界面|将数据放在界面的控制器

*总得来说，Android程序建立之后，本事就是符合MVP模式的。视图展示层被xml文件表示，Activity负责展示数据到页面，等等*
> 还有一种认识方式，有些开发者，认为Activity和Fragment也是属于视图层。也就是说，
视图层和控制层是写在一起的。没有绝对的对错，认识不同而已。
>这也是我们现在写代码的一个基本的模式。


![MVC](http://img.blog.csdn.net/20150605112142444)

#### MVP
M | V| P
---|---|---
Model|View|Presenter
实体类/DAO|UI|逻辑处理器
数据的存储|用户界面(**这里，把Fragment和Activity也认为是界面**)|处理器
>MVP 是 基于MVC 的一种升级模式。因为使用MVC时，Activity和Fragment里面的代码太多，
不利于观看、维护，所以采用MVP架构。
>MVP ，将Activity/Fragment彻底隔离，只需要负责展示页面(处理对应什么周期的页面展示),
其他的操作，都由Presenter(处理者)来管理。

具体实例，请移步到*demo04/.../mvp/* 包名

![MVP](http://img.blog.csdn.net/20150309135723885?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdmVjdG9yX3lp/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

#### MVVM



