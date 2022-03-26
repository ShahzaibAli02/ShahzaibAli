package com.example.upsell.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.upsell.Model.User;
import com.example.upsell.databinding.LytCategoryBinding;
import com.example.upsell.databinding.LytUserBinding;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private List<User>listData;
    Context context;
    public UserAdapter(List<User> listData, Context context) {
        this.listData = listData;
        this.context=context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        LytUserBinding binding=LytUserBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int i) {

        User user=listData.get(i);
        holder.binding.txtUserName.setText(user.getName());
        holder.binding.profileImage.setImageResource(user.getImageId());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        LytUserBinding binding;
        public ViewHolder(LytUserBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }
    }

}
