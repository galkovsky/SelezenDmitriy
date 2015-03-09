package com.company;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {new Car("Red car"), new Car("Green car"), new Car("Blue car"), new SelfFixesCar("SelfFixing")};
        Race myRace = new Race(500, cars);

        myRace.start();
    }
}
