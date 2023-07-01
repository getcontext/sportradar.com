package com.sportradar;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

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
        match.start();
        scoreboard.addMatch(match);

        assertEquals(1, scoreboard.getMatches().size());
    }

    @Test
    public void endMatch() {
        Scoreboard scoreboard = new Scoreboard();

        Match match = getMatch();
        match.start();
        scoreboard.addMatch(match);
        assertEquals(1, scoreboard.getMatches().size());

//        scoreboard.endMatch(0);
        scoreboard.endMatch(match);

        assertEquals(0, scoreboard.getMatches().size());
    }

    @Test
    public void summary() {
        Scoreboard scoreboard = new Scoreboard();

        Match match = getMatch();
        scoreboard.addMatch(match);
        match.start();
        match.setScore(5,2);

        Match match2 = getMatch2();
        scoreboard.addMatch(match2);
        match2.start();
        match2.setScore(10,6);

        Match match3 = getMatch3();
        scoreboard.addMatch(match3);
        match3.start();
        match3.setScore(1,2);

        assertEquals(3, scoreboard.getMatches().size());

        ArrayList<Match> summary = scoreboard.getSummary();

        assertEquals(3, summary.size());

        assertEquals(16, summary.get(0).getTotal());
        assertEquals(7, summary.get(1).getTotal());
        assertEquals(3, summary.get(2).getTotal());

    }
}