package com.example.cricketapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class LiveTvActivity extends AppCompatActivity {

    CardView channelITv;

    CardView banglaVisionTv;

    CardView GTv, AtnNewsTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_tv);


        channelITv = (CardView) findViewById(R.id.channelITvId);

        banglaVisionTv = (CardView) findViewById(R.id.banglaVisionId);

        GTv = (CardView) findViewById(R.id.gtvId);

        AtnNewsTV = (CardView) findViewById(R.id.atnNewsTvID);

        channelITv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(LiveTvActivity.this, ChanneliTvActivity.class);
                startActivity(intent);
            }
        });

        banglaVisionTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(LiveTvActivity.this, BanglaVisionActiviy.class);
                startActivity(intent);
            }
        });

        GTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(LiveTvActivity.this, GTVActivity.class);
                startActivity(intent);
            }
        });

        AtnNewsTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(LiveTvActivity.this, AtnNewsTvActivity.class);
                startActivity(intent);
            }
        });

    }
}
