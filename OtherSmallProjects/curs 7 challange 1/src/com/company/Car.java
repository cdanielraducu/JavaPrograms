package com.company;

public class Car extends Vehicle {
    private int ChangingGears;
    private int speed;

    public Car(int wheels, int body, int handSteering, int changingGears, int speed) {
        super(wheels, body, handSteering);
        ChangingGears = changingGears;
        this.speed = speed;
    }

    public void setChangingGears(int currentGear){
        ChangingGears = currentGear;
        System.out.println("This car is in gear " + ChangingGears);

    }
    public void changeSteer(int speed){
        steer(speed);
        System.out.println("this car is drifting with " + speed);
    }
}
