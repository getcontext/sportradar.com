package com.sportradar;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ScoreboardTest  extends AbstractTest {
    @Test
    public void createScoreboard() {
        Scoreboard scoreboard = new Scoreboard();

        assertTrue(scoreboard instanceof Scoreboard); //team is not null (Team)
    }

}