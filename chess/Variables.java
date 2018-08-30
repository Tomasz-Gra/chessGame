package chessGame;

import javax.swing.*;
import java.awt.*;

class Variables {
    String[] iconNames = {"img/black-rook.png", "img/black-knight.png", "img/black-bishop.png", "img/black-queen.png", "img/black-king.png", "img/black-pawn.png", "img/white-rook.png", "img/white-knight.png", "img/white-bishop.png", "img/white-queen.png", "img/white-king.png", "img/white-pawn.png"};

    //Integer[] numbers = {fieldZero() + 1, fieldZero() - 1, fieldZero() + 2, fieldZero() - 2, fieldTwo() + 1, fieldTwo() - 1, fieldTwo() + 2, fieldTwo() - 1};

    ImageIcon[] icons = new ImageIcon[12];
    JButton[][] buttons = new JButton[12][12];
    JTextField[] textField = new JTextField[6];
    boolean[] protectChess = new boolean[12];

    int fieldZero() { return Integer.parseInt(textField[0].getText()); }
    int fieldOne() { return Integer.parseInt(textField[1].getText()); }
    int fieldTwo() { return Integer.parseInt(textField[2].getText()); }
    int fieldThree() { return Integer.parseInt(textField[3].getText()); }
    boolean iconIsNull() { return buttons[fieldTwo()][fieldThree()].getIcon() == null; }
    Color colorFieldYellow() { return new Color(250, 205, 115); }
    Color colorFieldOrange() { return new Color(180, 120, 0); }
    JButton firstClicked() { return buttons[fieldZero()][fieldOne()]; }
    JButton secondClicked() { return buttons[fieldTwo()][fieldThree()]; }

    void doMove() {
        secondClicked().setIcon(firstClicked().getIcon());
        if (secondClicked().getIcon() != null) {
            firstClicked().setIcon(null);
            clearTextfields();
        }
    }
    void clearTextfields() {
        for (int i = 0; i < 4; i++) {
            textField[i].setText(null);
        }
    }
}
