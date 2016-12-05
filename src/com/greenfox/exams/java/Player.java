/// Created by BB on 2016-12-05.
package com.greenfox.exams.java;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> played = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void add(Deck deck){
        Card drawCard = deck.draw();
        played.add(drawCard);
    }

    public int sum(){
        int sum = 0;
        for (Card card : played) {
            switch (card.getValue()) {
                case "A":
                    if (sum+10 > 21) {
                        sum += 1;
                        break;
                    } else {
                        sum += 10;
                        break;
                    }
                case "J":
                case "Q":
                case "K":
                    sum += 10;
                    break;
                default:
                    sum += Integer.valueOf(card.getValue());
                    break;
            }

        }
        return sum;
    }

    public String playerDisplay(){
        String cardsString = "";
        for (Card card : played) {
            cardsString += card.toString();
            cardsString += "<br>";
        }
        return "<html>" + this.name + " played:<br>" + cardsString + "value of " + this.sum() + "</html>";
    }

    public void reset(){
        this.played = new ArrayList<>();
    }
}
