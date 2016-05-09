package com.example.tony_macbook.placeholder;

import java.util.ArrayList;

/*********************************************
 * Custom Class DataContainer              ***
 * *** Stores event data for parsing/reuse ***
 *********************************************/


public class DataContainer {

    // Variables
    private String name;
    private int id;
    private ArrayList<String> categories = new ArrayList<String>();
    private String description;
    private String time;
    private String address;
    private String date;
    private String google_addr = "http://maps.google.co.in/maps?q=";

    /******* TODO: REORDER PROPERLY *******/

    // Create String used in GoogleMaps
    // TODO: Has a bug where it outputs multiple +'s, but this does not affect the mapping
    private void setGoogleAddress(String str) {
        // Loop through Address and populate google_addr
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ',' || str.charAt(i) == ' ') {
                google_addr += '+';
            } else {
                google_addr += str.charAt(i);
            }
        }
    }

    /***  GETTERS ***/

    public String getGoogleAddr() {
        return google_addr;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public String getAddress() {
        return address;
    }

    public String getTime() {
        return time;
    }

    public int getId() {
        return id;
    }

    /*** SETTERS ***/

    public void setName(String name) {
        this.name = name;
    }


    public void setDate(String date) {
        this.date = date;
    }

    public void setCategories(String category) {
        this.categories.add(category);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // To-String for output in ListView
    @Override
    public String toString() {

        // Complete the GoogleAddress String for GoogleMaps
        setGoogleAddress(address);

        String ret_string = "Event/Loc Name: " + name + "\n";

        if (description != "") {
            ret_string += "Description: " + description;
        }

        if (categories != null) {

            String cats = "Categories: ";
            for (String x: categories) {
                cats += x + ", ";
            }

            ret_string += "\n" + cats.substring(0,cats.length()-2);
        }

        // To-String Return
        return ret_string;
    }

}