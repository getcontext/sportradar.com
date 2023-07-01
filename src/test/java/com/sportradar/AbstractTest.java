package com.sportradar;

import org.junit.Before;

public abstract class AbstractTest {
    protected static final String NAME_TEAM_EXAMPLE = "Spain";
    protected static final String NAME_TEAM_EXAMPLE2 = "Italy";
    protected static final String NAME_TEAM_HOME = "Germany";
    protected static final String NAME_TEAM_AWAY = "Brazil";
    protected static final String NAME_TEAM_HOME2 = "Argentina";
    protected static final String NAME_TEAM_AWAY2 = "Canada";

    @Before
    public void setup() {

    }

    public String getNameTeamExample() {
        return NAME_TEAM_EXAMPLE;
    }
    public String getNameTeamExample2() {
        return NAME_TEAM_EXAMPLE2;
    }
    public String getNameTeamHome() {
        return NAME_TEAM_HOME;
    }
    public String getNameTeamAway() {
        return NAME_TEAM_AWAY;
    }
    public String getNameTeamHome2() {
        return NAME_TEAM_HOME2;
    }
    public String getNameTeamAway2() {
        return NAME_TEAM_AWAY2;
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

    protected Team getTeamHome2() {
        Team team = new Team();
        team.setName(getNameTeamHome2());
        return team;
    }

    protected Team getTeamAway2() {
        Team team = new Team();
        team.setName(getNameTeamAway2());
        return team;
    }

    protected Team getTeamExample() {
        Team team = new Team();
        team.setName(getNameTeamExample());
        return team;
    }
    protected Team getTeamExample2() {
        Team team = new Team();
        team.setName(getNameTeamExample2());
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

    protected Match getMatch2() {
        Match match = new Match();

        Team teamAway = getTeamExample();
        Team teamHome = getTeamExample2();

        match.setTeamAway(teamAway);
        match.setTeamHome(teamHome);

        return match;
    }


    protected Match getMatch3() {
        Match match = new Match();

        Team teamAway = getTeamAway2();
        Team teamHome = getTeamHome2();

        match.setTeamAway(teamAway);
        match.setTeamHome(teamHome);

        return match;
    }
}