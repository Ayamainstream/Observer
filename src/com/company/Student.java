package com.company;

import java.util.List;

public class Student implements Observer {
    private String login;

    public Student(String login) {
        this.login = login;
    }

    @Override
    public void update(List<String> grades) {
        System.out.println("Dear, " + login + ", you have new grades " + grades);
    }
}
