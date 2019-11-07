package com.example.cricketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class BanglaVisionActiviy extends YouTubeBaseActivity {

    YouTubePlayerView youTubePlayerView;
    ImageView playButton;
    YouTubePlayer.OnInitializedListener youtubePlayerOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_vision_activiy);


        playButton = (ImageView) findViewById(R.id.playButtonId);
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.channelITvPlayerId);

        youtubePlayerOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("aV74HJVqJkU");

                youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.CHROMELESS);

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youTubePlayerView.initialize(YoutubeConfig.getApiKey(), youtubePlayerOnInitializedListener);
            }
        });

    }
}
