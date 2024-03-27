package com.example.week2.model;

import com.example.week2.enums.HouseType;

public class Villa extends House {
    private HouseType houseType = HouseType.VILLA;


    public Villa() {
    }

    public Villa(int price, int area, int numberOfRooms) {
        super(price, area, numberOfRooms);
    }

    public HouseType getHouseType() {
        return houseType;
    }


    @Override
    public String toString() {
        return "Villa{" +
                "price=" + getPrice() +
                ", area=" + getArea() +
                ", numberOfRooms=" + getNumberOfRooms() +
                '}';
    }
}
