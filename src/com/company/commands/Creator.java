package com.company.commands;

import com.company.entities.Fuel;
import com.company.entities.Station;
import com.company.entities.TypeOfFuel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Creator {
    static Scanner scanner = new Scanner(System.in);
    private static byte count = 0;

    public static double getDouble() {
        return scanner.nextDouble();
    }

    public static String getString() {
        return scanner.next();
    }

    public static List<Station> createstations() {
        ArrayList<Station> listStation = new ArrayList<Station>();
        for (int i = 0; i < 10; i++) {
            Station station1 = new Station(i, createFuel());
            listStation.add(station1);
        }
        return listStation;
    }

    private static ArrayList<Fuel> createFuel() {
        ArrayList<Fuel> fuels = new ArrayList<>();
        if (count < 8) {
            fuels.add(new Fuel(TypeOfFuel.BENZ.name(), 1000));
            fuels.add(new Fuel(TypeOfFuel.DIESEL.name(), 1000));
            fuels.add(new Fuel(TypeOfFuel.GAS.name(), 1000));
        } else {
            fuels.add(new Fuel(TypeOfFuel.BENZ.name(), 1000));
            fuels.add(new Fuel(TypeOfFuel.DIESEL.name(), 1000));
        }
        return fuels;
    }
}
