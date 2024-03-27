package com.example.week2.repository;

import com.example.week2.model.Flat;

import java.util.List;
import java.util.ArrayList;

public class FlatRepository {
    private List<Flat> flatList = new ArrayList<>();

    public void addFlat(Flat flat) {
        flatList.add(flat);
    }

    public int allFlatPricesInTotal() {
        int total = 0;
        for (Flat flat : flatList) {
            total += flat.getPrice();
        }
        return total;
    }

    public int averageArea() {
        int total = 0;
        for (Flat flat : flatList) {
            total += flat.getArea();
        }
        return total / flatList.size();
    }
}
