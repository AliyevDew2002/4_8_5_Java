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
import com.example.a4_8_5_java.databinding.ActivityFirstFragmentBinding;
import com.example.a4_8_5_java.model.Contact;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstFragment extends Fragment {
    ActivityFirstFragmentBinding binding;
    Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_first_fragment,container,false);
        binding=ActivityFirstFragmentBinding.inflate(getLayoutInflater());
        view = binding.getRoot();

        initViews();

        return view;

    }
    void initViews(){


        binding.firstRecycler.setLayoutManager(new GridLayoutManager(context,1));
        refreshAdapter(prepareList());


    }


    ArrayList<Contact> prepareList(){
        ArrayList<Contact> list=new ArrayList<>();

        for (int i=0; i<ism.length; i++){
            list.add(new Contact(R.drawable.contact,ism[i],number[i]));
        }
        return list;
    }

    void refreshAdapter(ArrayList<Contact> contacts){
        FirstFragmentAdapter adapter=new FirstFragmentAdapter(this,contacts);
        binding.firstRecycler.setAdapter(adapter);
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

    String[] number= {
            "+99890_583_84_22",
            "+99891_015_45_48",
            "+99891_931_49_73",
            "+99890_732_13_62",
            "+99890_573_16_95",
            "+99890_321_12_32",
            "+99890_594_32_19",
            "+99890_654_98_89",
            "+99891_324_98_54",
            "+99890_457_98_23",
            "+99891_015_48_79",
            "+99890_932_25_19",
            "+99890_762_24_21",
            "99891_066_78_15"
    };

}