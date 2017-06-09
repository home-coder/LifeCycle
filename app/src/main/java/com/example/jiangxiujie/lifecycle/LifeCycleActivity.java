package com.example.jiangxiujie.lifecycle;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LifeCycleActivity extends AppCompatActivity {

    private static final String TAG = "LifeCycleActivity";
    private Button diagButton = null;
    private Button normalButton = null;
    private Button testButton = null;
    private EditText editText = null;
    private Button relativeButton = null;
    private Button percentButton = null;
    private Button custButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate: ");
        setContentView(R.layout.activity_life_cycle);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        diagButton = (Button) findViewById(R.id.dialog_bt);
        normalButton = (Button) findViewById(R.id.normal_bt);
        testButton = (Button) findViewById(R.id.test_bt);
        relativeButton = (Button) findViewById(R.id.relative_bt);
        percentButton = (Button) findViewById(R.id.percent_bt);
        custButton = (Button) findViewById(R.id.cust_bt);
        editText = (EditText) findViewById(R.id.life_et);
        setButtonEvent();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: ");
    }

    protected void setButtonEvent() {
        diagButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LifeCycleActivity.this, DiagActivity.class);
                startActivity(intent);
            }
        });
        normalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strdata3 = editText.getText().toString();
                NormalActivity.actionStart(LifeCycleActivity.this, "data1", "data2", strdata3);
            }
        });
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LifeCycleActivity.this, TestLinearLayout.class);
                startActivity(intent);
            }
        });
        relativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LifeCycleActivity.this, TestRelativeLayout.class);
                startActivity(intent);
            }
        });
        percentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LifeCycleActivity.this, PercentFrameLayout.class);
                startActivity(intent);
            }
        });
        custButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LifeCycleActivity.this, CustomUI.class);
                startActivity(intent);
            }
        });

    }
}
