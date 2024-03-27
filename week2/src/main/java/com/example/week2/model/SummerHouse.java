package com.example.week2.model;

import com.example.week2.enums.HouseType;

public class SummerHouse extends House {
    private HouseType houseType = HouseType.SUMMERHOUSE;

    public SummerHouse() {
    }

    public SummerHouse(int price, int area, int numberOfRooms) {
        super(price, area, numberOfRooms);
    }

    public HouseType getHouseType() {
        return houseType;
    }

    @Override
    public String toString() {
        return "Summerhouse{" +
                "price=" + getPrice() +
                ", area=" + getArea() +
                ", numberOfRooms=" + getNumberOfRooms() +
                '}';
    }
}
