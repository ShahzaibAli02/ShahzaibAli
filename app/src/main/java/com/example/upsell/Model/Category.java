package com.example.upsell.Model;

import java.util.UUID;

public class Category {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id=id;
    }



    public  String name;

    public Category(String name, int imageId) {
        this.name=name;
        this.imageId=imageId;
        this.id=UUID.randomUUID().toString();
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId=imageId;
    }

    public  int imageId;
    public  String id;
}
