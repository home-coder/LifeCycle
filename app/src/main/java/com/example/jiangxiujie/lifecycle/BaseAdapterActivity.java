package com.example.jiangxiujie.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class BaseAdapterActivity extends AppCompatActivity {
    private static final String TAG = "BaseAdapterActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter);

        List<Student> slist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setAge(i);
            student.setName("00" + i);
            student.setPhoto(R.drawable.uer_blue);
            slist.add(student);
        }

        Log.e(TAG, "onCreate: =====1");
        MyAdapter myAdapter = new MyAdapter(slist, BaseAdapterActivity.this);
        ListView listView = (ListView) findViewById(R.id.list_view1);
        listView.setAdapter(myAdapter);
        Log.e(TAG, "onCreate: =====2");
    }
}
