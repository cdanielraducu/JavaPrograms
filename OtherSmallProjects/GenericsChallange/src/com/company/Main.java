package com.company;

public class Main {

    public static void main(String[] args) {
	FootballPlayer joe = new FootballPlayer("Joe");
	BaseballPlayer pat = new BaseballPlayer("Pat");
	SoccerPlayer bob = new SoccerPlayer("bob");

	Team<FootballPlayer> Crows = new Team<>("Crows");
	Crows.addPlayer(joe);
	//Crows.addPlayer(pat);
	//Crows.addPlayer(bob);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("Cubs");
        soccerTeam.addPlayer(bob);
    }
}
