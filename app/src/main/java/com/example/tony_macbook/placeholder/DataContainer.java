package com.example.tony_macbook.placeholder;

import java.util.ArrayList;

public class DataContainer {

    private String name;
    private int id;
    private ArrayList<String> categories = new ArrayList<String>();
    private String description;
    private String time;
    private String address;
    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCategories(String category) {
        this.categories.add(category);
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return id + ": " + name + "\n" + description + "-" + time
                + "\n" + address + date;
    }

}