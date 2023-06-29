package com.sportradar;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeamTest extends AbstractTest {
    @Test
    public void createTeam() {
        Team team = new Team();

        assertTrue(team, team instanceof Team); //team is not null (Team)
    }

    @Test
    public void checkName() {
        Team team = new Team();
        team.setName(EXAMPLE_TEAM);

        assertEquals(team.getName(), EXAMPLE_TEAM);
    }
}