package com.example.jiangxiujie.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListViewTest extends AppCompatActivity {
    private static final String TAG = "ListViewTest";

    private String[] data = {
      "apple", "banana", "orange", "watermelon", "pear",
      "grape", "pear", "which", "china", "japan", "USA",
      "CPU", "Pid", "book", "ppp", "wlan0", "he", "ooo",
      "melon", "yangzhnening"
    };

    int position;
    Button buttonUp, buttonDown, buttonOK;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_test);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                ListViewTest.this, android.R.layout.simple_list_item_1, data
        );
        listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        buttonUp = (Button) findViewById(R.id.button_up);
        buttonOK = (Button) findViewById(R.id.button_ok);
        buttonDown = (Button) findViewById(R.id.button_down);
        position = listView.getFirstVisiblePosition();
        setButtonClick();
    }

    protected void buttonListen(final Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (button.getId()) {
                    case R.id.button_up:
                        Log.e(TAG, "onClick: up" );
                        position--;
                        break;
                    case R.id.button_ok:
       /*                 AdapterView adpterview = listView.getItemAtPosition(position);*/
                        String s = listView.getItemAtPosition(position).toString();
                        Log.e(TAG, "onClick: ---" + s);
                        break;
                    case R.id.button_down:
                        Log.e(TAG, "onClick: down" );
                        position++;
                        break;
                    default:
                        break;
                }
            }
        });
    }

    protected void setButtonClick() {
        buttonListen(buttonUp);
        buttonListen(buttonOK);
    }
}



