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
        Match match = getMatch();

        assertTrue(match instanceof Match); //team is not null (Team)
    }

    @Test
    public void createMatchWithTeamsAndDefaultScore() {
        Match match = getMatch();

        match.setScore(0,0);


        assertTrue(match instanceof Match); //team is not null (Team)
    }
}