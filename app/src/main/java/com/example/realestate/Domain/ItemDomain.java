package com.example.realestate.Domain;

import java.io.Serializable;

public class ItemDomain implements Serializable {

    public String title;
    public String address;
    public String description;
    public double getPrice;

    public ItemDomain(String title, String address, String description, int bed, int bath, String pic, Boolean wifi) {
        this.title = title;
        this.address = address;
        this.description = description;
        this.bed = bed;
        this.bath = bath;
        this.pic = pic;
        this.wifi = wifi;
    }

    public int bed;
    public int bath;
    public String pic;
    public Boolean wifi;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getBath() {
        return bath;
    }

    public void setBath(int bath) {
        this.bath = bath;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isWifi() {
        return false;
    }
}


