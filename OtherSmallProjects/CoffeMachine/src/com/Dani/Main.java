package com.Dani;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1 cup: 200 ml of water, 50 ml milk, 15 g of coffee beans;
        //System.out.println("Write how many cups of coffe you will need: ");
        Scanner scanner = new Scanner(System.in);
        //int cups = scanner.nextInt();
        // scanner.nextLine();
        //System.out.println("For " + cups + " cups of coffe you will need: \n" +
        // cups*200 + " ml of water\n" + cups*50 + " ml of milk\n" + cups*15 + " g of coffe beans");
        System.out.print("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        System.out.print("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        System.out.print("Write how many grams of coffee beans the coffee machine has: ");
        int coffeBeans = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        System.out.print("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();
        scanner.nextLine();
        System.out.println();


        int auxCup = cups;

        while((water - 200 >= 0) && (milk - 50 >= 0) && (coffeBeans - 15 >= 0) && (auxCup>0)){
            water-=200;
            milk-=50;
            coffeBeans-=15;
            auxCup--;
        }
        if(((water < 200 ) || (milk < 50) || ( coffeBeans < 15 )) && (auxCup>0)){
            System.out.println("No, I can make only " + (cups-auxCup) + " cup(s) of coffee");
        }
        cups -= auxCup;

        int remainingCupsToMake = 0;
        int auxWater = water;
        int auxMilk = milk;
        int auxCoffeBeens = coffeBeans;
        while((auxWater - 200 >= 0) && (auxMilk - 50 >= 0) && (auxCoffeBeens - 15 >= 0)){
            auxWater-=200;
            auxMilk-=50;
            auxCoffeBeens-=15;
            remainingCupsToMake++;
        }

        if(cups >= 0){
            System.out.println("Yes, I can make that amount of coffee (and even " + remainingCupsToMake +" more than that)");
        }

        }}

