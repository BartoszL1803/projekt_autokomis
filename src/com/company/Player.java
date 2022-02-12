package com.company;

public class Player {
    public Double cash;
    public Car[] garage;
    public static final int DEFAULT_GARAGE_SIZE = 10;

    public Player(Double cash) {
        this.cash = cash;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }
}
