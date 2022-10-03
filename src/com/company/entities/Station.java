package com.company.entities;

import com.company.entities.Fuel;

import java.util.ArrayList;

public class Station {
    private int numberOfStation;
    private ArrayList<Fuel> listOfFuel = new ArrayList<Fuel>();

    public Station(int numberOfStation, ArrayList<Fuel> listOfFuel) {
        this.numberOfStation = numberOfStation;
        this.listOfFuel = listOfFuel;
    }

    public int getNumberOfStation() {
        return numberOfStation;
    }

    public void setNumberOfStation(int numberOfStation) {
        this.numberOfStation = numberOfStation;
    }

    public ArrayList<Fuel> getListOfFuel() {
        return listOfFuel;
    }

    public void setListOfFuel(ArrayList<Fuel> listOfFuel) {
        this.listOfFuel = listOfFuel;
    }
}
