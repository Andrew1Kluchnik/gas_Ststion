package com.company.entities;

public class Fuel {
    private TypeOfFuel type;
    private int quantity;
    private int cost;

    public Fuel(TypeOfFuel type, int quantity, int cost) {
        this.type = type;
        this.quantity = quantity;
        this.cost = cost;
    }

    public TypeOfFuel getType() {
        return type;
    }

    public void setType(TypeOfFuel type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", type, quantity, cost);
    }
}
