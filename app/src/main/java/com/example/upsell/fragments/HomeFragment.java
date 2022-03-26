package com.example.upsell.fragments;

import android.graphics.Paint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.upsell.Adapters.BodyAdapter;
import com.example.upsell.Adapters.CategoryAdapter;
import com.example.upsell.Adapters.HeaderTitleAdapter;
import com.example.upsell.Adapters.UserAdapter;
import com.example.upsell.DataClass;
import com.example.upsell.R;
import com.example.upsell.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {


    HeaderTitleAdapter headerTitleAdapter;
    CategoryAdapter categoryAdapter;
    UserAdapter userAdapter;

    BodyAdapter bodyAdapter;
    BodyAdapter bodyAdapter2;
    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        intializeAdapters();
        setAdapters();
        binding.lytHeader.txtOldPrice.setPaintFlags(  binding.lytHeader.txtOldPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

    }

    private void setAdapters() {

        binding.recycleViewHeaderTile.setAdapter(headerTitleAdapter);
        binding.recycleViewCategories.setAdapter(categoryAdapter);
        binding.recycleViewBody.setAdapter(bodyAdapter);
        binding.recycleViewBody2.setAdapter(bodyAdapter2);
        binding.recycleViewUsers.setAdapter(userAdapter);
    }

    private void intializeAdapters() {

        headerTitleAdapter=new HeaderTitleAdapter(DataClass.getMockHeaderListdata(),requireContext());
        categoryAdapter=new CategoryAdapter(DataClass.getMockCategoryListdata(),requireContext());
        bodyAdapter=new BodyAdapter(DataClass.getMockBodyListdata(),requireContext());
        bodyAdapter2=new BodyAdapter(DataClass.getMockBodyListdata2(),requireContext());

        userAdapter=new UserAdapter(DataClass.getUsersListdata(),requireContext());

    }
}