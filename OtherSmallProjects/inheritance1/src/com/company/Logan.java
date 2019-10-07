package com.company;

public class Logan extends Car{
    private double motor;

    public Logan(int Gear, int wheels, int doors, String color, String type, String origin, int cost, double motor) {
        super(Gear, wheels, doors, color, type, origin, cost);
        this.motor = motor;
    }

    public void accelerate(){
        super.move();
        System.out.println("Now the car is accelerating");
    }
    public void accelerate(int percent){
        if(percent > 50 ){
            if(getGear()>1) {
                setGear(getGear() - 1);
            }
            super.changingGears(getGear());
            System.out.println("The car is acc at "+ percent + "%");
        }else System.out.println("The car is acc at "+ percent + "%");

    }

}
