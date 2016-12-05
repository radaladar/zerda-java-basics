/// Created by BB on 2016-12-05.
package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlackJack extends JPanel {
    private Player user = new Player ("User");
    private JLabel userCards = new JLabel();
    private Player house = new Player ("House");
    private JLabel houseCards = new JLabel();
    private Deck playDeck = new Deck();
    private JButton buttonNewGame = new JButton("New Game");
    private JButton buttonDraw = new JButton("Draw a card");

    public BlackJack() {
        userCards.setText(user.playerDisplay());
        houseCards.setText(house.playerDisplay());

        buttonNewGame.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                }
        );
        buttonDraw.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        user.add(playDeck);
                        user.sum();
                        house.add(playDeck);
                        house.sum();
                    }
                }
        );
        this.add(buttonNewGame);
        this.add(buttonDraw);
        this.add(userCards);
        this.add(houseCards);

    }
}
