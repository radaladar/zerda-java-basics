/// Created by BB on 2016-12-05.
package com.greenfox.exams.java;

import java.util.ArrayList;
import java.util.Collections;

public class Deck{
    private static String[] colors = {"treff", "pikk", "kor", "karo"};
    private static String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private ArrayList<Card> cards;
    private ArrayList<Card> used;

    public Deck() {
        for(String color : colors) {
            for (String value : values) {
                cards.add(new Card(value, color));
            }
        }
        Collections.shuffle(cards);
    }

    public Card draw() {
        Card drawCard = cards.get(0);
        used.add(drawCard;
        cards.remove(0);
        return drawCard;
    }
}
