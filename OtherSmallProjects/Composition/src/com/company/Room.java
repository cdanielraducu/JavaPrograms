package com.company;

public class Room {
    private furniture theFurniture;
    private dimensions theDimensions;

    public Room(furniture theFurniture, dimensions theDimensions) {
        this.theFurniture = theFurniture;
        this.theDimensions = theDimensions;
    }

    public furniture getTheFurniture() {
        return theFurniture;
    }

    public void getDimensions(){
        System.out.println("The dimensions are "
                + this.theDimensions.getX() + " on X and "
        + this.theDimensions.getY() + " on Y");
    }
}
