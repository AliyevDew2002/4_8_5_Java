package com.example.a4_8_5_java.model;

import java.io.Serializable;

public class Contact implements Serializable {
    int photo; String name,raqam;

    public Contact(int photo, String name, String raqam) {
        this.photo = photo;
        this.name = name;
        this.raqam = raqam;
    }

    public int getPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }

    public String getRaqam() {
        return raqam;
    }
}
