package com.stjohnsenekal;

import java.util.ArrayList;
import java.util.List;

public class TimeClock {
    private List<Observer> observerCollection;

    public TimeClock() {
        this.observerCollection = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observerCollection.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observerCollection.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observerCollection
             ) {
            observer.update();
        }
    }


}
