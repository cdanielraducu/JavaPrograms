package com.company;

public class Persoana {

    private int varsta;
    private double inaltime;
    private String tip;

    public Persoana() {
        System.out.println("nu s-au specificat detaliile pers.");
        this.varsta = 0;
        this.inaltime = 0;
        this.tip = "None";
    }

    public Persoana(int varsta, double inaltime, String tip) {
        System.out.println("s-au specificat detaliile pers.");
        this.varsta = varsta;
        this.inaltime = inaltime;
        this.tip = tip;
    }

    public void detalii(){
        System.out.println("aceasta pers. are varsta de " + this.varsta +
                " ani, cu o intaltime de " + this.inaltime + " de cm, si " +
                "e de tipul "+ this.tip);
    }
}
