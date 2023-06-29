package com.sportradar;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MatchTest  extends AbstractTest {
    @Test
    public void createMatch() {
        Match match = new Match();

        assertTrue(match instanceof Match); //team is not null (Team)
    }
}