package com.company;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name){
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
    public void startEngine(){
        System.out.println("Starting the engine");
    }
    public void accelerate(){
        System.out.println("Accelarating...");
    }
    public void brake() {
        System.out.println("Brakes ON");
    }
}

class Audi extends Car{
    public Audi(int cylinders, String name) {
        super(cylinders, name);
    }
    public void startEngine(){
        System.out.println("Audi's ENGINE ON");
    }
    public void accelerate(){
        System.out.println("RAPPPAAUDI");
    }
    public void brake(){
        System.out.println("STOPPING THE AUDI");
    }
}

class BMW extends Car{
    public BMW(int cylinders, String name){
        super(cylinders, name);
    }
    public void startEngine(){
        System.out.println("BMW's ENGINE ON");
    }
}

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i<4; i++){
            Car car = randomCar();
            car.startEngine();
            car.accelerate();
            car.brake();
        }
    }
    public static Car randomCar(){
        int randomNumber = (int) (Math.random()*2 )+ 1;
        System.out.println("Random Number: " + randomNumber);
        switch(randomNumber){
            case 1 : return new Audi(5,"A1");
            case 2 : return new BMW(6,"M1");
        }
        return null;

    }
}
