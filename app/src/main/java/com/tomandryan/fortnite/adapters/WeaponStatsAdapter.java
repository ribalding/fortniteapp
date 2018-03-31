package com.tomandryan.fortnite.adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.tomandryan.fortnite.model.Weapon;

import java.util.ArrayList;

public class WeaponStatsAdapter extends RecyclerView.Adapter<WeaponStatsAdapter.WeaponStatsViewHolder> {
    private Context context;
    private ArrayList<String> stats;

    public WeaponStatsAdapter(Context context, ArrayList<String> stats){
        this.context = context;
        this.stats = stats;
    }

    @Override
    public WeaponStatsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(WeaponStatsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return this.stats.size();
    }

    public class WeaponStatsViewHolder extends RecyclerView.ViewHolder {
        public WeaponStatsViewHolder(View itemView){
            super(itemView);

        }
    }

    public void bindStat(String stat){

    }
}
