package com.company;

public class DeluxeBurger extends Hamburger {
    @Override
    public void setAddition1(String name, double price) {
        System.out.println("NO");
    }

    @Override
    public void setAddition2(String name, double price) {
        System.out.println("NONO");
    }

    @Override
    public void setAddition3(String name, double price) {
        System.out.println("NONONO");
    }

    @Override
    public void setAddition4(String name, double price) {
      System.out.println("NONONONO");
    }

    public DeluxeBurger() {
        super("Deluxe", "Chicken & Beaf",10, "white");
        super.setAddition1("Chips",3);
        super.setAddition2("drink",2.3);

    }
}
