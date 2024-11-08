package com.example.goldenboy;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Dictionary;

public class Gym {
    private String name;
    private String address;
    private ArrayList<Coach> coaches;

    public Gym(String name, String address, ArrayList<Coach> coaches) {
        this.name = name;
        this.address = address;
        this.coaches = coaches;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


    public ArrayList<Coach> getCoaches() {
        return coaches;
    }

    @NonNull
    @Override
    public String toString() {
        return name+" - "+address;
    }

}
