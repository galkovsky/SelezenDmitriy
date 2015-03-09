package com.company;

/**
 * Created by Дмитрий on 02.03.2015.
 */
public class SelfFixesCar extends Car {

    public SelfFixesCar(String name) {
        super(name);
    }

    public void move() {
        if(isBroken){
            position += 0;
            isBroken = false;
            name = "SelfFixing";
        }
        else {
            if((Math.random() * 100) > 98){
                isBroken = true;
                name = name + " broken!";
            }
            position += speed;
            if ((Math.random() * 100) > 60) {
                position += speed + n2o;
            } else {
                position += speed;
            }
        }
    }
}
