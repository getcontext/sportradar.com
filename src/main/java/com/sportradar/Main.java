package com.sportradar;

public class Main {
    private boolean isRunning = true;
    private  Scoreboard scoreboard;
    public void run() {
        scoreboard = new Scoreboard();

    }

    public boolean isRunning() {
        return isRunning;
    }

    public Scoreboard getScoreboard() {
        return scoreboard;
    }
}
