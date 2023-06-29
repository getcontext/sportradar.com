package com.sportradar;

import org.junit.Before;

public abstract class AbstractTest {
    protected static final String NAME_TEAM_EXAMPLE = "Spain";
    protected static final String NAME_TEAM_HOME = "Germany";
    protected static final String NAME_TEAM_AWAY = "Brazil";

    @Before
    public void setup() {

    }

    public String getNameTeamExample() {
        return NAME_TEAM_EXAMPLE;
    }

    public String getNameTeamHome() {
        return NAME_TEAM_HOME;
    }

    public String getNameTeamAway() {
        return NAME_TEAM_AWAY;
    }
}