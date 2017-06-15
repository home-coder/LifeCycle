package com.example.jiangxiujie.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoTextListView extends AppCompatActivity {
    private static final String TAG = "TwoTextListView";

    private SimpleAdapter simpleAdapter = null;
    private List<Map<String, Object>> mapList = null;
    private ListView listView = null;
    private String strData[][] = {
            {"001", "jiangxiujie"}, {"002", "yangzhenning"},
            {"003", "zhugeliang"}, {"004", "sirenbang"},
            {"005", "chenglong"}, {"006", "sunwukong"}
    };

    private int imgData[] = {
            R.drawable.uer_blue,
            R.drawable.user
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_text_list_view);

        Log.e(TAG, "onCreate: 11111");
        mapList = getMapList();
        setData2List();
        Log.e(TAG, "onCreate: 2222" );
        listView = (ListView) findViewById(R.id.list_view1);
        setViewbyAdapter();
    }

    protected List<Map<String, Object>> getMapList() {
        return new ArrayList<>();
    }

    protected void setData2List() {
        for (int i = 0; i < strData.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("img", imgData[i % 2]);
            map.put("id", strData[i][0]);
            map.put("name", strData[i][1]);
            mapList.add(map);
        }
    }

    protected void setViewbyAdapter() {
        simpleAdapter = new SimpleAdapter(this, mapList, R.layout.twotext_listview, new String[]{"img", "id", "name"},
                    new int[]{R.id.image_view, R.id.text_view1, R.id.text_view2}
                );
        listView.setAdapter(simpleAdapter);
    }
}
