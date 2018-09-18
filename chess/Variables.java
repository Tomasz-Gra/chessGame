package chessGame;

import javax.swing.*;
import java.awt.*;

class Variables {
    String[] iconNames = {"img/black-rook.png", "img/black-knight.png", "img/black-bishop.png", "img/black-queen.png", "img/black-king.png", "img/black-pawn.png", "img/white-rook.png", "img/white-knight.png", "img/white-bishop.png", "img/white-queen.png", "img/white-king.png", "img/white-pawn.png"};

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

    Icon isIconOneDown() { return buttons[fieldZero() + 1][fieldOne()].getIcon(); }
    Icon isIconOneUp() { return buttons[fieldZero() - 1][fieldOne()].getIcon(); }
    Icon isIconOneRight() { return buttons[fieldZero()][fieldOne() + 1].getIcon(); }
    Icon isIconOneLeft() { return buttons[fieldZero()][fieldOne() - 1].getIcon(); }

    Icon isIconOneUpOneRight() { return buttons[fieldZero() - 1][fieldOne() + 1].getIcon(); }
    Icon isIconOneUpOneLeft() { return buttons[fieldZero() - 1][fieldOne() - 1].getIcon(); }
    Icon isIconOneDownOneRight() { return buttons[fieldZero() + 1][fieldOne() + 1].getIcon(); }
    Icon isIconOneDownOneLeft() { return buttons[fieldZero() + 1][fieldOne() - 1].getIcon(); }

    boolean fightOneUp() { return secondClicked() == buttons[fieldZero() - 1][fieldOne()] && !iconIsNull(); }
    boolean fightOneDown() { return secondClicked() == buttons[fieldZero() + 1][fieldOne()] && !iconIsNull(); }
    boolean fightOneRight() { return secondClicked() == buttons[fieldZero()][fieldOne() + 1] && !iconIsNull(); }
    boolean fightOneLeft() { return secondClicked() == buttons[fieldZero()][fieldOne() - 1] && !iconIsNull(); }

    boolean fightTwoUp() { return secondClicked() == buttons[fieldZero() - 2][fieldOne()] && !iconIsNull(); }
    boolean fightTwoDown() { return secondClicked() == buttons[fieldZero() + 2][fieldOne()] && !iconIsNull(); }
    boolean fightTwoRight() { return secondClicked() == buttons[fieldZero()][fieldOne() + 2] && !iconIsNull(); }
    boolean fightTwoLeft() { return secondClicked() == buttons[fieldZero()][fieldOne() - 2] && !iconIsNull(); }

    boolean fightOneUpOneRight() { return secondClicked() == buttons[fieldZero() - 1][fieldOne() + 1] && !iconIsNull(); }
    boolean fightOneUpOneLeft() { return secondClicked() == buttons[fieldZero() - 1][fieldOne() - 1] && !iconIsNull(); }
    boolean fightOneDownOneRight() { return secondClicked() == buttons[fieldZero() + 1][fieldOne() + 1] && !iconIsNull(); }
    boolean fightOneDownOneLeft() { return secondClicked() == buttons[fieldZero() + 1][fieldOne() - 1] && !iconIsNull(); }

    boolean fightTwoUpTwoRight() { return secondClicked() == buttons[fieldZero() - 2][fieldOne() + 2] && !iconIsNull(); }
    boolean fightTwoUpTwoLeft() { return secondClicked() == buttons[fieldZero() - 2][fieldOne() - 2] && !iconIsNull(); }
    boolean fightTwoDownTwoRight() { return secondClicked() == buttons[fieldZero() + 2][fieldOne() + 2] && !iconIsNull(); }
    boolean fightTwoDownTwoLeft() { return secondClicked() == buttons[fieldZero() + 2][fieldOne() - 2] && !iconIsNull(); }

    boolean moveOneUp() { return secondClicked() == buttons[fieldZero() - 1][fieldOne()] && iconIsNull(); }
    boolean moveOneDown() { return secondClicked() == buttons[fieldZero() + 1][fieldOne()] && iconIsNull(); }
    boolean moveOneRight() { return secondClicked() == buttons[fieldZero()][fieldOne() + 1] && iconIsNull(); }
    boolean moveOneLeft() { return secondClicked() == buttons[fieldZero()][fieldOne() - 1] && iconIsNull(); }

    boolean moveTwoUp() { return secondClicked() == buttons[fieldZero() - 2][fieldOne()] && iconIsNull(); }
    boolean moveTwoDown() { return secondClicked() == buttons[fieldZero() + 2][fieldOne()] && iconIsNull(); }
    boolean moveTwoRight() { return secondClicked() == buttons[fieldZero()][fieldOne() + 2] && iconIsNull(); }
    boolean moveTwoLeft() { return secondClicked() == buttons[fieldZero()][fieldOne() - 2] && iconIsNull(); }

    boolean moveOneUpOneRight() { return secondClicked() == buttons[fieldZero() - 1][fieldOne() + 1] && iconIsNull(); }
    boolean moveOneUpOneLeft() { return secondClicked() == buttons[fieldZero() - 1][fieldOne() - 1] && iconIsNull(); }
    boolean moveOneDownOneRight() { return secondClicked() == buttons[fieldZero() + 1][fieldOne() + 1] && iconIsNull(); }
    boolean moveOneDownOneLeft() { return secondClicked() == buttons[fieldZero() + 1][fieldOne() - 1] && iconIsNull(); }

    boolean moveTwoUpTwoRight() { return secondClicked() == buttons[fieldZero() - 2][fieldOne() + 2] && iconIsNull(); }
    boolean moveTwoUpTwoLeft() { return secondClicked() == buttons[fieldZero() - 2][fieldOne() - 2] && iconIsNull(); }
    boolean moveTwoDownTwoRight() { return secondClicked() == buttons[fieldZero() + 2][fieldOne() + 2] && iconIsNull(); }
    boolean moveTwoDownTwoLeft() { return secondClicked() == buttons[fieldZero() + 2][fieldOne() - 2] && iconIsNull(); }
}
