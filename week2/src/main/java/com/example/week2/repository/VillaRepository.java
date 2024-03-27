package com.example.week2.repository;

import com.example.week2.model.Villa;

import java.util.List;
import java.util.ArrayList;

public class VillaRepository {
    private List<Villa> villaList = new ArrayList<>();

    public void addVilla(Villa villa) {
        villaList.add(villa);
    }

    public int allVillaPricesInTotal() {
        int total = 0;
        for (Villa villa : villaList) {
            total += villa.getPrice();
        }
        return total;
    }

    public int averageArea() {
        int total = 0;
        for (Villa villa : villaList) {
            total += villa.getArea();
        }
        return total / villaList.size();
    }
}
