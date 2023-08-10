package com.example.a4_8_5_java.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.a4_8_5_java.R;
import com.example.a4_8_5_java.adapter.ViewPagerAdapter;
import com.example.a4_8_5_java.databinding.ActivityViewPagerBinding;
import com.example.a4_8_5_java.fragment.FirstFragment;
import com.example.a4_8_5_java.fragment.SecondFragment;
import com.example.a4_8_5_java.fragment.ThreeFragment;
import com.google.android.material.tabs.TabLayout;

public class ViewPager extends AppCompatActivity {
    ActivityViewPagerBinding binding;
    ViewPagerAdapter adapter;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityViewPagerBinding.inflate(getLayoutInflater());
        View view= binding.getRoot();
        setContentView(view);
        initViews();
    }
    void initViews(){


        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.add(new FirstFragment(),"Page 1");
        adapter.add(new SecondFragment(),"Pager 2");
        adapter.add(new ThreeFragment(),"Page 3");

        binding.viewpager.setAdapter(adapter);
        binding.tablayout.setupWithViewPager(binding.viewpager);

    }
}