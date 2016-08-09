package com.qfeng.demo02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.drawable.ProgressBarDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {


    public static final String URL = "https://www.baidu.com/img/2016_8_9logo_122270b4b815dd18097130c5ae0e2aa5.gif";
    private SimpleDraweeView sdv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到控件
        sdv = (SimpleDraweeView) findViewById(R.id.sd_view);
        //Uri uri = Uri.parse(URL);

        //设置地址
        //Uri uri = Uri.parse("http://fresco-cn.org/static/logo.png");
        //Uri uri = Uri.parse(URL);
        //显示
        //sdv.setImageURI(uri);

        sdv.setImageURI("http://g.recordit.co/vcwGk2Ft1I.gif");
        sdv.setScaleType(ImageView.ScaleType.CENTER);
        GenericDraweeHierarchyBuilder builder = new GenericDraweeHierarchyBuilder(getResources());

        builder.setProgressBarImage(new ProgressBarDrawable());
        builder.setActualImageScaleType(ScalingUtils.ScaleType.CENTER);
        builder.setFadeDuration(1000);

        sdv.setHierarchy(builder.build());

        PipelineDraweeControllerBuilder builder1 = Fresco.newDraweeControllerBuilder();
        builder1.setAutoPlayAnimations(true).setUri("http://g.recordit.co/vcwGk2Ft1I.gif");
        sdv.setController(builder1.build());
    }
}
