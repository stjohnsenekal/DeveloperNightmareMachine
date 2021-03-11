package com.stjohnsenekal;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TimeClock productivityClock = new TimeClock();

        Manager fred = new Manager();
        Developer john = new Developer();

        productivityClock.registerObserver(fred);
        productivityClock.registerObserver(john);


        for(int hour = 0; hour < 24; hour++)
        {
            try {
                Thread.sleep (1000);
                productivityClock.notifyObservers();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }
}
