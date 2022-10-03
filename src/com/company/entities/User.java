package com.company.entities;

public class User {
    private String name;
    private double money;
    private String type_Of_Fuel;

    public User(String name, double money, String type_Of_Fuel) {
        this.name = name;
        this.money = money;
        this.type_Of_Fuel = type_Of_Fuel;
    }

    public User() {

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getType_Of_Fuel() {
        return type_Of_Fuel;
    }

    public void setType_Of_Fuel(String type_Of_Fuel) {
        this.type_Of_Fuel = type_Of_Fuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
