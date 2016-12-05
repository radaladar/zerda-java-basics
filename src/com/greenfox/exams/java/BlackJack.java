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
                        user.reset();
                        house.reset();
                        playDeck = new Deck();
                        userCards.setText(user.playerDisplay());
                        houseCards.setText(house.playerDisplay());
                    }
                }
        );
        buttonDraw.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            user.add(playDeck);
                            user.sum();
                            if (house.sum() < 17) {
                                house.add(playDeck);
                                house.sum();
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        userCards.setText(user.playerDisplay());
                        houseCards.setText(house.playerDisplay());
                    }
                }
        );
        this.add(userCards);
        this.add(houseCards);
        this.add(buttonNewGame);
        this.add(buttonDraw);
    }
}
