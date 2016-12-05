/// Created by BB on 2016-12-05.
package com.greenfox.exams.java;

public class Card {
    private String value;
    private String color;

    public Card(String value, String color) {
        this.value = value;
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }
}
