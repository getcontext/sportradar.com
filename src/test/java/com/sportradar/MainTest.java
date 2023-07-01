package com.sportradar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTest extends AbstractTest {
//    a. Mexico 0 - Canada 5
//    b. Spain 10 - Brazil 2
//    c. Germany 2 - France 2
//    d. Uruguay 6 - Italy 6
//    e. Argentina 3 - Australia 1

    @Test
    public void run() {
//        Match match, Team team;
//        Scoreboard scoreboard = new Scoreboard();
//        team = new Team();
//        match = new Match();

        Main m = new Main();
        m.run();

        assertTrue(m.isRunning() == true);

        assertEquals(m.getScoreboard().getSummary().size(), 5);

    }
}
