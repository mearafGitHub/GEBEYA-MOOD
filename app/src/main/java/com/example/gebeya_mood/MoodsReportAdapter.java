package com.example.gebeya_mood;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MoodsListAdapter extends RecyclerView.Adapter<MoodsListAdapter.MoodListViewHolder> {

    Context mContext;
    List<> mData;

    @NonNull
    @Override
    public MoodsListAdapter.MoodListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MoodsListAdapter.MoodListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MoodListViewHolder extends RecyclerView.ViewHolder {

        public MoodListViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
