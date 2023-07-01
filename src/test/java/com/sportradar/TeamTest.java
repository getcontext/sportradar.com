package com.sportradar;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeamTest extends AbstractTest {
    @Test
    public void createTeam() {
        Team team = new Team();

        assertTrue(team instanceof Team); //team is not null (Team)
    }

    @Test
    public void checkTeamWithNameSetter() {
        Team team = new Team();
        team.setName(getNameTeamExample());

        assertEquals(team.getName(), getNameTeamExample());
    }
    @Test
    public void checkTeamWithNameConstructor() {
        Team team = new Team(getNameTeamExample());
        assertEquals(team.getName(), getNameTeamExample());
    }
    @Test(expected = IllegalArgumentException.class)
    public void checkTeamWithNullNameSetter() {
        Team team = new Team();
        team.setName(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTeamWithNullNameConstructor() {
        Team team = new Team(null);
    }
}