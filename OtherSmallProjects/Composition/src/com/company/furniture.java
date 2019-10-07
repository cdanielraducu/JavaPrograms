package com.company;

public class furniture {
    private int chairs;
    private int beds;
    private int tables;

    public int getChairs() {
        return chairs;
    }

    public int getBeds() {
        return beds;
    }

    public int getTables() {
        return tables;
    }

    public furniture(int chairs, int beds, int tables) {
        this.chairs = chairs;
        this.beds = beds;
        this.tables = tables;
    }
}
