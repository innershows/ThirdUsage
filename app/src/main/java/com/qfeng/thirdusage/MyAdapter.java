package com.qfeng.thirdusage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by innershows on 16/8/8.
 *
 * @author innershows
 * @date 16/8/8
 * @e_mail innershow@gmail.com
 */
public class MyAdapter extends BaseAdapter {
    List<String> data;

    public MyAdapter(List<String> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        if (data == null) {
            return 0;
        }
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
            vh = new ViewHolder(convertView);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        vh.tv01.setText("fsdfsds ");

        return convertView;
    }

    //这是自动生成的ViewHolder
    static class ViewHolder {
        @BindView(R.id.tv_01)
        TextView tv01;
        @BindView(R.id.tv_02)
        TextView tv02;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
