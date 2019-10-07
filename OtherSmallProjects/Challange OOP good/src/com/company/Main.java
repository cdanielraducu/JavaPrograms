package com.company;

public class Main {

    public static void main(String[] args) {
    Hamburger hamburger = new Hamburger("Dani's Hamburger", "Bacon", 3.99,"Black");
    hamburger.setAddition1("Ham", 0.99);
    hamburger.setAddition2("tomato",0.5);
    hamburger.setAddition3("SOS",1.2);
    double price = hamburger.Add();
    System.out.println(String.format("%.2f",hamburger.getPrice()));

    Healthyburger healthyburger = new Healthyburger(5.5, "Chicken");

    healthyburger.setAddition1("Egg",5.67);

    healthyburger.addHealth1("Lettuce",1.1);
    System.out.println("total healthy burger price is " +healthyburger.Add());

    DeluxeBurger db = new DeluxeBurger();
    db.Add();
    db.setAddition1("More chips",5);
    }
}
