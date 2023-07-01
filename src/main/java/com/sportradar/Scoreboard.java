package com.sportradar;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

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
//        matches.values().remove(match);
        matches.forEach((key, value) -> {
            if (value.equals(match)) {
                matches.remove(key);
            }
        });
    }

    public ArrayList<Match> getSummary() {
        ArrayList<Match> sorted = new ArrayList<>();
//        Stream<Map.Entry<Long, Match>> sorted = matches.entrySet().stream().sorted();
//        for (Map.Entry<Long, Match> entry : matches.entrySet()) {
//            toSort.add(entry.getValue());
//        }

        matches.forEach((key, value) -> {
            sorted.add(value);
        });

        sorted.sort(null);

        for (Match entry : sorted) {
            System.out.println(entry.getTeamHome().getName() + " " + entry.getScoreHome() + " - " + entry.getTeamAway().getName() + " " + entry.getScoreAway() );
        }

        return sorted;
    }
}
