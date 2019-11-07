package com.example.cricketapp;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class ChanneliTvActivity extends YouTubeBaseActivity  {

    YouTubePlayerView youTubePlayerView;
    ImageView playButton;
    YouTubePlayer.OnInitializedListener youtubePlayerOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channeli_tv);

        playButton = (ImageView) findViewById(R.id.playButtonId);
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.channelITvPlayerId);

        youtubePlayerOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("C6WYnrftqJ8");

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
