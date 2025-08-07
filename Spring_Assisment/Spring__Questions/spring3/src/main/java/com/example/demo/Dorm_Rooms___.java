package com.example.demo;

public class Dorm_Rooms___ {
    private int number;
    private String building;

    public Dorm_Rooms___(int number, String building) {
        this.number = number;
        this.building = building;
    }

    public String getLocation() {
        return "Dorm #" + number + ", Building: " + building;
    }
}
