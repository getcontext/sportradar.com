package com.sportradar;

import org.junit.Before;

public abstract class AbstractTest {
    protected static final String TEAM_EXAMPLE = "Spain";
    protected static final String TEAM_HOME = "Germany";
    protected static final String TEAM_AWAY = "Brazil";

    @Before
    public void setup() {

    }

    public String getTeamExample() {
        return TEAM_EXAMPLE;
    }

    public String getTeamHome() {
        return TEAM_HOME;
    }

    public String getTeamAway() {
        return TEAM_AWAY;
    }
}