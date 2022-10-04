package com.company.entities;

public class User {
    private String name;
    private double money;
    private String fuel;
    private int quantity;
    private byte post;

    public User(String name, double money, String fuel, int quantity, byte post) {
        this.name = name;
        this.money = money;
        this.fuel = fuel;
        this.quantity = quantity;
        this.post = post;
    }

    public User() {

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getPost() {return post;}

    public void setPost(byte post) {this.post = post;}
}
