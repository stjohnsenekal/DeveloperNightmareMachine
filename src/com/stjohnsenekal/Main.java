package com.stjohnsenekal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TimeClock productivityClock = new TimeClock();

        Manager theBoss = new Manager();

        List<Developer> developers = new ArrayList<Developer>();

        developers.add(new Developer("John"));
        developers.add(new Developer("Peter"));
        developers.add(new Developer("Paul"));

        //the developers
        for (Developer developer : developers
        ) {
            productivityClock.registerObserver(developer);
        }

        //the managers
        productivityClock.registerObserver(theBoss);


        for(int hour = 0; hour < 8; hour++)
        {
            try {
                Thread.sleep (1000);
                productivityClock.notifyObservers();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }

        for (Developer developer : developers
        ) {
            System.out.println(developer.getName() + " has these productive hours: " + developer.getProductiveHours());
        }

    }
}
