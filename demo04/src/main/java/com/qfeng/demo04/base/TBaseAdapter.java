package com.qfeng.demo04.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by innershows on 16/6/25.
 */
public abstract class TBaseAdapter<T> extends BaseAdapter {

    protected List<T> entities;
    protected Context context;

    public TBaseAdapter(List<T> entities, Context context) {
        this.entities = entities;
        this.context = context;
    }

    public void addData(List<T> entities) {
        if (entities != null) {
            this.entities.addAll(entities);
            notifyDataSetChanged();
        }
    }


    @Override
    public final int getCount() {
        if (entities != null) {
            return entities.size();
        }
        return 0;
    }

    @Override
    public final T getItem(int position) {
        return entities.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * onBindViewHolder
     * onCreateViewHolder
     *
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(getViewId(), parent, false);
            vh = onCreateViewHolder(convertView);

            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        onBindViewHolder(vh, getItem(position));


        return convertView;
    }


    public abstract int getViewId();

    protected abstract ViewHolder onCreateViewHolder(View convertView);

    protected abstract void onBindViewHolder(ViewHolder vh, T item);

    public static class ViewHolder {

    }

}
