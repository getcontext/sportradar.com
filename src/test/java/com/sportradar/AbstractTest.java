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

    protected Team getTeamHome() {
        Team teamHome = new Team();
        team.setName(getNameTeamHome());
        return teamHome;
    }

    protected Team getTeamAway() {
        Team teamAway = new Team();
        team.setName(getNameTeamAway());
        return teamAway;
    }

    protected Match getMatch() {
        Match match = new Match();

        Team teamAway = getTeamAway();
        Team teamHome = getTeamHome();

        match.addAway(teamAway);
        match.addHome(teamHome);
        return match;
    }
}