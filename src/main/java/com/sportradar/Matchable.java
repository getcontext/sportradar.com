package com.sportradar;

import java.util.Comparator;

public interface Matchable extends Comparator<Match>, Comparable<Match> {
    void setTeamAway(Team teamAway);

    void setTeamHome(Team teamHome);

    Team getTeamHome();

    Team getTeamAway();

    void setScore(int home, int away);

    int getScoreHome();

    int getScoreAway();

    void setScoreHome(int i);

    void setScoreAway(int i);

    void start();

    boolean isFinished();

    void update(int i, int i1);

    int getTotal();

    void stop();

    @Override
    int compare(Match o1, Match o2);

    @Override
    int compareTo(Match o);
}
