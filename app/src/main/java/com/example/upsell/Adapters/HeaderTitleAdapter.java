package com.example.upsell.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.upsell.Model.HeaderTile;
import com.example.upsell.databinding.LytHeadTileBinding;

import java.util.List;

public class HeaderTitleAdapter extends RecyclerView.Adapter<HeaderTitleAdapter.ViewHolder> {
    private List<HeaderTile>listData;
    Context context;
    public HeaderTitleAdapter(List<HeaderTile> listData, Context context) {
        this.listData = listData;
        this.context=context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        LytHeadTileBinding binding=LytHeadTileBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int i) {

        HeaderTile headerTile=listData.get(i);
        holder.binding.txtHeadTile.setText(headerTile.getName());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        LytHeadTileBinding binding;
        public ViewHolder(LytHeadTileBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }
    }

}
