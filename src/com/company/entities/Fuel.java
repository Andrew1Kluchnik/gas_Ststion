package com.company.entities;

public class Fuel {
    private String name;
    private double fuelQuantity;

    public Fuel(String name, double fuelQuantity) {
        this.name = name;
        this.fuelQuantity = fuelQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }
}
