package com.Dani;

import java.util.*;

public class Theathre {
    private final String name;
    private List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER;
    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
    }

    public Theathre(String name, int numRows, int seatsPerRow) {
        this.name = name;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;

                if((row <'D') && (seatNum >=4 && seatNum <=9)){
                    price = 14.00;
                } else if((row > 'F') || (seatNum < 4 || seatNum > 9)){
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum),price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return name;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber,0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);

        if(foundSeat >= 0){
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    // for testing
    public Collection<Seat> getSeats() {
        return seats;
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.price = price;
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("reservation is canceld on " + seatNumber);
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }

    }


}

