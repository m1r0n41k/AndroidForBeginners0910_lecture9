package com.drondon.androidforbeginner_lecture9;

/**
 * Created by andriimiroshnychenko on 11/6/17.
 */

class User {
    private String name;
    private String lastName;
    private int age;
    private int color;

    public User(String name, String lastName, int age, int color) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getColor() {
        return color;
    }

}
