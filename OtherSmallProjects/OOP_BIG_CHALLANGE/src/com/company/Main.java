package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("BASIC", "Sausage", 3.56, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Lettue",0.5);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon" , 5);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHamburgerAddition1("Egg",2);
        healthyBurger.addHealthAddition1("RUCCOLLA",5);
        System.out.println("total healthy burger price is " +
                healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50);
        db.itemizeHamburger();
    }
}
