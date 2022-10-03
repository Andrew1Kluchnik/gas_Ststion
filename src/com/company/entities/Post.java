package com.company.entities;

import java.util.List;

/**
 * Колонка
 */
public class Post {
    private int number;
    private List<Fuel> fuels;

    public Post(int number, List<Fuel> fuels) {
        this.number = number;
        this.fuels = fuels;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Fuel> getFuels() {
        return fuels;
    }

    public void setFuels(List<Fuel> fuels) {
        this.fuels = fuels;
    }
}
