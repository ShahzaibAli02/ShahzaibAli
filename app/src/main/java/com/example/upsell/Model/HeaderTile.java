package com.example.upsell.Model;

import java.util.UUID;

public class HeaderTile {

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

    public HeaderTile(String name) {
        this.name=name;
        this.id=UUID.randomUUID().toString();
    }

    public  String name;
    public  String id;


}
