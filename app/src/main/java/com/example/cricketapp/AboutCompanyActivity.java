package com.example.cricketapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutCompanyActivity extends AppCompatActivity {


    Button moreAppButton;
    ImageView fbButton, twitterButton, instagramButton, youTubeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_company);

        moreAppButton = (Button) findViewById(R.id.moreAppsButtonId);
        fbButton = (ImageView) findViewById(R.id.fbButtonId);
        twitterButton = (ImageView) findViewById(R.id.twitterButtonId);
        instagramButton = (ImageView) findViewById(R.id.instagramButtonId);
        youTubeButton = (ImageView) findViewById(R.id.youTubeButtonId);

        moreAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://play.google.com/store/apps/developer?id=Greensoft+Dhaka"); // missing 'http://' will cause crashed

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //facebook Button
        fbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://facebook.com/ashikjoy.akash"); // missing 'http://' will cause crashed

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //twitterButton
        twitterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://twitter.com/@ashikfuji1"); // missing 'http://' will cause crashed

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        instagramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://instagram.com/"); // missing 'http://' will cause crashed

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        youTubeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://youtube.com"); // missing 'http://' will cause crashed

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


    }
}
