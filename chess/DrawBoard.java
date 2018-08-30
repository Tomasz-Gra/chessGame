package chessGame;

import javax.swing.*;

class DrawBoard extends ProtectOrMove {

    void setColorsForBoard() {
        for (int x = 2; x < 10; x++) {
            for (int y = 2; y < 10; y++) {
                buttons[x][y].setBackground(colorFieldOrange());
            }
        }
        for (int x = 2; x < 10; x += 2) {
            for (int y = 2; y < 10; y += 2) {
                buttons[x][y].setBackground(colorFieldYellow());
            }
        }
        for (int x = 3; x < 11; x += 2) {
            for (int y = 3; y < 11; y += 2) {
                buttons[x][y].setBackground(colorFieldYellow());
            }
        }
    }

    void drawChessPieces() {
        for (int i = 0; i < iconNames.length; i++) { icons[i] = new ImageIcon(iconNames[i]); }

        for (int x = 2; x < 10; x++) { buttons[3][x].setIcon(icons[5]); }
        for (int drawIcon = 0; drawIcon < 5; drawIcon++) {
            buttons[2][drawIcon + 2].setIcon(icons[drawIcon]);
            buttons[2][7].setIcon(icons[2]);
            buttons[2][8].setIcon(icons[1]);
            buttons[2][9].setIcon(icons[0]);
        }
        for (int x = 2; x < 10; x++) { buttons[8][x].setIcon(icons[11]); }
        for (int drawIcon = 6; drawIcon < 11; drawIcon++) {
            buttons[9][drawIcon - 4].setIcon(icons[drawIcon]);
            buttons[9][7].setIcon(icons[8]);
            buttons[9][8].setIcon(icons[7]);
            buttons[9][9].setIcon(icons[6]);
        }
    }

    void hideFields() {

        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 12; y++)
                if (!((x < 2) || (x > 9) || (y < 2) || (y > 9))) {
                    buttons[x][y].setVisible(true);
                }
        }
    }
}
