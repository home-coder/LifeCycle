package com.example.jiangxiujie.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PercentFrameLayout extends AppCompatActivity {

    private Button appButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.percent_frame_layout);
        appButton = (Button) findViewById(R.id.percent_bt1);

        onappButtonClick();
    }

    protected void onappButtonClick() {
        appButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PercentFrameLayout.this, AppExample.class);
                startActivity(intent);
            }
        });
    }
}
