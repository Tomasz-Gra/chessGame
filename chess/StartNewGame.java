package chessGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StartNewGame extends DrawBoard implements ActionListener {

    void startNewGame() {
        JFrame drawFrame = new JFrame("Primordial Chess Game");

        for (int x = 0; x < buttons.length; x++) {
            for (int y = 0; y < buttons.length; y++) {
                buttons[x][y] = new JButton();
                buttons[x][y].setVisible(false);
                buttons[x][y].setFocusPainted(false);
                buttons[x][y].addActionListener(this);
                drawFrame.add(buttons[x][y]);
            }
        }

        hideFields();
        drawChessPieces();
        setColorsForBoard();

        for (int textFieldIndex = 0; textFieldIndex < textField.length; textFieldIndex++) {
            textField[textFieldIndex] = new JTextField();
            textField[textFieldIndex].addActionListener(this);
        }

        drawFrame.setLayout(new GridLayout(12, 12));
        drawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawFrame.setSize(1000, 1000);
        drawFrame.setLocation(460, 40);
        drawFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent eventActionListener) {
        setValuesForController(eventActionListener);
        protectOrMove();
    }
}
