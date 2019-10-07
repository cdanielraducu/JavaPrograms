package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("DELUX","MEAT", 15, "DIAMOND WHITE");
        super.addHamburgerAddition1("Egg",5);
        super.addHamburgerAddition2("DRINK", 1);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add");
    }
}
