package com.company;

public class Healthyburger  extends Hamburger{
    private String HealthyName1;
    private double HealthyPrice1;

    private String HealthyName2;
    private double HealthyPrice2;

    public Healthyburger(double price, String meat) {
        super("healthy", meat, price, "Brown");
    }

    public void addHealth1(String name, double price){
        this.HealthyName1 = name;
        this.HealthyPrice1 = price;
    }
    public void addHealth2(String name, double price){
        this.HealthyName2 = name;
        this.HealthyPrice2 = price;
    }

    @Override
    public double Add() {
        double hamburgerPrice = super.Add();
        if(this.HealthyName1 != null) {
            hamburgerPrice += this.HealthyPrice1;
            System.out.println("Added" + this.HealthyName1);
            }
        if(this.HealthyName2 != null) {
            hamburgerPrice += this.HealthyPrice2;
            System.out.println("Added" + this.HealthyName2);
        }
    return hamburgerPrice;
    }

    }

