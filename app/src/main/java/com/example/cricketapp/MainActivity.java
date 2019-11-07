package com.example.cricketapp;


import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;
    CardView dateTimee, teamMember, liveScore, statistics, liveTv, stadium;

    AlertDialog.Builder alertDiaglogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayoutId);

        toggle = new ActionBarDrawerToggle(this, drawerLayout,R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //finding all cardView
        dateTimee = (CardView) findViewById(R.id.dateTimeId);
        teamMember = (CardView) findViewById(R.id.temMemberId);
        liveScore = (CardView) findViewById(R.id.liveScoreId);
        statistics =  (CardView) findViewById(R.id.statisticsId);
        liveTv = (CardView) findViewById(R.id.liveTVId);
        stadium = (CardView) findViewById(R.id.stadiumId);

        navigationView = (NavigationView) findViewById(R.id.nagivationViewId);


        //setOnclick Listener on CardView
        dateTimee.setOnClickListener(this);
        teamMember.setOnClickListener(this);
        liveScore.setOnClickListener(this);
        statistics.setOnClickListener(this);
        liveTv.setOnClickListener(this);
        stadium.setOnClickListener(this);

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(toggle.onOptionsItemSelected(item)){
            return  true;
        }


        return super.onOptionsItemSelected(item);
    }


    //For all the OnClick Listener
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.dateTimeId){

            Intent intent = new Intent(MainActivity.this, DateTime.class);

            startActivity(intent);

        }
        if(view.getId() == R.id.temMemberId){

            Intent intent = new Intent(MainActivity.this, TeamMembers.class);

            startActivity(intent);

        }
        if(view.getId() == R.id.liveScoreId){
            Intent intent = new Intent(MainActivity.this, LiveScoreActivity.class);

            startActivity(intent);
        }
        if(view.getId() == R.id.statisticsId){
            Intent intent = new Intent(MainActivity.this, StatisticsActivity.class);

            startActivity(intent);
        }
        if (view.getId() == R.id.liveTVId){
            Intent intent = new Intent(MainActivity.this, LiveTvActivity.class);

            startActivity(intent);

        }
        if (view.getId() == R.id.stadiumId){
            Intent intent = new Intent(MainActivity.this, StadiumActivity.class);

            startActivity(intent);

        }

    }




    //onOptionNavigationItemClick
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        if(menuItem.getItemId() == R.id.liveTVId){

            Intent intent = new Intent(MainActivity.this, LiveTvActivity.class);

            startActivity(intent);
        }
        if(menuItem.getItemId() == R.id.statisticsId){

            Intent intent = new Intent(MainActivity.this, StatisticsActivity.class);

            startActivity(intent);
        }
        if(menuItem.getItemId() == R.id.liveScoreId){

            Intent intent = new Intent(MainActivity.this, LiveScoreActivity.class);

            startActivity(intent);
        }

        if(menuItem.getItemId() == R.id.oistindijTeamId){

            Intent intent = new Intent(MainActivity.this, BdTeamMembers.class);

            startActivity(intent);
        }
        if(menuItem.getItemId() == R.id.bdteamsId){

            Intent intent = new Intent(MainActivity.this, BdTeamMembers.class);

            startActivity(intent);
        }

        if(menuItem.getItemId() == R.id.dateTimeId){

            Intent intent = new Intent(MainActivity.this, DateTime.class);

            startActivity(intent);
        }
        if(menuItem.getItemId() == R.id.aboutCompanyId){

            Intent intent = new Intent(MainActivity.this, AboutCompanyActivity.class);

            startActivity(intent);
        }

        if(menuItem.getItemId() == R.id.ratingId){

            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=org.greensoftdhaka.banvswib"); // missing 'http://' will cause crashed

            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }

        if(menuItem.getItemId() == R.id.exitId){

            alertDiaglogBuilder = new AlertDialog.Builder(this);

            alertDiaglogBuilder.setIcon(R.drawable.exit);
            alertDiaglogBuilder.setTitle("Exit App");
            alertDiaglogBuilder.setMessage("Are you sure to Exit?");

            alertDiaglogBuilder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog,int id) {
                    // if this button is clicked, close
                    // current activity
                    MainActivity.this.finish();
                }
            });

            alertDiaglogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog,int id) {
                    // if this button is clicked, close
                    // current activity
                    dialog.cancel();
                }
            });

            AlertDialog alertDialog = alertDiaglogBuilder.create();

            alertDialog.show();
        }
        if(menuItem.getItemId() == R.id.shareId){

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/type");
            startActivity(Intent.createChooser(intent, "Share With"));

        }




        return false;
    }



    //OnbackPressed method


    @Override
    public void onBackPressed() {

        alertDiaglogBuilder = new AlertDialog.Builder(this);

        alertDiaglogBuilder.setIcon(R.drawable.exit);
        alertDiaglogBuilder.setTitle("Exit App");
        alertDiaglogBuilder.setMessage("Are you sure to Exit?");

        alertDiaglogBuilder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int id) {
                // if this button is clicked, close
                // current activity
                MainActivity.this.finish();
            }
        });

        alertDiaglogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int id) {
                // if this button is clicked, close
                // current activity
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDiaglogBuilder.create();

        alertDialog.show();

    }


}

