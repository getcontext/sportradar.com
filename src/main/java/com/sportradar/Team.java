package com.sportradar;

public class Team {
    private String name;

    public Team() {

    }

    public Team(String nameTeam) {
        setName(nameTeam);
    }

    public void setName(String nameTeam) {
        if (nameTeam == null) {
            throw new IllegalArgumentException();
        }
        name = nameTeam;
    }

    public String getName() {
        return name;
    }
}
