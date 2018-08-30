package chessGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StartNewGame implements ActionListener {

    private String[] iconNames = {"img/black-rook.png", "img/black-knight.png", "img/black-bishop.png", "img/black-queen.png", "img/black-king.png", "img/black-pawn.png", "img/white-rook.png", "img/white-knight.png", "img/white-bishop.png", "img/white-queen.png", "img/white-king.png", "img/white-pawn.png"};
    private ImageIcon[] icons = new ImageIcon[12];
    private JButton[][] buttons = new JButton[12][12];
    private JTextField[] textField = new JTextField[6];
    private boolean[] protectChess = new boolean[12];

    private int fieldZero() { return Integer.parseInt(textField[0].getText()); }
    private int fieldOne() { return Integer.parseInt(textField[1].getText()); }
    private int fieldTwo() { return Integer.parseInt(textField[2].getText()); }
    private int fieldThree() { return Integer.parseInt(textField[3].getText()); }
    private boolean iconIsNull() { return buttons[fieldTwo()][fieldThree()].getIcon() == null; }
    private Color colorFieldYellow() { return new Color(250, 205, 115); }
    private Color colorFieldOrange() { return new Color(180, 120, 0); }

    private void setColorsForBoard() {
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
    private void drawChessPieces() {
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
    private void setValuesForController(ActionEvent eventActionListener) {
        if (!textField[0].getText().isEmpty()) {
            for (int x = 0; x < buttons.length; x++) {
                for (int y = 0; y < buttons.length; y++) {
                    if (eventActionListener.getSource() == buttons[x][y]) {
                        textField[2].setText(Integer.toString(x));
                        textField[3].setText(Integer.toString(y));
                    }
                }
            }
        } else {
            for (int x = 0; x < buttons.length; x++) {
                for (int y = 0; y < buttons.length; y++) {
                    if (eventActionListener.getSource() == buttons[x][y]) {
                        textField[0].setText(Integer.toString(x));
                        textField[1].setText(Integer.toString(y));
                    }
                }
            }
        }
    }

    private void protectOrMove() {
        for (int protectPiece = 0; protectPiece < 12; protectPiece++) {
            protectChess[protectPiece] = buttons[Integer.parseInt(textField[0].getText())][Integer.parseInt(textField[1].getText())].getIcon() == icons[protectPiece];
        }

        if (!(textField[0].getText().isEmpty() && textField[1].getText().isEmpty())) {
            if (!(textField[2].getText().isEmpty() && textField[3].getText().isEmpty())) {
                if (protectChess[0] || protectChess[1] || protectChess[2] || protectChess[3] || protectChess[4] || protectChess[5]) {
                    protectBlackChess();
                } else if (protectChess[6] || protectChess[7] || protectChess[8] || protectChess[9] || protectChess[10] || protectChess[11]) {
                    protectWhiteChess();
                } else if (buttons[Integer.parseInt(textField[0].getText())][Integer.parseInt(textField[1].getText())].getIcon() == null) {
                    clearTextfields();
                }
            }
        }
    }
    private void protectBlackChess() {
        for (int protectBlackPiece = 0; protectBlackPiece < 12; protectBlackPiece++) {
            protectChess[protectBlackPiece] = buttons[Integer.parseInt(textField[2].getText())][Integer.parseInt(textField[3].getText())].getIcon() == icons[protectBlackPiece];
        }
        if (protectChess[0] || protectChess[1] || protectChess[2] || protectChess[3] || protectChess[4] || protectChess[5]){
            clearTextfields();
        } else {
            checkIfICanMove();
        }
    }
    private void protectWhiteChess() {
        for (int protectWhitePiece = 6; protectWhitePiece < 12; protectWhitePiece++) {
            protectChess[protectWhitePiece] = buttons[Integer.parseInt(textField[2].getText())][Integer.parseInt(textField[3].getText())].getIcon() == icons[protectWhitePiece];
        }
        if (protectChess[6] || protectChess[7] || protectChess[8] || protectChess[9] || protectChess[10] || protectChess[11]){
            clearTextfields();
        } else {
            checkIfICanMove();
        }
    }

    private void checkIfICanMove() {
        if (buttons[fieldZero()][fieldOne()].getIcon() == icons[5]) {
            moveBlackPawn();
        } else if (buttons[fieldZero()][fieldOne()].getIcon() == icons[11]) {
            moveWhitePawn();
        } else if (buttons[fieldZero()][fieldOne()].getIcon() == icons[1] || buttons[fieldZero()][fieldOne()].getIcon() == icons[7]) {
            moveKnight();
        } else {
            doMove();
        }
    }

    private void moveBlackPawn() {
        boolean SE = ((buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() + 1][fieldOne() + 1]) && !iconIsNull());
        boolean SW = ((buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() + 1][fieldOne() - 1]) && !iconIsNull());

        if (SE || SW) {
            doMove();
        } else if ((buttons[fieldTwo()][fieldThree()] != buttons[fieldZero() + 1][fieldOne()]) || !iconIsNull()) {
            clearTextfields();
        } else {
            doMove();
        }
    }

    private void moveWhitePawn() {
        boolean NW = ((buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() - 1][fieldOne() - 1]) && !iconIsNull());
        boolean NE = ((buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() - 1][fieldOne() + 1]) && !iconIsNull());

        if (NW || NE) {
            doMove();
        } else if ((buttons[fieldTwo()][fieldThree()] != buttons[fieldZero() - 1][fieldOne()]) || !iconIsNull()) {
            clearTextfields();
        } else {
            doMove();
        }
    }

    private void moveKnight() {
        boolean firstMove = (buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() + 2][fieldOne() + 1]);
        boolean secondMove = (buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() + 2][fieldOne() - 1]);
        boolean thirdMove = (buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() - 2][fieldOne() + 1]);
        boolean fourthMove = (buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() - 2][fieldOne() - 1]);
        boolean fifthMove = (buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() + 1][fieldOne() + 2]);
        boolean sixthMove = (buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() + 1][fieldOne() - 2]);
        boolean seventhMove = (buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() - 1][fieldOne() + 2]);
        boolean eightMove = (buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() - 1][fieldOne() - 2]);

        boolean[] booleans = {firstMove, secondMove, thirdMove, fourthMove, fifthMove, sixthMove, seventhMove, eightMove};
        boolean[] bIconIsNull = new boolean[8];
        boolean[] bIconIsNotNull = new boolean[8];

        for (int i = 0; i < booleans.length; i++) { bIconIsNull[i] = booleans[i] && iconIsNull(); }
        for (int i = 0; i < booleans.length; i++) { bIconIsNotNull[i] = booleans[i] && !iconIsNull(); }

        if (bIconIsNull[0] || bIconIsNull[1] || bIconIsNull[2] || bIconIsNull[3] || bIconIsNull[4] || bIconIsNull[5] || bIconIsNull[6] || bIconIsNull[7]) {
            doMove();
        } else if (bIconIsNotNull[0] || bIconIsNotNull[1] || bIconIsNotNull[2] || bIconIsNotNull[3] || bIconIsNotNull[4] || bIconIsNotNull[5] || bIconIsNotNull[6] || bIconIsNotNull[7]) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    private void doMove() {
        buttons[fieldTwo()][fieldThree()].setIcon(buttons[fieldZero()][fieldOne()].getIcon());
        if (buttons[fieldTwo()][fieldThree()].getIcon() != null) {
            buttons[fieldZero()][fieldOne()].setIcon(null);
            clearTextfields();
        }
    }
    private void clearTextfields() {
        for (int i = 0; i < 4; i++) {
            textField[i].setText(null);
        }
    }
    private void hideFields() {

        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 12; y++)
                if (!((x < 2) || (x > 9) || (y < 2) || (y > 9))) {
                    buttons[x][y].setVisible(true);
                }
        }
    }
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
        drawFrame.setSize(800, 800);
        drawFrame.setLocation(560, 140);
        drawFrame.setVisible(true);

    }
    public void actionPerformed(ActionEvent eventActionListener) {
        setValuesForController(eventActionListener);
        protectOrMove();
    }
}
