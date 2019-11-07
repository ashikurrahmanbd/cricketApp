package com.example.cricketapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BdTeamCustomAdapter extends RecyclerView.Adapter<BdTeamListViewHolder> {

    Context context;
    ArrayList<String> bdPlayerNames;

    BdTeamCustomAdapter(Context context, ArrayList<String> bdPlayerNames){

        this.context = context;
        this.bdPlayerNames = bdPlayerNames;

    }

    @NonNull
    @Override
    public BdTeamListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.bdteamlist_custom_layout, parent, false);

        BdTeamListViewHolder viewHolder = new BdTeamListViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BdTeamListViewHolder holder, int position) {

        holder.bdTeamMemberList.setText(bdPlayerNames.get(position));

    }

    @Override
    public int getItemCount() {
        return bdPlayerNames.size();
    }
}
