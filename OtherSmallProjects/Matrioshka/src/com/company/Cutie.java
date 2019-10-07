package com.company;

import java.util.Arrays;

public class Cutie {
    private int id;
    private double latime;
    private double lungime;
    private double intaltime;
    private double v;

    public Cutie(int id, double latime, double lungime, double intaltime) {
        this.id = id;
        this.latime = latime;
        this.lungime = lungime;
        this.intaltime = intaltime;
        this.v = 0;
    }
    public void volum(){
        this.v = this.latime * this.lungime * this.intaltime;
        System.out.println("Cutia "+ this.id + " are volumul: " + v);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getIntaltime() {
        return intaltime;
    }

    public void setIntaltime(double intaltime) {
        this.intaltime = intaltime;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }
}
