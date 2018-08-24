package chessGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DrawNewFrame implements ActionListener {
    private JFrame drawFrame = new JFrame("GridLayout");
    private JFrame drawSecondFrame = new JFrame("GridLayout");
    private JFrame drawTemporaryFrame = new JFrame();
    private JButton[] button = new JButton[64];
    private JButton[] buttonTwo = new JButton[64];

    private JTextField[] temporaryTextfield = new JTextField[2];
    private JButton move = new JButton("Move!");
    private JButton start = new JButton("Start new game!");

    private ActionListener actionListener = actionEvent -> temporaryTextfield[0].setText(actionEvent.getActionCommand());
    private ActionListener actionListenerNumberTwo = actionEvent -> temporaryTextfield[1].setText(actionEvent.getActionCommand());

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

    void drawFrameGUI() {
        Font textFont = new Font("Times New Roman", Font.PLAIN, 1);
        for (int newButton = 0; newButton < button.length; newButton++) {
            button[newButton] = new JButton(Integer.toString(newButton));
            button[newButton].setFocusPainted(false);
            button[newButton].addActionListener(actionListener);
            button[newButton].setFont(textFont);
            drawFrame.add(button[newButton]);
        }

        for (int newButton = 0; newButton < buttonTwo.length; newButton++) {
            buttonTwo[newButton] = new JButton(Integer.toString(newButton));
            buttonTwo[newButton].setFocusPainted(false);
            buttonTwo[newButton].addActionListener(actionListenerNumberTwo);
            buttonTwo[newButton].setFont(textFont);
            drawSecondFrame.add(buttonTwo[newButton]);
        }

        for (int yellowBackgroundIndex = 0; yellowBackgroundIndex < 8; yellowBackgroundIndex += 2) {
            button[yellowBackgroundIndex].setBackground(chessYellow());
            for (int orangeBackgroundIndex = 1; orangeBackgroundIndex < 8; orangeBackgroundIndex += 2) {
                button[orangeBackgroundIndex].setBackground(chessOrange());
            }
        }

        drawFrame.setLayout(new GridLayout(8, 8));
        drawFrame.setLocation(400, 160);
        drawFrame.setVisible(true);
        drawFrame.setSize(700, 700);
        drawFrame.setResizable(false);
        drawFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        drawSecondFrame.setLayout(new GridLayout(8, 8));
        drawSecondFrame.setLocation(1115, 360);
        drawSecondFrame.setVisible(true);
        drawSecondFrame.setSize(500, 500);
        drawSecondFrame.setResizable(false);
        drawSecondFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        drawTemporarySecondGUI();
    }

    private void drawTemporarySecondGUI() {
        Font buttonFont = new Font("Times New Roman", Font.BOLD, 40);

        for (int newTextfield = 0; newTextfield < temporaryTextfield.length; newTextfield++) {
            temporaryTextfield[newTextfield] = new JTextField();
        }

        start.setFont(buttonFont);
        start.addActionListener(this);
        start.setFocusPainted(false);
        drawTemporaryFrame.add(start);

        move.setFont(buttonFont);
        move.addActionListener(this);
        move.setFocusPainted(false);
        drawTemporaryFrame.add(move);

        drawTemporaryFrame.add(temporaryTextfield[0]);
        drawTemporaryFrame.add(temporaryTextfield[1]);


        drawTemporaryFrame.setLayout(new GridLayout(4, 1));
        drawTemporaryFrame.setLocation(1115, 160);
        drawTemporaryFrame.setVisible(true);
        drawTemporaryFrame.setSize(500, 185);
        drawTemporaryFrame.setResizable(false);
        drawTemporaryFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void drawChessPieces() {
        for (int drawChess = 0; drawChess < 64; drawChess++) {
            switch (drawChess) {
                case 0:
                case 7:
                    button[drawChess].setIcon(blackRook);
                    continue;
                case 1:
                case 6:
                    button[drawChess].setIcon(blackKnight);
                    continue;
                case 2:
                case 5:
                    button[drawChess].setIcon(blackBishop);
                    continue;
                case 3:
                    button[drawChess].setIcon(blackKing);
                    continue;
                case 4:
                    button[drawChess].setIcon(blackQueen);
                    continue;
                case 56:
                case 63:
                    button[drawChess].setIcon(whiteRook);
                    continue;
                case 57:
                case 62:
                    button[drawChess].setIcon(whiteKnight);
                    continue;
                case 58:
                case 61:
                    button[drawChess].setIcon(whiteBishop);
                    continue;
                case 59:
                    button[drawChess].setIcon(whiteKing);
                    continue;
                case 60:
                    button[drawChess].setIcon(whiteQueen);
            }
            if (drawChess == 8) {
                for (int blackPawns = drawChess; blackPawns < 16; blackPawns++) {
                    button[blackPawns].setIcon(blackPawn);
                }
            } else if (drawChess == 48) {
                for (int whitePawns = drawChess; whitePawns < 56; whitePawns++) {
                    button[whitePawns].setIcon(whitePawn);
                }
            } else if (drawChess > 15 && drawChess < 48) {
                button[drawChess].setIcon(null);
            }
        }
    }
    private Color chessYellow() {
        return new Color(250, 205, 115);
    }
    private Color chessOrange() {
        return new Color(180, 120, 0);
    }

    @Override
    public void actionPerformed(ActionEvent eventActionListener) {

        if (eventActionListener.getSource() == start) {
            drawChessPieces();
            for (int i = 0; i < 64; i++) {
                buttonTwo[i].setIcon(button[i].getIcon());
            }
        }

        if (eventActionListener.getSource() == move && temporaryTextfield[0] != null) {
            button[Integer.parseInt(temporaryTextfield[1].getText())].setIcon(button[Integer.parseInt(temporaryTextfield[0].getText())].getIcon());
            button[Integer.parseInt(temporaryTextfield[0].getText())].setIcon(null);

            for (int i = 0; i < 64; i++) {
                buttonTwo[i].setIcon(button[i].getIcon());
            }
            temporaryTextfield[0].setText(null);
            temporaryTextfield[1].setText(null);
        }
    }
}
