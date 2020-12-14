package com.example.qfoodv1;

import java.io.Serializable;

public class Food implements Serializable {

    Integer id;
    String name;
    String image;
    String description;

    public Food(Integer id, String name, String image, String description) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Food(String name, String description, String image) {
        this.name = name;
        this.image = image;
        this.description= description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
