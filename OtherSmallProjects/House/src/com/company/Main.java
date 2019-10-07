package com.company;

public class Main {

    public static void main(String[] args) {
	Room Bedroom = new Room(2,"fluffy",1,new walls("Alb",3,5));
	System.out.println(Bedroom.wall.getColour());
	Bedroom.changeColour();
	System.out.println(Bedroom.wall.getColour());
	Bedroom.getWall().change();
	System.out.println(Bedroom.wall.getColour());
    }
}
