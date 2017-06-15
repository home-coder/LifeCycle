package com.example.jiangxiujie.lifecycle;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
/*
 * Created by jiangxiujie on 17-6-15.
*/

public class MyAdapter extends BaseAdapter {
    private static final String TAG = "MyAdapter";
    private List<Student> stuList;
    private LayoutInflater inflater;

    public MyAdapter() {
    }

    public MyAdapter(List<Student> stuList, Context context) {
        this.stuList = stuList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return stuList == null ? 0 : stuList.size();
    }

    @Override
    public Student getItem(int position) {
        return stuList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.e(TAG, "getView: ----->");
/*828平台   frameworks/base/core/java/com/android/internal/app/ShutdownModeDialog.java*/
        //加载布局为一个视图
        View view = inflater.inflate(R.layout.twotext_listview, null);
        Student student = getItem(position);
        //在view视图中查找id为image_photo的控件
        ImageView image_photo = (ImageView) view.findViewById(R.id.image_view);
        TextView tv_name = (TextView) view.findViewById(R.id.text_view1);
        TextView tv_age = (TextView) view.findViewById(R.id.text_view2);
        image_photo.setImageResource(student.getPhoto());
        tv_name.setText(student.getName());
        Log.e(TAG, "getView: ----->");
        tv_age.setText(String.valueOf(student.getAge()));
        return view;
    }
}
