package com.company;
import java.util.Scanner;
public class Burger {
    Scanner input = new Scanner(System.in);
    private String name;
    private int price;
    public Burger(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void add(){
        System.out.println("do you want to add one more on this burger?");
        if(input.nextLine() == "Da"){
            System.out.println("what do you want from: Tomato," +
                    "Letuce, Onion, More cheese, bacon");
            input.nextLine();
            String x= input.nextLine();
            switch(x){
                case "Tomato" : this.price +=1;
                case "Letuce" : this.price +=0;
                case "Onion" : this.price +=5;
                case "More cheese" : this.price +=2;
                case "bacon" : this.price +=3;
                default : System.out.println("you have nor selected anything");
            }
        }
    }
}
class Hamburger extends Burger{
    private String Ham;
    private String Beaf;

    public Hamburger(String name, int price, String ham, String beaf) {
        super(name, price);
        Ham = ham;
        Beaf = beaf;
    }
}

class Cheeseburger extends Burger{
    private String Cheese;
    public Cheeseburger(String name, int price, String Cheese){
        super(name,price);
        this.Cheese = Cheese;

    }
}