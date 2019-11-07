package com.example.cricketapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class BdTeamMembers extends AppCompatActivity {


    RecyclerView bdTeamMembersList;
    ArrayList<String> bdPlayerNames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bd_team_members);

        bdPlayerNames = new ArrayList<>(Arrays.asList("০১. লিটন দাস", "০২. ইমরুল কায়েস", "০৩. মমিনুল হক", "০৪. মোহাম্মদ মিথুন", "০৫. মাহমুদুল্লাহ (ক্যাপ্টেন)", "০৬. মুশফিকুর রহিম (উইকেট রক্ষক)", "০৭. আরিফুল হক", "০৮. মেহেদি হাসান", "০৯. টাইজুল ইসলাম", "১০. মুস্তাফিজুর রহমান", "১১. খালেদ আহমেদ", "১২. শফিকুল ইসলাম", "১৩. নাজমুল হাসান শান্ত", "১৪. আবু যায়েদ", "১৫. নাজমুল ইসলাম"));


        bdTeamMembersList = (RecyclerView) findViewById(R.id.bdTeamRecyclerViewId);

        bdTeamMembersList.setLayoutManager(new LinearLayoutManager(this));

        BdTeamCustomAdapter customAdapter = new BdTeamCustomAdapter(this, bdPlayerNames);

        bdTeamMembersList.setAdapter(customAdapter);

    }
}
