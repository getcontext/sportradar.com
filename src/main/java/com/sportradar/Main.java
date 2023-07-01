package com.sportradar;

public final class Main { //let's have it facade
    private boolean isRunning = true;
    private AbstractScoreboard scoreboard;

    public void run() {
        Match match;
        scoreboard = new Scoreboard();

        match = new Match();
        match.setTeamHome(new Team("Mexico"));
        match.setTeamAway(new Team("Canada"));
        scoreboard.addMatch(match);
        match.start();
        match.setScore(0, 5);

        match = new Match();
        match.setTeamHome(new Team("Spain"));
        match.setTeamAway(new Team("Brazil"));
        scoreboard.addMatch(match);
        match.start();
        match.setScore(10, 2);

        match = new Match();
        match.setTeamHome(new Team("Germany"));
        match.setTeamAway(new Team("France"));
        scoreboard.addMatch(match);
        match.start();
        match.setScore(2, 2);

        match = new Match();
        match.setTeamHome(new Team("Uruguay"));
        match.setTeamAway(new Team("Italy"));
        scoreboard.addMatch(match);
        match.start();
        match.setScore(6, 6);

        match = new Match();
        match.setTeamHome(new Team("Argentina"));
        match.setTeamAway(new Team("Australia"));
        scoreboard.addMatch(match);
        match.start();
        match.setScore(3, 1);

        scoreboard.getSummary();
    }

    public boolean isRunning() {
        return isRunning;
    }

    public AbstractScoreboard getScoreboard() {
        return scoreboard;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
