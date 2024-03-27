package com.example.week2.model;

import com.example.week2.enums.HouseType;

public class Flat extends House {
    private HouseType houseType = HouseType.FLAT;

    public Flat() {
    }

    public Flat(int price, int area, int numberOfRooms) {
        super(price, area, numberOfRooms);
    }

    public HouseType getHouseType() {
        return houseType;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "price=" + getPrice() +
                ", area=" + getArea() +
                ", numberOfRooms=" + getNumberOfRooms() +
                '}';
    }
}
