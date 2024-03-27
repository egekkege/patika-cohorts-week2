package com.example.week2.repository;

import com.example.week2.model.SummerHouse;

import java.util.ArrayList;
import java.util.List;

public class SummerhouseRepository {
    private List<SummerHouse> summerHouseList = new ArrayList<>();

    public void addSummerHouse(SummerHouse summerHouse) {
        summerHouseList.add(summerHouse);
    }

    public int allSummerHousePricesInTotal() {
        int total = 0;
        for (SummerHouse summerHouse : summerHouseList) {
            total += summerHouse.getPrice();
        }
        return total;
    }

    public int averageArea() {
        int total = 0;
        for (SummerHouse summerHouse : summerHouseList) {
            total += summerHouse.getArea();
        }
        return total / summerHouseList.size();
    }
}
