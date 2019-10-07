package com.company;

public class Main {

    public static void main(String[] args) {
        GearBox audi = new GearBox(6);
        audi.addGear(1,5.3);
        audi.addGear(2,10.7);
        audi.addGear(3,15);
        audi.operate(true);
        audi.changeGear(1);
        audi.operate(false);
        System.out.println(audi.speed(1000));
        audi.changeGear(2);
        System.out.println(audi.speed(3000));
        audi.operate(true);
        audi.changeGear(3);
        audi.operate(false);
        System.out.println(audi.speed(600));
    }
    //optimization part2 of inner classes timBuchalka
}
