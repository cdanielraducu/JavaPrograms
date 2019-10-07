package com.company;

public class Printer {
    private int tonerLevel= 1;
    private int numberPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel,int numberPages,boolean duplexPrinter){
        this.tonerLevel=tonerLevel;
        this.numberPages=numberPages;
        this.duplexPrinter=duplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
    public void UP(int x){
        if(tonerLevel<=100) {
            this.tonerLevel = this.tonerLevel + x;
            if(this.tonerLevel>100){
                x = this.tonerLevel - 100;
                this.tonerLevel = this.tonerLevel - x;
                System.out.println("It's already 100%, you" +
                        "you have an addition of " + x + " more");
            }
        }
    }
    //you can add a method of printing pages, whether is a duplex
    //or not, is your choice
}
