package com.sportradar;

import java.util.Comparator;

public class Match implements Matchable {
    private Team teamAway;
    private Team teamHome;

    private int scoreAway;
    private int scoreHome;

    private boolean isFinished = false;

    @Override
    public void setTeamAway(Team teamAway) {
        if(this.teamHome != null && this.teamHome.equals(teamAway)) {
            throw new IllegalArgumentException();
        }
        this.teamAway = teamAway;
    }

    @Override
    public void setTeamHome(Team teamHome) {
        if(this.teamAway != null && this.teamAway.equals(teamHome)) {
            throw new IllegalArgumentException();
        }
        this.teamHome = teamHome;
    }

    @Override
    public Team getTeamHome() {
        return teamHome;
    }

    @Override
    public Team getTeamAway() {
        return teamAway;
    }

    @Override
    public void setScore(int home, int away) {
        this.scoreHome = home;
        this.scoreAway = away;
    }

    @Override
    public int getScoreHome() {
        return scoreHome;
    }

    @Override
    public int getScoreAway() {
        return scoreAway;
    }

    @Override
    public void setScoreHome(int i) {
        scoreHome = i;
    }


    @Override
    public void setScoreAway(int i) {
        scoreAway = i;
    }

    @Override
    public void start() {
        if (isFinished) {
            return;
        }

        setScore(0,0);
        //timeStart and timeStop can be added here as a separate threads
    }

    @Override
    public boolean isFinished() {
        return isFinished;
    }

    @Override
    public void update(int i, int i1) {
        setScore(i, i1);
    }

    @Override
    public int getTotal() {
        return scoreHome + scoreAway; //could be separate field
    }

    @Override
    public void stop() {
        this.isFinished = true;
    }

    @Override
    public int compare(Match o1, Match o2) {
        return Integer.compare(o2.getTotal(), o1.getTotal());
    }

    @Override
    public int compareTo(Match o) {
        return Integer.compare(o.getTotal(), getTotal());
    }
}
