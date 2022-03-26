package com.example.upsell;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.example.upsell.databinding.ActivityMainBinding;
import com.example.upsell.fragments.HomeFragment;
import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ActivityMainBinding binding;
    MaterialCardView selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame,new HomeFragment());
        fragmentTransaction.commit();

        selected=binding.lytNav.cardCam;
        select(selected);
        binding.lytNav.cardStack.setOnClickListener(this);
        binding.lytNav.cardCam.setOnClickListener(this);
        binding.lytNav.cardBuy.setOnClickListener(this);
        binding.lytNav.cardCompass.setOnClickListener(this);
        binding.lytNav.cardFvrt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        //unselecting previous item
        if(selected!=null)
            unSelect(selected);

        //selecting current item
        selected=(MaterialCardView) view;
        select(selected);

    }

    public void  select(MaterialCardView cardView)
    {
        cardView.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardView.setElevation(10);
    }
    public void  unSelect(MaterialCardView cardView)
    {
        cardView.setCardBackgroundColor(getResources().getColor(R.color.gray));
        cardView.setElevation(0);
    }
}