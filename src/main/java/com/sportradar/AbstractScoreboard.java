package com.sportradar;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractScoreboard {
    protected ConcurrentHashMap<Long, Match> matches = new ConcurrentHashMap<Long, Match>();

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
//        matches.forEach((key, value) -> {
//            if (value.equals(match)) {
//                matches.remove(key);
//            }
//        });
    }

    public abstract ArrayList<Match> getSummary();
}
