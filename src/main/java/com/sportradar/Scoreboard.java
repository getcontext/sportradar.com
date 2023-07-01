package com.sportradar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

public class Scoreboard {
    ConcurrentHashMap<Integer, Match> matches = new ConcurrentHashMap<Integer, Match>();

    public void addMatch(Match match) {
    }

    public ConcurrentHashMap<Integer, Match> getMatches() {
    }

    public void endMatch(int i) {
    }

    public void endMatch(Match match) {
    }

    public ArrayList<Match> getSummary() {
        return null;
    }
}
