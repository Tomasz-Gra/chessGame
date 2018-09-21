package chessGame;

import javax.swing.*;
import java.awt.*;

class Variables {
    String[] iconNames = {"img/black-rook.png", "img/black-knight.png", "img/black-bishop.png", "img/black-queen.png", "img/black-king.png", "img/black-pawn.png", "img/white-rook.png", "img/white-knight.png", "img/white-bishop.png", "img/white-queen.png", "img/white-king.png", "img/white-pawn.png"};

    ImageIcon[] icons = new ImageIcon[12];
    JButton[][] buttons = new JButton[8][8];
    JTextField[] textField = new JTextField[4];
    boolean[] protectChess = new boolean[12];

    private int fieldZero() { return Integer.parseInt(textField[0].getText()); }
    private int fieldOne() { return Integer.parseInt(textField[1].getText()); }
    int fieldTwo() { return Integer.parseInt(textField[2].getText()); }
    int fieldThree() { return Integer.parseInt(textField[3].getText()); }
    Color colorFieldYellow() { return new Color(250, 205, 115); }
    Color colorFieldOrange() { return new Color(180, 120, 0); }
    JButton firstClicked() { return buttons[fieldZero()][fieldOne()]; }
    private JButton secondClicked() { return buttons[fieldTwo()][fieldThree()]; }
    boolean iNull() { return buttons[fieldTwo()][fieldThree()].getIcon() == null; }

