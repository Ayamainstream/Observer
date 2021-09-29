package com.company;

import java.util.ArrayList;
import java.util.List;

public class LMS implements Observable{
    private List<String> grades = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addGrades(String newGrade){
        grades.add(newGrade);
        notifyAllObservers();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer: observers) {
            observer.update(grades);
        }
    }
}
