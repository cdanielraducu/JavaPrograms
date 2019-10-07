package com.Dani;

import javax.swing.plaf.TableHeaderUI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theathre theathre = new Theathre("Oly", 10, 8);

        if (theathre.reserveSeat("A02")) {
            System.out.println("please pay");
        } else {
            System.out.println("already reserved");
        }

        if (theathre.reserveSeat("C05")) {
            System.out.println("please pay");
        } else {
            System.out.println("already reserved");
        }
        List<Theathre.Seat> reverseSeats = new ArrayList<>(theathre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theathre.Seat> priceSeats = new ArrayList<>(theathre.getSeats());
        priceSeats.add(theathre.new Seat("B01", 13.00));
        priceSeats.add(theathre.new Seat("A01",13.00));
        Collections.sort(priceSeats, Theathre.PRICE_ORDER);
        printList(priceSeats);
    }




    public static void printList(List<Theathre.Seat> list){
        for(Theathre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());

        }
        System.out.println();
        System.out.println("=================================");
    }

}
