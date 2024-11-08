package com.example.goldenboy;

import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<Gym> gyms;

    public City(String name, ArrayList<Gym> gyms) {
        this.name = name;
        this.gyms = gyms;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Gym> getGyms() {
        return gyms;
    }


}
