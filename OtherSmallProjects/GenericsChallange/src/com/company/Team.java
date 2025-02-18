package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Team<T extends Player> {
    private String name;
    int played = 0;
    int won = 0;
    int loss = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already added to the team");
            return false;
        }
        else{
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }
    public int numPlayers(){
        return this.members.size();

    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        if(ourScore > theirScore){
            won++;
        } else if(ourScore == theirScore){
            tied++;
        } else {
            loss++;
        }
        played++;
        if(opponent != null) {
            opponent.matchResult(null,theirScore,ourScore);
            //puttint the result to the enemy team also
        }
    }
    public int ranking() {
        return ((won * 2) + tied);
    }

}
