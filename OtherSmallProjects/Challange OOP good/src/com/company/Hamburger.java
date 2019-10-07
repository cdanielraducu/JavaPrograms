package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadType;


    public Hamburger(String name, String meat, double price, String breadType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadType = breadType;

    }

    //for addition we need prices and names to keep count
    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public void setAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void setAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void setAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void setAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }
    public double Add(){
        double HamburgerPrice = this.price;
        System.out.println(this.name + " on a " + this.breadType +
                ", price is " + this.price);
        if(this.addition1Name != null) {
            HamburgerPrice +=this.addition1Price;
            System.out.println("Added" + this.addition1Name +
                    ", with the price " + this.addition1Price);
        }
        if(this.addition2Name != null) {
            HamburgerPrice +=this.addition2Price;
            System.out.println("Added" + this.addition2Name +
                    ", with the price " + this.addition2Price);
        }

        if(this.addition3Name != null) {
            HamburgerPrice +=this.addition3Price;
            System.out.println("Added" + this.addition3Name +
                    ", with the price " + this.addition3Price);
        }

        if(this.addition4Name != null) {
            HamburgerPrice +=this.addition4Price;
            System.out.println("Added " + this.addition4Name +
                    ", with the price " + this.addition4Price);
        }
    this.price = HamburgerPrice;
    return HamburgerPrice;
        }

    public double getPrice() {
        return price;
    }
}

