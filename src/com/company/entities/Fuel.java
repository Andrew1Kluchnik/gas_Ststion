package com.company.entities;

public class Fuel {
    private TypeOfFuel type;
    private int quantity;

    public Fuel(TypeOfFuel type, int quantity) {
        this.type = type;
        this.quantity = quantity;
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

    @Override
    public String toString() {
        return String.format("%s - %d", type, quantity);
    }
}