    void doMove() {
        secondClicked().setIcon(firstClicked().getIcon());
        if (secondClicked().getIcon() != null) {
            firstClicked().setIcon(null);
            clearTextfields();
        } else {
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

    boolean _1U() { return secondClicked() == buttons[fieldZero() - 1][fieldOne()]; }
    boolean _1D() { return secondClicked() == buttons[fieldZero() + 1][fieldOne()]; }
    boolean _1R() { return secondClicked() == buttons[fieldZero()][fieldOne() + 1]; }
    boolean _1L() { return secondClicked() == buttons[fieldZero()][fieldOne() - 1]; }

    boolean _2U() { return secondClicked() == buttons[fieldZero() - 2][fieldOne()]; }
    boolean _2D() { return secondClicked() == buttons[fieldZero() + 2][fieldOne()]; }
    boolean _2R() { return secondClicked() == buttons[fieldZero()][fieldOne() + 2]; }
    boolean _2L() { return secondClicked() == buttons[fieldZero()][fieldOne() - 2]; }

    boolean _1U1R() { return secondClicked() == buttons[fieldZero() - 1][fieldOne() + 1]; }
    boolean _1U1L() { return secondClicked() == buttons[fieldZero() - 1][fieldOne() - 1]; }
    boolean _1D1R() { return secondClicked() == buttons[fieldZero() + 1][fieldOne() + 1]; }
    boolean _1D1L() { return secondClicked() == buttons[fieldZero() + 1][fieldOne() - 1]; }

    boolean _2U2R() { return secondClicked() == buttons[fieldZero() - 2][fieldOne() + 2]; }
    boolean _2U2L() { return secondClicked() == buttons[fieldZero() - 2][fieldOne() - 2]; }
    boolean _2D2R() { return secondClicked() == buttons[fieldZero() + 2][fieldOne() + 2]; }
    boolean _2D2L() { return secondClicked() == buttons[fieldZero() + 2][fieldOne() - 2]; }

    boolean _2D1R() { return secondClicked() == buttons[fieldZero() + 2][fieldOne() + 1]; }
    boolean _2D1L() { return secondClicked() == buttons[fieldZero() + 2][fieldOne() - 1]; }
    boolean _2U1R() { return secondClicked() == buttons[fieldZero() - 2][fieldOne() + 1]; }
    boolean _2U1L() { return secondClicked() == buttons[fieldZero() - 2][fieldOne() - 1]; }

    boolean _1D2R() { return secondClicked() == buttons[fieldZero() + 1][fieldOne() + 2]; }
    boolean _1D2L() { return secondClicked() == buttons[fieldZero() + 1][fieldOne() - 2]; }
    boolean _1U2R() { return secondClicked() == buttons[fieldZero() - 1][fieldOne() + 2]; }
    boolean _1U2L() { return secondClicked() == buttons[fieldZero() - 1][fieldOne() - 2]; }

    boolean _B00() { return firstClicked() == buttons[0][0]; }
    boolean _B10() { return firstClicked() == buttons[1][0]; }
    boolean _B20() { return firstClicked() == buttons[2][0]; }
    boolean _B30() { return firstClicked() == buttons[3][0]; }
    boolean _B40() { return firstClicked() == buttons[4][0]; }
    boolean _B50() { return firstClicked() == buttons[5][0]; }
    boolean _B60() { return firstClicked() == buttons[6][0]; }
    boolean _B70() { return firstClicked() == buttons[7][0]; }
    boolean _B01() { return firstClicked() == buttons[0][1]; }
    boolean _B11() { return firstClicked() == buttons[1][1]; }
    boolean _B21() { return firstClicked() == buttons[2][1]; }
    boolean _B31() { return firstClicked() == buttons[3][1]; }
    boolean _B41() { return firstClicked() == buttons[4][1]; }
    boolean _B51() { return firstClicked() == buttons[5][1]; }
    boolean _B61() { return firstClicked() == buttons[6][1]; }
    boolean _B71() { return firstClicked() == buttons[7][1]; }
    boolean _B02() { return firstClicked() == buttons[0][2]; }
    boolean _B12() { return firstClicked() == buttons[1][2]; }
    boolean _B22() { return firstClicked() == buttons[2][2]; }
    boolean _B32() { return firstClicked() == buttons[3][2]; }
    boolean _B42() { return firstClicked() == buttons[4][2]; }
    boolean _B52() { return firstClicked() == buttons[5][2]; }
    boolean _B62() { return firstClicked() == buttons[6][2]; }
    boolean _B72() { return firstClicked() == buttons[7][2]; }
    boolean _B03() { return firstClicked() == buttons[0][3]; }
    boolean _B13() { return firstClicked() == buttons[1][3]; }
    boolean _B23() { return firstClicked() == buttons[2][3]; }
    boolean _B33() { return firstClicked() == buttons[3][3]; }
    boolean _B43() { return firstClicked() == buttons[4][3]; }
    boolean _B53() { return firstClicked() == buttons[5][3]; }
    boolean _B63() { return firstClicked() == buttons[6][3]; }
    boolean _B73() { return firstClicked() == buttons[7][3]; }
    boolean _B04() { return firstClicked() == buttons[0][4]; }
    boolean _B14() { return firstClicked() == buttons[1][4]; }
    boolean _B24() { return firstClicked() == buttons[2][4]; }
    boolean _B34() { return firstClicked() == buttons[3][4]; }
    boolean _B44() { return firstClicked() == buttons[4][4]; }
    boolean _B54() { return firstClicked() == buttons[5][4]; }
    boolean _B64() { return firstClicked() == buttons[6][4]; }
    boolean _B74() { return firstClicked() == buttons[7][4]; }
    boolean _B05() { return firstClicked() == buttons[0][5]; }
    boolean _B15() { return firstClicked() == buttons[1][5]; }
    boolean _B25() { return firstClicked() == buttons[2][5]; }
    boolean _B35() { return firstClicked() == buttons[3][5]; }
    boolean _B45() { return firstClicked() == buttons[4][5]; }
    boolean _B55() { return firstClicked() == buttons[5][5]; }
    boolean _B65() { return firstClicked() == buttons[6][5]; }
    boolean _B75() { return firstClicked() == buttons[7][5]; }
    boolean _B06() { return firstClicked() == buttons[0][6]; }
    boolean _B16() { return firstClicked() == buttons[1][6]; }
    boolean _B26() { return firstClicked() == buttons[2][6]; }
    boolean _B36() { return firstClicked() == buttons[3][6]; }
    boolean _B46() { return firstClicked() == buttons[4][6]; }
    boolean _B56() { return firstClicked() == buttons[5][6]; }
    boolean _B66() { return firstClicked() == buttons[6][6]; }
    boolean _B76() { return firstClicked() == buttons[7][6]; }
    boolean _B07() { return firstClicked() == buttons[0][7]; }
    boolean _B17() { return firstClicked() == buttons[1][7]; }
    boolean _B27() { return firstClicked() == buttons[2][7]; }
    boolean _B37() { return firstClicked() == buttons[3][7]; }
    boolean _B47() { return firstClicked() == buttons[4][7]; }
    boolean _B57() { return firstClicked() == buttons[5][7]; }
    boolean _B67() { return firstClicked() == buttons[6][7]; }
    boolean _B77() { return firstClicked() == buttons[7][7]; }
}
