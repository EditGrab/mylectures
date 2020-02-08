package lv.edite.test;

import java.util.ArrayList;

import lv.edite.module.League;
import lv.edite.module.Team;

public class TestTeamAndLeague {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Team> arrTeam = new ArrayList<>();
		
		Team ska = new Team("SKA");
		Team cska = new Team("CSKA");
		
		arrTeam.add(ska);
		arrTeam.add(cska);
		
		League khl = new League ("KHL");
		//khl.nameOfTeams.add(cska);
		
		khl.setNameOfTeams(arrTeam);
		
		System.out.println(khl.toString());
		

	}

}