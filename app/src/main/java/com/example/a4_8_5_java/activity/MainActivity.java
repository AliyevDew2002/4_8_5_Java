package com.example.a4_8_5_java.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.a4_8_5_java.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        initViews();

    }

    void initViews(){
    binding.mainBt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openViewPager();
        }
    });
    }

    void openViewPager(){
        Intent intent=new Intent(this, ViewPager.class);
        startActivity(intent);
    }

}