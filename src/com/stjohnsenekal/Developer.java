package com.stjohnsenekal;

public class Developer implements Observer {

    String name;
    ChaosMonkey monkey;
    int productiveHours;

    public Developer(String name) {
        this.name = name;
        this.monkey = new ChaosMonkey();
        this.productiveHours = 0;
    }

    public void update() {
        System.out.println("DEVELOPER sees it: " + this.name + " chaos? " + monkey.doesMeetingInterveneOnProductivity());
        if(!monkey.doesMeetingInterveneOnProductivity()) {
            this.incrementProductiveHours();
        }
    }

    public int getProductiveHours() {
        return this.productiveHours;
    }

    public String getName() {
        return this.name;
    }

    private void incrementProductiveHours() {
        this.productiveHours++;
    }
}
