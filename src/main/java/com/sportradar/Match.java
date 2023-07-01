package com.sportradar;

public class Match {
    private Team teamAway;
    private Team teamHome;

    private int scoreAway;
    private int scoreHome;

    private boolean isFinished = false;

    public void setTeamAway(Team teamAway) {
        if(this.teamHome != null && this.teamHome.equals(teamAway)) {
            throw new IllegalArgumentException();
        }
        this.teamAway = teamAway;
    }

    public void setTeamHome(Team teamHome) {
        if(this.teamAway != null && this.teamAway.equals(teamHome)) {
            throw new IllegalArgumentException();
        }
        this.teamHome = teamHome;
    }

    public Team getTeamHome() {
        return teamHome;
    }

    public Team getTeamAway() {
        return teamAway;
    }

    public void setScore(int home, int away) {
        this.scoreHome = home;
        this.scoreAway = away;
    }

    public int getScoreHome() {
        return scoreHome;
    }

    public int getScoreAway() {
        return scoreAway;
    }

    public void setScoreHome(int i) {
        scoreHome = i;
    }


    public void setScoreAway(int i) {
        scoreAway = i;
    }

    public void start() {
        if (isFinished) {
            return;
        }

        //timeStart and timeStop can be added here as a separate threads
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void update(int i, int i1) {
        setScore(i, i1);
    }

    public int getTotal() {
        return scoreHome + scoreAway; //could be separate field
    }

    public void stop() {
        this.isFinished = true;
    }
}
