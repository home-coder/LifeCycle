package com.example.jiangxiujie.lifecycle;

import com.example.jiangxiujie.lifecycle.Utils.House;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ObjectListView extends AppCompatActivity {
    private static final String TAG = "ObjectListView";

    private SimpleAdapter simpleAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_list_view);

        ListView listView = (ListView) findViewById(R.id.obj_listview);

        House house1 = new House(R.drawable.uer_blue, 1, "jiang");
        House house2 = new House(R.drawable.user, 2, "kakaka");

        List<Map<String, Object>> mlist = new ArrayList<>();
        House.getmList(mlist, house1);
        House.getmList(mlist, house2);

        simpleAdapter = new SimpleAdapter(this, mlist, R.layout.twotext_listview, new String[]{"img", "id", "name"},
                new int[]{R.id.image_view, R.id.text_view1, R.id.text_view2}
        );
        listView.setAdapter(simpleAdapter);
    }
}
