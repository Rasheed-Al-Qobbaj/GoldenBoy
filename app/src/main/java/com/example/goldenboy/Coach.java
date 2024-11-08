package com.example.goldenboy;

public class Coach {
    private String name;
    private String speciality;
    private String phone;

    public Coach(String name, String speciality, String phone) {
        this.name = name;
        this.speciality = speciality;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return name+" - "+speciality+" - "+phone;
    }
}
