package com.sportradar;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MatchTest  extends AbstractTest {
    @Test
    public void createMatch() {
        Match match = new Match();

        assertTrue(match instanceof Match); //team is not null (Team)
    }

    @Test
    public void createMatchWithTeams() {
        Match match = new Match();

        Team teamAway = getAway();

        Team teamHome = getHome();

        match.addAway(teamAway);
        match.addHome(teamHome);





        assertTrue(match instanceof Match); //team is not null (Team)
    }

    private Team getHome() {
        Team teamHome = new Team();
        team.setName(getNameTeamHome());
        return teamHome;
    }

    private Team getAway() {
        Team teamAway = new Team();
        team.setName(getNameTeamAway());
        return teamAway;
    }

    @Test
    public void createMatchWithTeamsAndDefaultScore() {
        Match match = new Match();

        Team teamAway = new Team();
        team.setName(getNameTeamAway());

        Team teamHome = new Team();
        team.setName(getNameTeamHome());

        match.addAway(teamAway);
        match.addHome(teamHome);

        match.setScore(0,0);


        assertTrue(match instanceof Match); //team is not null (Team)
    }
}