package com.example.jiangxiujie.lifecycle;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);

        Intent intent = getIntent();
        String data1 = intent.getStringExtra("param1");
        String data2 = intent.getStringExtra("param2");
        String data3 = intent.getStringExtra("param3");
        showText(data1, data2, data3);
    }

    protected void showText(String data1, String data2, String data3) {
        TextView textView = (TextView) findViewById(R.id.normal_tv);
        textView.setText(data1 + data2 + "\n" + data3);
    }

    public static void actionStart(Context context, String data1, String data2, String data3) {
        Intent intent = new Intent(context, NormalActivity.class);
        intent.putExtra("param1", data1);
        intent.putExtra("param2", data2);

        /*从EditText中获取， 并显示到NormalActivity的界面中*/
        intent.putExtra("param3", data3);
        context.startActivity(intent);
    }
}
