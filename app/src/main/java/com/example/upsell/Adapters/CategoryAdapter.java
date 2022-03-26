package com.example.upsell.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.upsell.Model.Category;
import com.example.upsell.databinding.LytCategoryBinding;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    private List<Category>listData;
    Context context;
    public CategoryAdapter(List<Category> listData, Context context) {
        this.listData = listData;
        this.context=context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        LytCategoryBinding binding=LytCategoryBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int i) {

        Category category=listData.get(i);
        holder.binding.txtCategoryName.setText(category.getName());
        holder.binding.imgCategory.setImageResource(category.getImageId());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        LytCategoryBinding binding;
        public ViewHolder(LytCategoryBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }
    }

}
