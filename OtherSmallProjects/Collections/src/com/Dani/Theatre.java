package com.Dani;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String threatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String threatreName,int numRows, int seatsPerRows) {
        this.threatreName = threatreName;

        int lastRow = 'A' + (numRows -1);
        for(char row = 'A'; row<= lastRow; row ++){
            for(int seatNum = 1; seatNum <= seatsPerRows; seatNum++){
                Seat seat = new Seat(row + String.format("%02d",seatNum));
                seats.add(seat);
            }
        }

    }

    public String getThreatreName() {
        return threatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats,requestedSeat,null);
        if(foundSeat >= 0){
            return seats.get(foundSeat).reserver();
        } else {
            System.out.println("there is no seat " + seatNumber);
            return false;
        }
    }
    //for testing
    public void getSeats(){
        for( Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }
    private class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareTo(seat.getSeatNumber());
        }

        public boolean reserver(){
            if(this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
      }
      public boolean cancel(){
            if(this.reserved){
                this. reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
      }
      public String getSeatNumber(){
            return seatNumber;
      }
    }

}
