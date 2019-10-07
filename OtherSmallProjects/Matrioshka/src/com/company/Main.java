package com.company;

public class Main {

    public static void main(String[] args) {
        Cutie cutie1 = new Cutie(1,1,1,1);
        Cutie cutie3 = new Cutie(2 ,2,2,2);
        Cutie cutie2 = new Cutie(3,3,3,3);
        Cutie cutie4 = new Cutie(4,4,4,4);
        cutie1.volum();
        cutie2.volum();
        cutie3.volum();
        cutie4.volum();

        if(cutie1.getV() < cutie2.getV() && cutie3.getV() < cutie4.getV())
            if(cutie2.getV()<cutie3.getV())
            System.out.println("E o matrioshka");
        else System.out.println("Nu se poate face o matrioska");
    }
}
