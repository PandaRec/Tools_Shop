package com.example.toolsshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrillDetailActivity extends AppCompatActivity {
    private String title;
    private String info;
    private int img_id;

    private ImageView imageView;
    private TextView textViewTitle;
    private TextView textViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill_detail);
        Intent intent = getIntent();
        if(intent.hasExtra("title") && intent.hasExtra("info")&& intent.hasExtra("img")){
            title = intent.getStringExtra("title");
            info = intent.getStringExtra("info");
            img_id = intent.getIntExtra("img",0);
        }
        textViewTitle = findViewById(R.id.textViewDetailTitle);
        textViewInfo = findViewById(R.id.textViewDetailInfo);
        imageView = findViewById(R.id.imageViewDetail);
        textViewTitle.setText(title);
        textViewInfo.setText(info);
        imageView.setImageResource(img_id);


    }
}