package com.example.qfoodv1;

import android.graphics.Bitmap;

import java.io.Serializable;

public class Food implements Serializable {
    String name;
    Bitmap image;

    public Food(String name, Bitmap image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", image=" + image +
                '}';
    }
}
