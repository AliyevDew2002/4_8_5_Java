package com.example.a4_8_5_java.model;

import java.io.Serializable;

public class Post implements Serializable {
    String post;

    public Post(String post){
        this.post=post;
    }

    public String getPost() {
        return post;
    }
}
