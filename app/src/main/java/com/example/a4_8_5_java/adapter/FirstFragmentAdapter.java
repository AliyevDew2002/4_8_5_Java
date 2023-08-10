package com.example.a4_8_5_java.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a4_8_5_java.databinding.ContactQolipBinding;
import com.example.a4_8_5_java.fragment.FirstFragment;
import com.example.a4_8_5_java.model.Contact;

import java.util.ArrayList;



public class FirstFragmentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<Contact> contact;
    ContactQolipBinding binding;

    FirstFragment fragmet;

    public FirstFragmentAdapter(FirstFragment fragmet, ArrayList<Contact> contact){
        this.contact=contact;
        this.fragmet=fragmet;
    }




    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        ContactQolipBinding binding = ContactQolipBinding.inflate(layoutInflater);
        return new CustomViewHolder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Contact contact1=contact.get(position);

        if (holder instanceof CustomViewHolder){

            ImageView photo=((CustomViewHolder) holder).binding.ivPhoto;
            TextView name=((CustomViewHolder) holder).binding.name;
            TextView raqam=((CustomViewHolder) holder).binding.raqam;


            photo.setImageResource(contact1.getPhoto());
            name.setText(contact1.getName());
            raqam.setText(contact1.getRaqam());

        }
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        private final ContactQolipBinding binding;

        public CustomViewHolder(ContactQolipBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


    @Override
    public int getItemCount() {
        return contact.size();
    }
}
