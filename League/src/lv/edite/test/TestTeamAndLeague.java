package lv.edite.test;

import java.util.ArrayList;

import lv.edite.module.League;
import lv.edite.module.Team;

public class TestTeamAndLeague {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Team> khlTeam = new ArrayList<>();
		
			
		Team ska = new Team("SKA");
		Team cska = new Team("CSKA");
		Team dinamo = new Team("DINAMO");
		Team spartak = new Team("Spartak");
		Team torpedo = new Team("Torpedo");
		Team jokerit = new Team("Jokerit");
				
		System.out.println("Team total point: "+ska.totalPoint());
		
		khlTeam.add(ska);
		khlTeam.add(cska);
		khlTeam.add(dinamo);
		khlTeam.add(spartak);
		khlTeam.add(torpedo);
		khlTeam.add(jokerit);
		
		
		for(Team t : khlTeam){
			System.out.println(t.getName());
			
		}
		
		League khl = new League ("KHL");
		//khl.nameOfTeams.add(cska);
		
		khl.recordWinAndLoss("CSKA", "DINAMO");
		khl.recordWinAndLoss("SKA", "DINAMO");
		
		khl.recordTie(ska, cska);
		
		khl.setNameOfTeams(khlTeam);
		
		
		System.out.println("Team of SKA total point: "+ska.totalPoint());
		System.out.println(khl.toString());
		

	}

}
