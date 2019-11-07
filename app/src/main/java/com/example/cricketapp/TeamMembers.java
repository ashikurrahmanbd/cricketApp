package com.example.cricketapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class TeamMembers extends AppCompatActivity implements View.OnClickListener {

    CardView bdteamList, westIndiesTeamList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_members);

        //finding the cardViews
        bdteamList = (CardView) findViewById(R.id.bdTeamLisId);
        westIndiesTeamList = (CardView) findViewById(R.id.westIndiesListId);

        //setOnClick Listener
        bdteamList.setOnClickListener(this);
        westIndiesTeamList.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.bdTeamLisId){

            Intent intent = new Intent(TeamMembers.this, BdTeamMembers.class);

            startActivity(intent);

        }
        if (view.getId() == R.id.westIndiesListId){

            Intent intent = new Intent(TeamMembers.this, BdTeamMembers.class);

            startActivity(intent);
        }
    }
}
