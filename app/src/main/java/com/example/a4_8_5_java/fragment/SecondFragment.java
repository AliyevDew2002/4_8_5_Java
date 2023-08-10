package com.example.a4_8_5_java.fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a4_8_5_java.R;
import com.example.a4_8_5_java.adapter.FirstFragmentAdapter;
import com.example.a4_8_5_java.adapter.SecondFragmentAdapter;
import com.example.a4_8_5_java.databinding.ActivityFirstFragmentBinding;
import com.example.a4_8_5_java.databinding.ActivitySecondFragmentBinding;
import com.example.a4_8_5_java.model.Contact;
import com.example.a4_8_5_java.model.User;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    ActivitySecondFragmentBinding binding;
    Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_second_fragment,container,false);
        binding=ActivitySecondFragmentBinding.inflate(getLayoutInflater());
        view = binding.getRoot();

        initViews();

        return view;

    }









    void initViews(){


        binding.secondRecycler.setLayoutManager(new GridLayoutManager(context,1));
        refreshAdapter(prepareList());


    }


    ArrayList<User> prepareList(){
        ArrayList<User> list=new ArrayList<>();

        for (int i=0; i<ism.length; i++){
            list.add(new User(R.drawable.contact,ism[i],kasbi[i]));
        }
        return list;
    }

    void refreshAdapter(ArrayList<User> user){
        SecondFragmentAdapter adapter=new SecondFragmentAdapter(this,user);
        binding.secondRecycler.setAdapter(adapter);
    }




    String[] ism={

            "Shaxzod",
            "Feyzullo",
            "Muhriddin",
            "Jasur",
            "Usmonali",
            "Ali",
            "Shuhrat",
            "Sodiq",
            "Asilbek",
            "Azizbek",
            "Abdukarim",
            "Sherzod",
            "Mustafo",
            "Rahmon"
    };

    String[] kasbi= {
            "Dasturlash",
            "Quruchi",
            "Muarbbiy",
            "Uy muhandisi",
            "bekorchi",
            "O'qtuvchi",
            "Kranchi",
            "Shafyor",
            "Tadbirkor",
            "Harbiy",
            "Ichki ishlar",
            "Student",
            "Mashinasoz",
            "IT Mutaxasisi"
    };






}