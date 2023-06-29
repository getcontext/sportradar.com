package com.sportradar;

import org.junit.Before;

public abstract class AbstractTest {
    protected static final String EXAMPLE_TEAM = "Spain";

    @Before
    public void setup() {

    }

    public String getExampleTeam() {
        return EXAMPLE_TEAM;
    }
}