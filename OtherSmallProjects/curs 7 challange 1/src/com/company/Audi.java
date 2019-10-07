package com.company;

public class Audi extends Car {
    private int traction;
    private int bigPower;
    public Audi(int wheels, int body, int handSteering, int changingGears, int speed, int traction, int bigPower) {
        super(wheels, body, handSteering, changingGears, speed);
        this.traction = traction;
        this.bigPower = bigPower;
    }
    public void accelerate(int traction, int bigPower){
        changeSteer(traction);
        System.out.println("Your car is in control");
        steer(bigPower);
        System.out.println("Your car is on fireee");
    }
}
