package com.example.week2.repository;

import com.example.week2.model.House;

public interface HouseRepository {
    void addHouse(House house);

    int allHousePricesInTotal();

    int averageArea();
}
