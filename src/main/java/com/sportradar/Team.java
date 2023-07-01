package com.sportradar;

public class Team {
    private String name;

    public Team() {

    }

    public Team(String nameTeamExample) {
        this.name = nameTeamExample;
    }

    public void setName(String nameTeamExample) {
        name=nameTeamExample;
    }

    public String getName() {
        return name;
    }
}
