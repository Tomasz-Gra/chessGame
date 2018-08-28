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
    private JButton[][] buttons = new JButton[8][8];
    private JTextField[] textField = new JTextField[6];
    private boolean[] protectChess = new boolean[12];



    private Color colorFieldYellow() {
        return new Color(250, 205, 115);
    }
    private Color colorFieldOrange() {
        return new Color(180, 120, 0);
    }
    private void setColorsForBoard() {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                buttons[x][y].setBackground(colorFieldOrange());
            }
        }
        for (int x = 0; x < 8; x += 2) {
            for (int y = 0; y < 8; y += 2) {
                buttons[x][y].setBackground(colorFieldYellow());
            }
        }
        for (int x = 1; x < 8; x += 2) {
            for (int y = 1; y < 8; y += 2) {
                buttons[x][y].setBackground(colorFieldYellow());
            }
        }
    }
    private void drawChessPieces() {
        for (int x = 0; x < 8; x++) { buttons[1][x].setIcon(icons[5]); }
        for (int drawIcon = 0; drawIcon < 6; drawIcon++) {
            buttons[0][drawIcon].setIcon(icons[drawIcon]);
            buttons[0][5].setIcon(icons[2]);
            buttons[0][6].setIcon(icons[1]);
            buttons[0][7].setIcon(icons[0]);
        }
        for (int x = 0; x < 8; x++) { buttons[6][x].setIcon(icons[11]); }
        for (int drawIcon = 6; drawIcon < 11; drawIcon++) {
            buttons[7][drawIcon - 6].setIcon(icons[drawIcon]);
            buttons[7][5].setIcon(icons[8]);
            buttons[7][6].setIcon(icons[7]);
            buttons[7][7].setIcon(icons[6]);
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
        int fieldZero = Integer.parseInt(textField[0].getText());
        int fieldOne = Integer.parseInt(textField[1].getText());
        int fieldTwo = Integer.parseInt(textField[2].getText());
        int fieldThree = Integer.parseInt(textField[3].getText());

        boolean con1 = ((buttons[fieldTwo][fieldThree] == buttons[fieldZero + 1][fieldOne + 1]) && (buttons[fieldTwo][fieldThree].getIcon() != null));
        boolean con2 = ((buttons[fieldTwo][fieldThree] == buttons[fieldZero + 1][fieldOne - 1]) && (buttons[fieldTwo][fieldThree].getIcon() != null));

        if (buttons[fieldZero][fieldOne].getIcon() == icons[5]) {
            if (con1 || con2) {
                doMove();
            } else if ((buttons[fieldTwo][fieldThree] != buttons[fieldZero + 1][fieldOne])
                    || (buttons[fieldTwo][fieldThree].getIcon() != null)) {
                clearTextfields();
            } else {
                doMove();
            }
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

        drawChessPieces();
        setColorsForBoard();

        for (int textFieldIndex = 0; textFieldIndex < textField.length; textFieldIndex++) {
            textField[textFieldIndex] = new JTextField();
            textField[textFieldIndex].addActionListener(this);
            drawSecondFrame.add(textField[textFieldIndex]);
        }

        drawFrame.setLayout(new GridLayout(8, 8));
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
