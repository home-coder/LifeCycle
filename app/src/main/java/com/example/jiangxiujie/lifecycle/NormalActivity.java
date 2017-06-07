package com.example.jiangxiujie.lifecycle;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class NormalActivity extends AppCompatActivity {

    Button button1 = null;
    ProgressBar progressBar1 = null;
    Button button2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);

        Intent intent = getIntent();
        String data1 = intent.getStringExtra("param1");
        String data2 = intent.getStringExtra("param2");
        String data3 = intent.getStringExtra("param3");
        showText(data1, data2, data3);

        button1 = (Button) findViewById(R.id.normal_bt1);
        progressBar1 = (ProgressBar) findViewById(R.id.normal_bar);
        showProgressbar();

        button2 = (Button) findViewById(R.id.normal_bt2);
        downLoad();
    }

/*显示progressbar是否*/
    protected void showProgressbar() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progressBar1.getVisibility() == View.INVISIBLE) {
                    progressBar1.setVisibility(View.VISIBLE);
                } else {
                    progressBar1.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    protected void downLoad() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progress = progressBar1.getProgress();
                progress += 10;
                progressBar1.setProgress(progress);
            }
        });
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
