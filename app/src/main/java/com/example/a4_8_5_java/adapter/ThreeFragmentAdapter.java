package com.example.a4_8_5_java.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a4_8_5_java.databinding.ContactQolipBinding;
import com.example.a4_8_5_java.databinding.PostBinding;
import com.example.a4_8_5_java.fragment.FirstFragment;
import com.example.a4_8_5_java.fragment.ThreeFragment;
import com.example.a4_8_5_java.model.Contact;
import com.example.a4_8_5_java.model.Post;

import java.util.ArrayList;






public class ThreeFragmentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<Post> post;
    PostBinding binding;

    ThreeFragment fragmet;

    public ThreeFragmentAdapter(ThreeFragment fragmet, ArrayList<Post> post){
        this.post=post;
        this.fragmet=fragmet;
    }




    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        PostBinding binding = PostBinding.inflate(layoutInflater);
        return new CustomViewHolder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Post post1=post.get(position);

        if (holder instanceof CustomViewHolder){

            TextView post=((CustomViewHolder) holder).binding.postText;
            post.setText(post1.getPost());

        }
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        private final PostBinding binding;

        public CustomViewHolder(PostBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


    @Override
    public int getItemCount() {
        return post.size();
    }
}

