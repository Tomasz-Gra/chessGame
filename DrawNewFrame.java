package chessGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StartNewGame implements ActionListener {

    private ImageIcon bPawn = new ImageIcon("img/black-pawn.png");
    private ImageIcon bRook = new ImageIcon("img/black-rook.png");
    private ImageIcon bKnight = new ImageIcon("img/black-knight.png");
    private ImageIcon bBishop = new ImageIcon("img/black-bishop.png");
    private ImageIcon bQueen = new ImageIcon("img/black-queen.png");
    private ImageIcon bKing = new ImageIcon("img/black-king.png");
    private ImageIcon wPawn = new ImageIcon("img/white-pawn.png");
    private ImageIcon wRook = new ImageIcon("img/white-rook.png");
    private ImageIcon wKnight = new ImageIcon("img/white-knight.png");
    private ImageIcon wBishop = new ImageIcon("img/white-bishop.png");
    private ImageIcon wQueen = new ImageIcon("img/white-queen.png");
    private ImageIcon wKing = new ImageIcon("img/white-king.png");
    //-------------------- ICONS --------------------

    private ImageIcon[] icons = {bRook, bKnight, bBishop, bQueen, bKing, bPawn, wRook, wKnight, wBishop, wQueen, wKing, wPawn};
    private JButton[][] buttons = new JButton[12][12];
    private JTextField[] textField = new JTextField[6];
    private boolean[] protectChess = new boolean[12];

    private int fieldZero() { return Integer.parseInt(textField[0].getText()); }
    private int fieldOne() { return Integer.parseInt(textField[1].getText()); }
    private int fieldTwo() { return Integer.parseInt(textField[2].getText()); }
    private int fieldThree() { return Integer.parseInt(textField[3].getText()); }
    private boolean iconIsNull() { return buttons[fieldTwo()][fieldThree()].getIcon() == null; }
    private Color colorFieldYellow() {
        return new Color(250, 205, 115);
    }
    private Color colorFieldOrange() {
        return new Color(180, 120, 0);
    }

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
        for (int x = 2; x < 10; x++) { buttons[3][x].setIcon(icons[5]); }
        for (int drawIcon = 0; drawIcon < 6; drawIcon++) {
            buttons[2][2].setIcon(icons[0]);
            buttons[2][3].setIcon(icons[1]);
            buttons[2][4].setIcon(icons[2]);
            buttons[2][5].setIcon(icons[3]);
            buttons[2][6].setIcon(icons[4]);
            buttons[2][7].setIcon(icons[2]);
            buttons[2][8].setIcon(icons[1]);
            buttons[2][9].setIcon(icons[0]);
        }
        for (int x = 2; x < 10; x++) { buttons[8][x].setIcon(icons[11]); }
        for (int drawIcon = 6; drawIcon < 11; drawIcon++) {
            buttons[9][2].setIcon(icons[6]);
            buttons[9][3].setIcon(icons[7]);
            buttons[9][4].setIcon(icons[8]);
            buttons[9][5].setIcon(icons[9]);
            buttons[9][6].setIcon(icons[10]);
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

    private void moveKnight() { ;
        boolean firstMove = (buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() + 2][fieldOne() + 1]);
        boolean secondMove = (buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() + 2][fieldOne() - 1]);
        boolean thirdMove = (buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() - 2][fieldOne() + 1]);
        boolean fourthMove = (buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() - 2][fieldOne() - 1]);
        boolean fifthMove = (buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() + 1][fieldOne() + 2]);
        boolean sixthMove = (buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() + 1][fieldOne() - 2]);
        boolean seventhMove = (buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() - 1][fieldOne() + 2]);
        boolean eightMove = (buttons[fieldTwo()][fieldThree()] == buttons[fieldZero() - 1][fieldOne() - 2]);

        boolean SE = (firstMove && iconIsNull());
        boolean SW = (secondMove && iconIsNull());
        boolean NE = (thirdMove && iconIsNull());
        boolean NW = (fourthMove && iconIsNull());
        boolean SEE = (fifthMove && iconIsNull());
        boolean SWW = (sixthMove && iconIsNull());
        boolean NEE = (seventhMove && iconIsNull());
        boolean NWW = (eightMove && iconIsNull());

        boolean SE_2 = (firstMove && !iconIsNull());
        boolean SW_2 = (secondMove && !iconIsNull());
        boolean NE_2 = (thirdMove && !iconIsNull());
        boolean NW_2 = (fourthMove && !iconIsNull());
        boolean SEE_2 = (fifthMove && !iconIsNull());
        boolean SWW_2 = (sixthMove && !iconIsNull());
        boolean NEE_2 = (seventhMove && !iconIsNull());
        boolean NWW_2 = (eightMove && !iconIsNull());


        if (SE || SW || NE || NW || SEE || SWW || NEE || NWW) {
            doMove();
        } else if (SE_2 || SW_2 || NE_2 || NW_2 || SEE_2 || SWW_2 || NEE_2 || NWW_2) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    private void doMove() {
        int fieldZero = Integer.parseInt(textField[0].getText());
        int fieldOne = Integer.parseInt(textField[1].getText());
        int fieldTwo = Integer.parseInt(textField[2].getText());
        int fieldThree = Integer.parseInt(textField[3].getText());

        buttons[fieldTwo][fieldThree].setIcon(buttons[fieldZero][fieldOne].getIcon());
        if (buttons[fieldTwo][fieldThree].getIcon() != null) {
            buttons[fieldZero][fieldOne].setIcon(null);
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
            for (int y = 0; y < 2; y++)
                buttons[x][y].setVisible(false);
        }

        for (int x = 0; x < 12; x++) {
            for (int y = 10; y < 12; y++)
                buttons[x][y].setVisible(false);
        }

        for (int x = 0; x < 2; x++) {
            for (int y = 2; y < 10; y++)
                buttons[x][y].setVisible(false);
        }

        for (int x = 10; x < 12; x++) {
            for (int y = 2; y < 10; y++)
                buttons[x][y].setVisible(false);
        }
    }
    void startNewGame() {
        JFrame drawFrame = new JFrame("Primordial Chess Game");
        JFrame drawSecondFrame = new JFrame();

        for (int x = 0; x < buttons.length; x++) {
            for (int y = 0; y < buttons.length; y++) {
                buttons[x][y] = new JButton();
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
            drawSecondFrame.add(textField[textFieldIndex]);
        }

        drawFrame.setLayout(new GridLayout(12, 12));
        drawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawFrame.setSize(800, 800);
        drawFrame.setLocation(560, 140);
        drawFrame.setVisible(true);

        drawSecondFrame.setLayout(new GridLayout(8, 8));
        drawSecondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawSecondFrame.setSize(400, 400);
        drawSecondFrame.setLocation(1420, 140);
        drawSecondFrame.setVisible(true);

    }
    public void actionPerformed(ActionEvent eventActionListener) {
        setValuesForController(eventActionListener);
        protectOrMove();
    }
}
