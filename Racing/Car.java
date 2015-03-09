package com.company;

public class Car {
    String name;
    int position = 0;
    int n2o = 20;
    int speed = 10;
    boolean isBroken = false;

    public Car(){}

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        if(isBroken){
            position += 0;
        }
        else {
            if((Math.random() * 100) > 98){
                isBroken = true;
                name = name + " broken!";
                return;
            }
            position += speed;
            if ((Math.random() * 100) > 60) {
                position += speed + n2o;
            } else {
                position += speed;
            }
        }
    }

    public String toString(){
        return name + " with position " + position;
    }
}

