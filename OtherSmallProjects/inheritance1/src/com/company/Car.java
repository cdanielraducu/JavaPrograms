package com.company;

public class Car extends Vehicle {
    private String type;
    private String origin;
    private int cost;
    public Car(int Gear,int wheels, int doors, String color, String type, String origin, int cost){
        super(wheels,doors,color,Gear);
        this.type = type;
        this.origin = origin;
        this.cost = cost;
    }
    public void steering(String option){
        System.out.println("The car is steering to " + option);
    }
    public void move(){
        System.out.println("The car is moving");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
