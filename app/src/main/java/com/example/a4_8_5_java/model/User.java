package com.example.a4_8_5_java.model;

import java.io.Serializable;

public class User implements Serializable {

    int photo; String name,kaspi;

    public User(int photo, String name, String kaspi) {
        this.photo = photo;
        this.name = name;
        this.kaspi = kaspi;
    }

    public int getPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }

    public String getKaspi() {
        return kaspi;
    }
}
