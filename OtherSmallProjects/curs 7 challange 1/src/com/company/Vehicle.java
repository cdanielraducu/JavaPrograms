package com.company;

public class Vehicle {
    private int wheels;
    private int body;
    private int handSteering;

    public Vehicle(int wheels, int body, int handSteering) {
        this.wheels = wheels;
        this.body = body;
        this.handSteering = handSteering;
    }

    public void steer(int direction){
        this.handSteering = direction;
        System.out.println("this is car is going with " + handSteering + "km/hour");

    }
}
