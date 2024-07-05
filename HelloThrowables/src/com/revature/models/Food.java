package com.revature.models;

public class Food {

    public String name;
    public boolean isCookie;

    //right click -> generate -> constructor
    public Food(String name, boolean isCookie) {
        this.name = name;
        this.isCookie = isCookie;
    }
}
