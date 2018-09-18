package chessGame;

import javax.swing.*;
import java.awt.*;

class Variables {
    String[] iconNames = {"img/black-rook.png", "img/black-knight.png", "img/black-bishop.png", "img/black-queen.png", "img/black-king.png", "img/black-pawn.png", "img/white-rook.png", "img/white-knight.png", "img/white-bishop.png", "img/white-queen.png", "img/white-king.png", "img/white-pawn.png"};

    ImageIcon[] icons = new ImageIcon[12];
    JButton[][] buttons = new JButton[12][12];
    JTextField[] textField = new JTextField[6];
    boolean[] protectChess = new boolean[12];

    private int fieldZero() { return Integer.parseInt(textField[0].getText()); }
    private int fieldOne() { return Integer.parseInt(textField[1].getText()); }
    int fieldTwo() { return Integer.parseInt(textField[2].getText()); }
    int fieldThree() { return Integer.parseInt(textField[3].getText()); }
    private boolean iconIsNull() { return buttons[fieldTwo()][fieldThree()].getIcon() == null; }
    Color colorFieldYellow() { return new Color(250, 205, 115); }
    Color colorFieldOrange() { return new Color(180, 120, 0); }
    JButton firstClicked() { return buttons[fieldZero()][fieldOne()]; }
    private JButton secondClicked() { return buttons[fieldTwo()][fieldThree()]; }
    boolean iNull() { return iconIsNull(); }

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

    Icon _I_1D() { return buttons[fieldZero() + 1][fieldOne()].getIcon(); }
    Icon _I_1U() { return buttons[fieldZero() - 1][fieldOne()].getIcon(); }
    Icon _I_1R() { return buttons[fieldZero()][fieldOne() + 1].getIcon(); }
    Icon _I_1L() { return buttons[fieldZero()][fieldOne() - 1].getIcon(); }

    Icon _I_1U1R() { return buttons[fieldZero() - 1][fieldOne() + 1].getIcon(); }
    Icon _I_1U1L() { return buttons[fieldZero() - 1][fieldOne() - 1].getIcon(); }
    Icon _I_1D1R() { return buttons[fieldZero() + 1][fieldOne() + 1].getIcon(); }
    Icon _I_1D1L() { return buttons[fieldZero() + 1][fieldOne() - 1].getIcon(); }

    boolean _F_1U() { return secondClicked() == buttons[fieldZero() - 1][fieldOne()]; }
    boolean _F_1D() { return secondClicked() == buttons[fieldZero() + 1][fieldOne()]; }
    boolean _F_1R() { return secondClicked() == buttons[fieldZero()][fieldOne() + 1]; }
    boolean _F_1L() { return secondClicked() == buttons[fieldZero()][fieldOne() - 1]; }

    boolean _F_2U() { return secondClicked() == buttons[fieldZero() - 2][fieldOne()]; }
    boolean _F_2D() { return secondClicked() == buttons[fieldZero() + 2][fieldOne()]; }
    boolean _F_2R() { return secondClicked() == buttons[fieldZero()][fieldOne() + 2]; }
    boolean _F_2L() { return secondClicked() == buttons[fieldZero()][fieldOne() - 2]; }

    boolean _F_1U_1R() { return secondClicked() == buttons[fieldZero() - 1][fieldOne() + 1]; }
    boolean _F_1U_1L() { return secondClicked() == buttons[fieldZero() - 1][fieldOne() - 1]; }
    boolean _F_1D_1R() { return secondClicked() == buttons[fieldZero() + 1][fieldOne() + 1]; }
    boolean _F_1D_1L() { return secondClicked() == buttons[fieldZero() + 1][fieldOne() - 1]; }

    boolean _F_2U_2R() { return secondClicked() == buttons[fieldZero() - 2][fieldOne() + 2]; }
    boolean _F_2U_2L() { return secondClicked() == buttons[fieldZero() - 2][fieldOne() - 2]; }
    boolean _F_2D_2R() { return secondClicked() == buttons[fieldZero() + 2][fieldOne() + 2]; }
    boolean _F_2D_2L() { return secondClicked() == buttons[fieldZero() + 2][fieldOne() - 2]; }

    boolean _2D_1R() { return secondClicked() == buttons[fieldZero() + 2][fieldOne() + 1]; }
    boolean _2D_1L() { return secondClicked() == buttons[fieldZero() + 2][fieldOne() - 1]; }
    boolean _2U_1R() { return secondClicked() == buttons[fieldZero() - 2][fieldOne() + 1]; }
    boolean _2U_1L() { return secondClicked() == buttons[fieldZero() - 2][fieldOne() - 1]; }

    boolean _1D_2R() { return secondClicked() == buttons[fieldZero() + 1][fieldOne() + 2]; }
    boolean _1D_2L() { return secondClicked() == buttons[fieldZero() + 1][fieldOne() - 2]; }
    boolean _1U_2R() { return secondClicked() == buttons[fieldZero() - 1][fieldOne() + 2]; }
    boolean _1U_2L() { return secondClicked() == buttons[fieldZero() - 1][fieldOne() - 2]; }

}
