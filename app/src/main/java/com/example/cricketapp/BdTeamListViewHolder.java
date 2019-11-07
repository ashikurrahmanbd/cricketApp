package com.example.cricketapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BdTeamListViewHolder extends RecyclerView.ViewHolder {

    TextView bdTeamMemberList;

    public BdTeamListViewHolder(@NonNull View itemView) {
        super(itemView);

        bdTeamMemberList = (TextView) itemView.findViewById(R.id.bdTeamMemberlistTextViewId);

    }
}
