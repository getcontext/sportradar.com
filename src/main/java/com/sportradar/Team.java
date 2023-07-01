package com.sportradar;

public class Team {
    private String name;

    public Team() {

    }

    public Team(String nameTeamExample) {
        setName(nameTeamExample);
    }

    public void setName(String nameTeamExample) {
        if (nameTeamExample == null) {
            throw new IllegalArgumentException();
        }
        name = nameTeamExample;
    }

    public String getName() {
        return name;
    }
}
