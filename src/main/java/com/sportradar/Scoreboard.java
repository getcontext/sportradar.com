package com.sportradar;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class Scoreboard extends AbstractScoreboard {
    public ArrayList<Match> getSummary() {
        ArrayList<Match> sorted = new ArrayList<>();

        matches.forEach((key, value) -> {
            sorted.add(value);
        });

        sorted.sort(null);

        for (Match entry : sorted) {
            System.out.println(entry.getTeamHome().getName() + " " + entry.getScoreHome() + " - " + entry.getTeamAway().getName() + " " + entry.getScoreAway());
        }

        return sorted;
    }
}
