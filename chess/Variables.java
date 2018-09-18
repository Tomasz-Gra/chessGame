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

    Icon _I_1D() { return buttons[fieldZero() + 1][fieldOne()].getIcon(); }
    Icon _I_1U() { return buttons[fieldZero() - 1][fieldOne()].getIcon(); }
    Icon _I_1R() { return buttons[fieldZero()][fieldOne() + 1].getIcon(); }
    Icon _I_1L() { return buttons[fieldZero()][fieldOne() - 1].getIcon(); }

    Icon _I_1U1R() { return buttons[fieldZero() - 1][fieldOne() + 1].getIcon(); }
    Icon _I_1U1L() { return buttons[fieldZero() - 1][fieldOne() - 1].getIcon(); }
    Icon _I_1D1R() { return buttons[fieldZero() + 1][fieldOne() + 1].getIcon(); }
    Icon _I_1D1L() { return buttons[fieldZero() + 1][fieldOne() - 1].getIcon(); }
    
    boolean iNull() { return iconIsNull(); }

    boolean _F_1U_B0() { return secondClicked() == buttons[fieldZero() - 1][fieldOne()] && !iconIsNull(); }
    boolean _F_1D_B1() { return secondClicked() == buttons[fieldZero() + 1][fieldOne()] && !iconIsNull(); }
    boolean _F_1R_B2() { return secondClicked() == buttons[fieldZero()][fieldOne() + 1] && !iconIsNull(); }
    boolean _F_1L_B3() { return secondClicked() == buttons[fieldZero()][fieldOne() - 1] && !iconIsNull(); }

    boolean _F_2U_B4() { return secondClicked() == buttons[fieldZero() - 2][fieldOne()] && !iconIsNull(); }
    boolean _F_2D_B5() { return secondClicked() == buttons[fieldZero() + 2][fieldOne()] && !iconIsNull(); }
    boolean _F_2R_B6() { return secondClicked() == buttons[fieldZero()][fieldOne() + 2] && !iconIsNull(); }
    boolean _F_2L_B7() { return secondClicked() == buttons[fieldZero()][fieldOne() - 2] && !iconIsNull(); }

    boolean _F_1U_1R_B8() { return secondClicked() == buttons[fieldZero() - 1][fieldOne() + 1] && !iconIsNull(); }
    boolean _F_1U_1L_B9() { return secondClicked() == buttons[fieldZero() - 1][fieldOne() - 1] && !iconIsNull(); }
    boolean _F_1D_1R_B10() { return secondClicked() == buttons[fieldZero() + 1][fieldOne() + 1] && !iconIsNull(); }
    boolean _F_1D_1L_B11() { return secondClicked() == buttons[fieldZero() + 1][fieldOne() - 1] && !iconIsNull(); }

    boolean _F_2U_2R_B12() { return secondClicked() == buttons[fieldZero() - 2][fieldOne() + 2] && !iconIsNull(); }
    boolean _F_2U_2L_B13() { return secondClicked() == buttons[fieldZero() - 2][fieldOne() - 2] && !iconIsNull(); }
    boolean _F_2D_2R_B14() { return secondClicked() == buttons[fieldZero() + 2][fieldOne() + 2] && !iconIsNull(); }
    boolean _F_2D_2L_B15() { return secondClicked() == buttons[fieldZero() + 2][fieldOne() - 2] && !iconIsNull(); }

    boolean _M_1U_B0() { return secondClicked() == buttons[fieldZero() - 1][fieldOne()] && iconIsNull(); }
    boolean _M_1D_B1() { return secondClicked() == buttons[fieldZero() + 1][fieldOne()] && iconIsNull(); }
    boolean _M_1R_B2() { return secondClicked() == buttons[fieldZero()][fieldOne() + 1] && iconIsNull(); }
    boolean _M_1L_B3() { return secondClicked() == buttons[fieldZero()][fieldOne() - 1] && iconIsNull(); }

    boolean _M_2U_B4() { return secondClicked() == buttons[fieldZero() - 2][fieldOne()] && iconIsNull(); }
    boolean _M_2D_B5() { return secondClicked() == buttons[fieldZero() + 2][fieldOne()] && iconIsNull(); }
    boolean _M_2R_B6() { return secondClicked() == buttons[fieldZero()][fieldOne() + 2] && iconIsNull(); }
    boolean _M_2L_B7() { return secondClicked() == buttons[fieldZero()][fieldOne() - 2] && iconIsNull(); }

    boolean _M_1U_1R_B8() { return secondClicked() == buttons[fieldZero() - 1][fieldOne() + 1] && iconIsNull(); }
    boolean _M_1U_1L_B9() { return secondClicked() == buttons[fieldZero() - 1][fieldOne() - 1] && iconIsNull(); }
    boolean _M_1D_1R_B10() { return secondClicked() == buttons[fieldZero() + 1][fieldOne() + 1] && iconIsNull(); }
    boolean _M_1D_1L_B11() { return secondClicked() == buttons[fieldZero() + 1][fieldOne() - 1] && iconIsNull(); }

    boolean _M_2U_2R_B12() { return secondClicked() == buttons[fieldZero() - 2][fieldOne() + 2] && iconIsNull(); }
    boolean _M_2U_2L_B13() { return secondClicked() == buttons[fieldZero() - 2][fieldOne() - 2] && iconIsNull(); }
    boolean _M_2D_2R_B14() { return secondClicked() == buttons[fieldZero() + 2][fieldOne() + 2] && iconIsNull(); }
    boolean _M_2D_2L_B15() { return secondClicked() == buttons[fieldZero() + 2][fieldOne() - 2] && iconIsNull(); }

}
