package com.sportradar;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Scoreboard {
    ConcurrentHashMap<Long, Match> matches = new ConcurrentHashMap<Long, Match>();

    public void addMatch(Match match) {
        Long started = new Date().getTime();
        matches.put(started, match);

        try {
            Thread.sleep(1); //1 milisecond is minimum threshold
        } catch (InterruptedException e) {
        }
    }

    public ConcurrentHashMap<Long, Match> getMatches() {
        return matches;
    }

    public void endMatch(int i) {
    }

    public void endMatch(Match match) {
        matches.values().remove(match);
    }

    public ArrayList<Match> getSummary() {
        ArrayList<Match> toSort = new ArrayList<>();
        for (Map.Entry<Long, Match> entry : matches.entrySet()) {
            toSort.add(entry.getValue());
        }

        toSort.sort(null);

        for (Match entry : toSort) {
            System.out.println(entry.getTeamHome().getName() + " " + entry.getScoreHome() + " - " + entry.getTeamAway().getName() + " " + entry.getScoreAway() );
        }

        return toSort;
    }
}
