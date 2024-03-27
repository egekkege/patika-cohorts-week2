package com.example.week2.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import com.example.week2.repository.*;
import com.example.week2.model.*;

@Service
@Scope("singleton")
public class HouseService {
    private FlatRepository flatRepository = new FlatRepository();
    private VillaRepository villaRepository = new VillaRepository();
    private SummerhouseRepository summerHouseRepository = new SummerhouseRepository();

    public Flat addFlat(Flat flat) {
        flatRepository.addFlat(flat);
        return flat;
    }

    public Villa addVilla(Villa villa) {
        villaRepository.addVilla(villa);
        return villa;
    }

    public SummerHouse addSummerHouse(SummerHouse summerHouse) {
        summerHouseRepository.addSummerHouse(summerHouse);
        return summerHouse;
    }

}
