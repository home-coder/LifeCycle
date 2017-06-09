package com.example.jiangxiujie.lifecycle;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AppExample extends AppCompatActivity {
    RelativeLayout campusCard;
    RelativeLayout campusNews;
    RelativeLayout infoInquiry;

    ImageView userImg;
    ImageView newsImg;
    ImageView infoqueryImg;

    TextView textUser;
    TextView textNews;
    TextView textInfoQuery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_example_layout);

        campusCard = (RelativeLayout) findViewById(R.id.campuscard);
        changeButtonColor(campusCard);
    }

    private void changeButtonColor(RelativeLayout relativeLayout) {
        userImg = (ImageView) findViewById(R.id.userimg);
        newsImg = (ImageView) findViewById(R.id.newsimg);
        infoqueryImg = (ImageView) findViewById(R.id.infoinquiryimg);
        textUser = (TextView) findViewById(R.id.text_user);
        textInfoQuery = (TextView) findViewById(R.id.text_infoquery);
        textNews = (TextView) findViewById(R.id.new_text);
        if (relativeLayout.equals(campusCard)) {
            userImg.setImageResource(R.drawable.uer_blue);
            newsImg.setImageResource(R.drawable.news_blue);
            infoqueryImg.setImageResource(R.drawable.infoquery);
            textUser.setTextColor(Color.rgb(86,171,228));
            textNews.setTextColor(Color.rgb(169,183,183));
            textInfoQuery.setTextColor(Color.rgb(169,183,183));
        } else if (relativeLayout.equals(campusNews)) {
            newsImg.setImageResource(R.drawable.news_blue);
            userImg.setImageResource(R.drawable.user);
            infoqueryImg.setImageResource(R.drawable.infoquery);
            textNews.setTextColor(Color.rgb(86,171,228));
            textUser.setTextColor(Color.rgb(169,183,183));
            textInfoQuery.setTextColor(Color.rgb(169,183,183));
        } else {
            infoqueryImg.setImageResource(R.drawable.uer_blue);
            userImg.setImageResource(R.drawable.user);
            newsImg.setImageResource(R.drawable.news_blue);
            textInfoQuery.setTextColor(Color.rgb(86,171,228));
            textUser.setTextColor(Color.rgb(169,183,183));
            textNews.setTextColor(Color.rgb(169,183,183));
        }
    }
}
