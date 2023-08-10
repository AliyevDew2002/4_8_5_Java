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
import com.example.a4_8_5_java.adapter.ThreeFragmentAdapter;
import com.example.a4_8_5_java.databinding.ActivityFirstFragmentBinding;
import com.example.a4_8_5_java.databinding.ActivityThreeFragmentBinding;
import com.example.a4_8_5_java.model.Contact;
import com.example.a4_8_5_java.model.Post;

import java.util.ArrayList;

public class ThreeFragment extends Fragment {
    ActivityThreeFragmentBinding binding;
    Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_three_fragment,container,false);
        binding=ActivityThreeFragmentBinding.inflate(getLayoutInflater());
        view = binding.getRoot();

        initViews();

        return view;

    }



    void initViews(){


        binding.threeRecycler.setLayoutManager(new GridLayoutManager(context,1));
        refreshAdapter(prepareList());


    }


    ArrayList<Post> prepareList(){
        ArrayList<Post> postList=new ArrayList<>();

        for (int i=0; i<=14; i++){
            postList.add(new Post(i+"- post"));
        }
        return postList;
    }

    void refreshAdapter(ArrayList<Post> post){
        ThreeFragmentAdapter adapter=new ThreeFragmentAdapter(this,post);
        binding.threeRecycler.setAdapter(adapter);
    }


}

