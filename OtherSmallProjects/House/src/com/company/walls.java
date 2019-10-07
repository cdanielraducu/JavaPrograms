package com.company;
import java.util.Scanner;

public class walls {
    private String colour;
    private int weidth;
    private int height;
    Scanner input = new Scanner(System.in);

    public walls(String colour, int weidth, int height) {
        this.colour = colour;
        this.weidth = weidth;
        this.height = height;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWeidth(int weidth) {
        this.weidth = weidth;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColour() {
        return colour;
    }

    public int getWeidth() {
        return weidth;
    }

    public int getHeight() {
        return height;
    }
    public void change(){
        System.out.println("Changing the colour to...");
        this.colour = input.nextLine();
    }
}
