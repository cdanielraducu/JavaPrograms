package com.Dani;

public class HealthyBurger extends Hamburger {

    public HealthyBurger(String rollType, String meat) {
        super(rollType, meat);

    }

    @Override
    public boolean addAdditions() {
        if(getAdditions() < 6 ) return true;
        else return false;
    }

    @Override
    public void MoretoAdd() {
        int x = 6 - getAdditions();
        System.out.println(" you can now add still " + x + " more additions");
    }
    @Override
    public void WhatAdditions(){
        System.out.println("(lettuce, bacon, egg, bbq-sauce, tomatoes, guacoamole)");
    }
}
