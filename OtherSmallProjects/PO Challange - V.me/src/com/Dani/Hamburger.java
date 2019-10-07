package com.Dani;

import java.util.Scanner;

public class Hamburger {
    private Scanner input = new Scanner(System.in);
    private String rollType;
    private String meat;
    private int price;
    private String name;
    private int additions;
    private String listOfAdditions;
    public Hamburger(String rollType, String meat){
        this.rollType = rollType;
        this.meat = meat;
        this.price = 10;
        name = "Basic Hamburger";
        this.listOfAdditions += rollType + ", " + meat;
        this.additions = 0;
    }
    public int getPrice(){
        return price;
    }
    public int getAdditions(){
        return additions;
    }
    public boolean addAdditions(){
        if(getAdditions() < 4) return true;
        else return false;
    }
    public void MoretoAdd(){
        int x = 4 - getAdditions();
        System.out.println("you can now add still " + x + " more additions");
    }
    public void WhatAdditions(){
        System.out.println("(lettuce, bacon, egg, bbq-sauce)");
    }
    public void add(){
        if(addAdditions()) {
            System.out.println("What do u want to be added?");
            WhatAdditions();
            String itemAdded = input.nextLine();

            String x;
            switch (itemAdded) {

                case "lettuce":
                    System.out.println("Lettuce will be added for an extra of 1$, do you really want to do this?");
                    x = input.nextLine();
                    if (x.equals("yes")) {
                        this.price += 1;
                        System.out.println("Lettuce added, now the price is of the burger is: " + getPrice());
                    } else System.out.println("Nothing will be added");
                    this.listOfAdditions += ", lettuce";
                    break;
                case "bacon":
                    break;
                // same as the lettuce... for the rest of the cases
                default:
                    System.out.println("Nothing will be added");
            }
            System.out.println("do you want to know how many items you can add?");
            x = input.nextLine();
            if(x.equals("yes")) {
                MoretoAdd();
            }
            System.out.println("Addition Complete");
        } else System.out.println("You cannot add more to this burger");
        additions += 1;
    }


    // for exceptions
    public void setRollType(String rollType){
        this.rollType = rollType;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getListOfAdditions(){
        return listOfAdditions;
    }
}
