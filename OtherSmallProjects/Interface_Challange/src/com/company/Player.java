package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int HP;
    private int strength;

    public Player(String name, int HP, int strength) {
        this.name = name;
        this.HP = HP;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", HP=" + HP +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,"" + this.HP);
        values.add(2,""+ this.strength);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
            if(savedValues != null && savedValues.size() >0){
                this.name = savedValues.get(0);
                this.HP = Integer.parseInt(savedValues.get(1));
                this.strength = Integer.parseInt(savedValues.get(2));

            }
    }
}
