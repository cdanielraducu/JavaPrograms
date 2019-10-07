package com.company;

public class Main {

    public static void main(String[] args) {
	SoccerPlayer Joe = new SoccerPlayer("joe");
	BaseballPlayer pat = new BaseballPlayer("Pat");
	FootballPlayer Beck = new FootballPlayer("Beck");

	Team <FootballPlayer> addelaideCrows = new Team<>("Adelaide Crows");
	//addelaideCrows.AddPlayer(Joe);
	//addelaideCrows.AddPlayer(pat);
	addelaideCrows.AddPlayer(Beck);
		System.out.println(addelaideCrows.numPlayers());
		Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago");
		baseballPlayerTeam.AddPlayer(pat);

		Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
    	brokenTeam.AddPlayer(Joe);
//testin code... + CHALLANGE
    }
}
