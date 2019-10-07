package com.company;

public class Vehicle {
    private int wheels;
    private int doors;
    private String color;
    private int Gear;

    public Vehicle(int wheels, int doors, String color, int Gear) {
        this.wheels = wheels;
        this.doors = doors;
        this.color = color;
        this.Gear = Gear;
    }
    public void changingGears(int Gear){
        System.out.println("it changed to " + Gear + " gear");
    }

    public int getGear() {
        return Gear;
    }

    public void setGear(int gear) {
        Gear = gear;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
