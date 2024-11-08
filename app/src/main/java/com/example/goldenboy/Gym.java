package com.example.goldenboy;

import androidx.annotation.NonNull;

import java.util.ArrayList;

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

    @NonNull
    @Override
    public String toString() {
        return name+" - "+address;
    }
}
