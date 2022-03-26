package com.example.upsell.Adapters;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.upsell.Model.Body;
import com.example.upsell.Model.Category;
import com.example.upsell.databinding.LytProductBinding;

import java.util.List;

public class BodyAdapter extends RecyclerView.Adapter<BodyAdapter.ViewHolder>
{
    private List<Body>listData;
    Context context;
    public BodyAdapter(List<Body> listData, Context context) {
        this.listData = listData;
        this.context=context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        LytProductBinding binding=LytProductBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int i) {

        Body body=listData.get(i);
        holder.binding.txtDistance.setText(body.getDistance());
        holder.binding.txtPrice.setText(body.getPrice());
        holder.binding.txtTitle.setText(body.getTitle());
        holder.binding.txtProductService.setText(body.getService());

        if(body.isHasOff())
        {
            holder.binding.lytOff.setVisibility(View.VISIBLE);
            holder.binding.txtOldPrice.setText(body.getOldPrice());
            holder.binding.txtOldPrice.setPaintFlags( holder.binding.txtOldPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
        else
        {
            holder.binding.lytOff.setVisibility(View.INVISIBLE);
        }
        holder.binding.imgProduct.setImageResource(body.getImage());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        LytProductBinding binding;
        public ViewHolder(LytProductBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }
    }

}
