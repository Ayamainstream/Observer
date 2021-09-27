package com.company;

public class Main {
    public static void main(String[] args) {
        LMS moodle = new LMS();
        Student Aiya = new Student("Aiya");

        moodle.registerObserver(Aiya);
        moodle.addGrades("99.00");
        moodle.addGrades("87.3");
        moodle.notifyAllObservers();
    }
}
