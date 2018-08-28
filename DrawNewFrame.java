package chessGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DrawChessBoard implements ActionListener {

    private ImageIcon blackPawn = new ImageIcon("img/black-pawn.png");
    private ImageIcon blackRook = new ImageIcon("img/black-rook.png");
    private ImageIcon blackKnight = new ImageIcon("img/black-knight.png");
    private ImageIcon blackBishop = new ImageIcon("img/black-bishop.png");
    private ImageIcon blackQueen = new ImageIcon("img/black-queen.png");
    private ImageIcon blackKing = new ImageIcon("img/black-king.png");
    private ImageIcon whitePawn = new ImageIcon("img/white-pawn.png");
    private ImageIcon whiteRook = new ImageIcon("img/white-rook.png");
    private ImageIcon whiteKnight = new ImageIcon("img/white-knight.png");
    private ImageIcon whiteBishop = new ImageIcon("img/white-bishop.png");
    private ImageIcon whiteQueen = new ImageIcon("img/white-queen.png");
    private ImageIcon whiteKing = new ImageIcon("img/white-king.png");
    //-------------------- ICONS --------------------

    private JButton[][] button = new JButton[8][8];
    private JTextField[] textField = new JTextField[4];

    void drawGridForChess() {
        JFrame drawFrame = new JFrame("Primordial Chess Game");
        JFrame drawSecondFrame = new JFrame();

        for (int x = 0; x < button.length; x++) {
            for (int y = 0; y < button.length; y++) {
                button[x][y] = new JButton();
                button[x][y].setFocusPainted(false);
                button[x][y].addActionListener(this);
                drawFrame.add(button[x][y]);
            }
        }

        startNewGame();
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

    private void setColorsForBoard() {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                button[x][y].setBackground(chessOrange());
            }
        }
        for (int x = 0; x < 8; x += 2) {
            for (int y = 0; y < 8; y += 2) {
                button[x][y].setBackground(chessYellow());
            }
        }
        for (int x = 1; x < 8; x += 2) {
            for (int y = 1; y < 8; y += 2) {
                button[x][y].setBackground(chessYellow());
            }
        }
    }

    private void startNewGame() {
        for (int x = 0; x < 8; x++) {
            button[1][x].setIcon(blackPawn);
        }
        button[0][0].setIcon(blackRook);
        button[0][1].setIcon(blackKnight);
        button[0][2].setIcon(blackBishop);
        button[0][3].setIcon(blackQueen);
        button[0][4].setIcon(blackKing);
        button[0][5].setIcon(blackBishop);
        button[0][6].setIcon(blackKnight);
        button[0][7].setIcon(blackRook);

        for (int x = 0; x < 8; x++) {
            button[6][x].setIcon(whitePawn);
        }
        button[7][0].setIcon(whiteRook);
        button[7][1].setIcon(whiteKnight);
        button[7][2].setIcon(whiteBishop);
        button[7][3].setIcon(whiteQueen);
        button[7][4].setIcon(whiteKing);
        button[7][5].setIcon(whiteBishop);
        button[7][6].setIcon(whiteKnight);
        button[7][7].setIcon(whiteRook);
    }

    private Color chessYellow() {
        return new Color(250, 205, 115);
    }

    private Color chessOrange() {
        return new Color(180, 120, 0);
    }

    @Override
    public void actionPerformed(ActionEvent eventActionListener) {
        if (!textField[0].getText().isEmpty()) {
            for (int x = 0; x < button.length; x++) {
                for (int y = 0; y < button.length; y++) {
                    if (eventActionListener.getSource() == button[x][y]) {
                        textField[2].setText(Integer.toString(x));
                        textField[3].setText(Integer.toString(y));
                    }
                }
            }
        } else {
            for (int x = 0; x < button.length; x++) {
                for (int y = 0; y < button.length; y++) {
                    if (eventActionListener.getSource() == button[x][y]) {
                        textField[0].setText(Integer.toString(x));
                        textField[1].setText(Integer.toString(y));
                    }
                }
            }
        }

        //-------------------- SET VALUES FOR TEXT FIELDS --------------------

        if (!(textField[0].getText().isEmpty() && textField[1].getText().isEmpty())) {
            if (!(textField[2].getText().isEmpty() && textField[3].getText().isEmpty())) {
                button[Integer.parseInt(textField[2].getText())][Integer.parseInt(textField[3].getText())].setIcon(button[Integer.parseInt(textField[0].getText())][Integer.parseInt(textField[1].getText())].getIcon());
                if (button[Integer.parseInt(textField[2].getText())][Integer.parseInt(textField[3].getText())].getIcon() != null) {
                    button[Integer.parseInt(textField[0].getText())][Integer.parseInt(textField[1].getText())].setIcon(null);
                    for (int i = 0; i < 4; i++) {
                        textField[i].setText(null);
                    }
                }
            }
        }
    }
}
