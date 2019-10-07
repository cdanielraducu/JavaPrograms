package com.company;

public class EnchandePlayer {
    private String name;
    private int HP = 100;
    private String weapon;

    public EnchandePlayer(String name, int health, String weapon) {
        this.name = name;
        if(health> 0 && health<=100) {
            this.HP = health;
        }
        this.weapon = weapon;
    }

    public int getHP() {
        return HP;
    }
}
