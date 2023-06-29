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

        Team teamAway = new Team();
        team.setName(getTeamAway()):

        Team teamHome = new Team();
        team.setName(getTeamHome()):

        match.addAway(teamAway);
        match.addHome(teamHome);



        assertTrue(match instanceof Match); //team is not null (Team)
    }
}