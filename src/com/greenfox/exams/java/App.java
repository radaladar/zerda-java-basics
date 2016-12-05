/// Created by BB on 2016-12-05.
package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.*;

public class App {

    public static void main(String[] args) {
        JFrame appFrame = new JFrame("BlackJack App");
        appFrame.add(new BlackJack());
        appFrame.setPreferredSize(new Dimension(500, 300));
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = ((dim.width/2)-(appFrame.getWidth()/2));
        int yPos = (dim.height/2)-(appFrame.getHeight()/2);
        appFrame.setLocation(xPos, yPos);
        appFrame.setResizable(false);
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.pack();
        appFrame.setLocationRelativeTo(null);
        appFrame.setVisible(true);
    }
}
