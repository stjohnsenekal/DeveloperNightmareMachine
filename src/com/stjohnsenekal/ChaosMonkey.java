package com.stjohnsenekal;

import java.util.Random;

public class ChaosMonkey {

    private Random random;
    private final double MEETING_LIKELIHOOD = 0.3;

    public ChaosMonkey() {
        this.random = new Random();
    }

    public boolean doesMeetingInterveneOnProductivity() {
        if (random.nextDouble() < this.MEETING_LIKELIHOOD) {
            return true;
        } else {
            return false;
        }
    }

}
