package com.company;

public class Room {
    int doors;
    String TypeofBed;
    int windows;
    walls wall;

    public Room(int doors, String typeofBed, int windows, walls wall) {
        this.doors = doors;
        TypeofBed = typeofBed;
        this.windows = windows;
        this.wall = wall;
    }
    public walls getWall(){
        return wall;
    }
    public int getDoors() {
        return doors;
    }

    public String getTypeofBed() {
        return TypeofBed;
    }

    public int getWindows() {
        return windows;
    }
    public void changeColour(){

        wall.change();
    }

}
