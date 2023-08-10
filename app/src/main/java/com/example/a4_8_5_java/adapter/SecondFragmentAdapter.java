package com.example.a4_8_5_java.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a4_8_5_java.databinding.ContactQolipBinding;
import com.example.a4_8_5_java.databinding.UserQolipBinding;
import com.example.a4_8_5_java.fragment.FirstFragment;
import com.example.a4_8_5_java.fragment.SecondFragment;
import com.example.a4_8_5_java.model.Contact;
import com.example.a4_8_5_java.model.User;

import java.util.ArrayList;






public class SecondFragmentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<User> user;
    UserQolipBinding binding;

    SecondFragment fragmet;

    public SecondFragmentAdapter(SecondFragment fragmet, ArrayList<User> user){
        this.user=user;
        this.fragmet=fragmet;
    }




    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        UserQolipBinding binding = UserQolipBinding.inflate(layoutInflater);
        return new CustomViewHolder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        User user1=user.get(position);

        if (holder instanceof CustomViewHolder){

            ImageView photo=((CustomViewHolder) holder).binding.ivPhoto;
            TextView name=((CustomViewHolder) holder).binding.name;
            TextView raqam=((CustomViewHolder) holder).binding.kasbi;


            photo.setImageResource(user1.getPhoto());
            name.setText(user1.getName());
            raqam.setText(user1.getKaspi());

        }
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        private final UserQolipBinding binding;

        public CustomViewHolder(UserQolipBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


    @Override
    public int getItemCount() {
        return user.size();
    }
}

