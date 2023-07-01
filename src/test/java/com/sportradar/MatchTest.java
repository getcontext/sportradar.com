package com.sportradar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MatchTest  extends AbstractTest {
    @Test
    public void createMatch() {
        Match match = new Match();

        assertTrue(match instanceof Match); //match is not null (Match)
    }

    @Test
    public void createMatchWithTeams() {
        Match match = getMatch();

        assertEquals(match.getTeamHome().getName(), getNameTeamHome());
        assertEquals(match.getTeamAway().getName(), getNameTeamAway());
    }

    @Test(expected = IllegalArgumentException.class)
    public void createMatchWithSameTeams() {
        Match match = new Match();

        Team teamAway = getTeamAway();

        match.addTeamAway(teamAway);
        match.addTeamHome(teamAway);

    }

    @Test
    public void createMatchWithTeamsAndDefaultScore() {
        Match match = getMatch();

        match.setScore(0,0);

        assertEquals(0, match.getScoreHome());
        assertEquals(0, match.getScoreAway());

        match.setScoreHome(0);
        match.setScoreAway(0);

        assertEquals(0, match.getScoreHome());
        assertEquals(0, match.getScoreAway());
    }
}