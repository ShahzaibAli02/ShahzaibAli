package com.example.upsell.Model;

public class Body
{

    public int image;
    public String distance;
    public String title;
    public String Price;
    public String Service;
    public String oldPrice;
    public String percentOff;

    public Body(int image, String distance, String title, String price, String service, String oldPrice, String percentOff, boolean hasOff) {
        this.image=image;
        this.distance=distance;
        this.title=title;
        Price=price;
        Service=service;
        this.oldPrice=oldPrice;
        this.percentOff=percentOff;
        this.hasOff=hasOff;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image=image;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance=distance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price=price;
    }

    public String getService() {
        return Service;
    }

    public void setService(String service) {
        Service=service;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice=oldPrice;
    }

    public String getPercentOff() {
        return percentOff;
    }

    public void setPercentOff(String percentOff) {
        this.percentOff=percentOff;
    }

    public boolean isHasOff() {
        return hasOff;
    }

    public void setHasOff(boolean hasOff) {
        this.hasOff=hasOff;
    }

    boolean hasOff;

}
