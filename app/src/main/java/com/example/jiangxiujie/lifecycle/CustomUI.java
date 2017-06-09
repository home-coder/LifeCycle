package com.example.jiangxiujie.lifecycle;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomUI extends AppCompatActivity {

    private Button custButton1 = null;
    private Button custButton2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_ui_layout);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        custButton1 = (Button) findViewById(R.id.cust_bt1);
        custButton2 = (Button) findViewById(R.id.cust_bt2);

        onButtonEvent();
    }

    protected void onButtonEvent() {
        custButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomUI.this, LifeCycleActivity.class);
                startActivity(intent);
            }
        });

        custButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
