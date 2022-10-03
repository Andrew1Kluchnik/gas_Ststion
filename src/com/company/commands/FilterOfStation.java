package com.company.commands;

import com.company.entities.Fuel;
import com.company.entities.Station;

import java.util.ArrayList;
import java.util.List;

public class FilterOfStation {
    public static List<Station> Filter(List<Station> stationList, String nameOfFuel) {
        ArrayList<Station> arrayList = new ArrayList<>();
        for (Station station : stationList) {
            for (Fuel fuel : station.getListOfFuel()) {
                if (fuel.getName().equals(nameOfFuel)) {
                    arrayList.add(station);
                }
            }

        }
        return arrayList;
    }
}
