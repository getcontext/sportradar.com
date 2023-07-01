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
        Team team = new Team();
        team.setName(getNameTeamHome());
        return team;
    }

    protected Team getTeamAway() {
        Team team = new Team();
        team.setName(getNameTeamAway());
        return team;
    }

    protected Match getMatch() {
        Match match = new Match();

        Team teamAway = getTeamAway();
        Team teamHome = getTeamHome();

        match.setTeamAway(teamAway);
        match.setTeamHome(teamHome);

        return match;
    }
}