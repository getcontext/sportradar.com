package com.sportradar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ScoreboardTest  extends AbstractTest {
    @Test
    public void createScoreboard() {
        Scoreboard scoreboard = new Scoreboard();

        assertTrue(scoreboard instanceof Scoreboard);
    }

    @Test
    public void startAndAddMatch() {
        Scoreboard scoreboard = new Scoreboard();

        Match match = getMatch();
        match.setScore(0,0);
        match.start();
        scoreboard.addMatch(match);

        assertEquals(1, scoreboard.getMatches().size());
    }

    @Test
    public void endMatch() {
        Scoreboard scoreboard = new Scoreboard();

        Match match = getMatch();
        match.setScore(0,0);
        match.start();
        scoreboard.addMatch(match);

//        scoreboard.endMatch(0);
        scoreboard.endMatch(match);

        assertEquals(0, scoreboard.getMatches().size());
    }

    @Test
    public void summary() {
        Scoreboard scoreboard = new Scoreboard();

        Match match = getMatch();
        match.setScore(0,0);
        match.start();
        scoreboard.addMatch(match);

        scoreboard.getSummary();

        assertEquals(1, scoreboard.getMatches().size());
    }
}