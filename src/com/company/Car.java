package com.company;

public class Car implements Repair {
    public Integer carNumber;
    public Double value;
    public String producer;
    public Double millage;
    public String color;
    public String classOfCar;

    public Car(Integer carNumber, Double value, String producer, Double millage, String color, String classOfCar) {
        this.carNumber = carNumber;
        this.value = value;
        this.producer = producer;
        this.millage = millage;
        this.color = color;
        this.classOfCar = classOfCar;
    }

    public void repair(Player player, Car car, String partOfCar) {
        if (partOfCar == "Break") {
            player.cash -= 100.0;
            car.value *= 1.1;
        } else if (partOfCar == "Suspension") {
            player.cash -= 200.0;
            car.value *= 1.2;
        } else if (partOfCar == "") {
            player.cash -= 1000.0;
            car.value *= 2;
        } else if (partOfCar == "Body") {
            player.cash -= 500.0;
            car.value *= 1.5;
        } else if (partOfCar == "Transmission") {
            player.cash -= 500.0;
            car.value *= 1.5;
        } else {
            System.out.println("You cant repair this part of car");
        }
    }
}