package gameSudoku;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class GameSudokuGUI implements ActionListener {

    private JTextField textField0, textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8, textField10, textField11, textField12, textField13, textField14, textField15, textField16, textField17, textField18, textField20, textField21, textField22, textField23, textField24, textField25, textField26, textField27, textField28, textField30, textField31, textField32, textField33, textField34, textField35, textField36, textField37, textField38, textField40, textField41, textField42, textField43, textField44, textField45, textField46, textField47, textField48, textField50, textField51, textField52, textField53, textField54, textField55, textField56, textField57, textField58, textField60, textField61, textField62, textField63, textField64, textField65, textField66, textField67, textField68, textField70, textField71, textField72, textField73, textField74, textField75, textField76, textField77, textField78, textField80, textField81, textField82, textField83, textField84, textField85, textField86, textField87, textField88, textField100, textField101, textField102, textField103, textField104, textField105, textField106, textField107, textField108, textField110, textField111, textField112, textField113, textField114, textField115, textField116, textField117, textField118, textField120, textField121, textField122, textField123, textField124, textField125, textField126, textField127, textField128, textField130, textField131, textField132, textField133, textField134, textField135, textField136, textField137, textField138, textField140, textField141, textField142, textField143, textField144, textField145, textField146, textField147, textField148, textField150, textField151, textField152, textField153, textField154, textField155, textField156, textField157, textField158, textField160, textField161, textField162, textField163, textField164, textField165, textField166, textField167, textField168, textField170, textField171, textField172, textField173, textField174, textField175, textField176, textField177, textField178, textField180, textField181, textField182, textField183, textField184, textField185, textField186, textField187, textField188;
    private JButton checkAllScore, clearScore, showResult, newGame, addSeventeenNumbers, addFortyNumbers;
    private JFrame buildSudokuFrame = new JFrame("Primordial Sudoku Game");

//------------------------------ VARIABLES ------------------------------

    void buildGameSudokuGUI() {
        drawAllFields();
        shuffleNumberAndAddThemToFrames();
        addButtonsAndLines();
        addAllUserFieldsToFrame();
        addHiddenFieldsToFrame();
        launchGUI();
    }

    public void actionPerformed(ActionEvent eventActionListener) {

        if (eventActionListener.getSource() == checkAllScore) { checkAllScore(); } else { colorAllFieldsRed(); }
        if (eventActionListener.getSource() == clearScore) { clearAll(); }
        if (eventActionListener.getSource() == showResult) { showResult(); }
        if (eventActionListener.getSource() == newGame) { buildSudokuFrame.dispose();GameSudokuGUI gameSudokuGUI = new GameSudokuGUI();gameSudokuGUI.buildGameSudokuGUI(); }
        if (eventActionListener.getSource() == addSeventeenNumbers) { addSeventeenNumbers(); }
        if (eventActionListener.getSource() == addFortyNumbers) { addFortyNumbers(); }
    }

    private void drawAllFields() {
        textField0 = new JTextField();
        textField0.setBounds(5, 5, 50, 50);
        textField1 = new JTextField();
        textField1.setBounds(60, 5, 50, 50);
        textField2 = new JTextField();
        textField2.setBounds(115, 5, 50, 50);
        textField3 = new JTextField();
        textField3.setBounds(5, 60, 50, 50);
        textField4 = new JTextField();
        textField4.setBounds(60, 60, 50, 50);
        textField5 = new JTextField();
        textField5.setBounds(115, 60, 50, 50);
        textField6 = new JTextField();
        textField6.setBounds(5, 115, 50, 50);
        textField7 = new JTextField();
        textField7.setBounds(60, 115, 50, 50);
        textField8 = new JTextField();
        textField8.setBounds(115, 115, 50, 50);

        textField10 = new JTextField();
        textField10.setBounds(175, 5, 50, 50);
        textField11 = new JTextField();
        textField11.setBounds(230, 5, 50, 50);
        textField12 = new JTextField();
        textField12.setBounds(285, 5, 50, 50);
        textField13 = new JTextField();
        textField13.setBounds(175, 60, 50, 50);
        textField14 = new JTextField();
        textField14.setBounds(230, 60, 50, 50);
        textField15 = new JTextField();
        textField15.setBounds(285, 60, 50, 50);
        textField16 = new JTextField();
        textField16.setBounds(175, 115, 50, 50);
        textField17 = new JTextField();
        textField17.setBounds(230, 115, 50, 50);
        textField18 = new JTextField();
        textField18.setBounds(285, 115, 50, 50);

        //------------------------------ FRAME TWO BOUNDS ------------------------------

        textField20 = new JTextField();
        textField20.setBounds(345, 5, 50, 50);
        textField21 = new JTextField();
        textField21.setBounds(400, 5, 50, 50);
        textField22 = new JTextField();
        textField22.setBounds(455, 5, 50, 50);
        textField23 = new JTextField();
        textField23.setBounds(345, 60, 50, 50);
        textField24 = new JTextField();
        textField24.setBounds(400, 60, 50, 50);
        textField25 = new JTextField();
        textField25.setBounds(455, 60, 50, 50);
        textField26 = new JTextField();
        textField26.setBounds(345, 115, 50, 50);
        textField27 = new JTextField();
        textField27.setBounds(400, 115, 50, 50);
        textField28 = new JTextField();
        textField28.setBounds(455, 115, 50, 50);

        //------------------------------ FRAME THREE BOUNDS ------------------------------

        textField30 = new JTextField();
        textField30.setBounds(5, 175, 50, 50);
        textField31 = new JTextField();
        textField31.setBounds(60, 175, 50, 50);
        textField32 = new JTextField();
        textField32.setBounds(115, 175, 50, 50);
        textField33 = new JTextField();
        textField33.setBounds(5, 230, 50, 50);
        textField34 = new JTextField();
        textField34.setBounds(60, 230, 50, 50);
        textField35 = new JTextField();
        textField35.setBounds(115, 230, 50, 50);
        textField36 = new JTextField();
        textField36.setBounds(5, 285, 50, 50);
        textField37 = new JTextField();
        textField37.setBounds(60, 285, 50, 50);
        textField38 = new JTextField();
        textField38.setBounds(115, 285, 50, 50);

        //------------------------------ FRAME FOUR BOUNDS ------------------------------

        textField40 = new JTextField();
        textField40.setBounds(175, 175, 50, 50);
        textField41 = new JTextField();
        textField41.setBounds(230, 175, 50, 50);
        textField42 = new JTextField();
        textField42.setBounds(285, 175, 50, 50);
        textField43 = new JTextField();
        textField43.setBounds(175, 230, 50, 50);
        textField44 = new JTextField();
        textField44.setBounds(230, 230, 50, 50);
        textField45 = new JTextField();
        textField45.setBounds(285, 230, 50, 50);
        textField46 = new JTextField();
        textField46.setBounds(175, 285, 50, 50);
        textField47 = new JTextField();
        textField47.setBounds(230, 285, 50, 50);
        textField48 = new JTextField();
        textField48.setBounds(285, 285, 50, 50);

        //------------------------------ FRAME FIVE BOUNDS ------------------------------

        textField50 = new JTextField();
        textField50.setBounds(345, 175, 50, 50);
        textField51 = new JTextField();
        textField51.setBounds(400, 175, 50, 50);
        textField52 = new JTextField();
        textField52.setBounds(455, 175, 50, 50);
        textField53 = new JTextField();
        textField53.setBounds(345, 230, 50, 50);
        textField54 = new JTextField();
        textField54.setBounds(400, 230, 50, 50);
        textField55 = new JTextField();
        textField55.setBounds(455, 230, 50, 50);
        textField56 = new JTextField();
        textField56.setBounds(345, 285, 50, 50);
        textField57 = new JTextField();
        textField57.setBounds(400, 285, 50, 50);
        textField58 = new JTextField();
        textField58.setBounds(455, 285, 50, 50);

        //------------------------------ FRAME SIX BOUNDS ------------------------------

        textField60 = new JTextField();
        textField60.setBounds(5, 345, 50, 50);
        textField61 = new JTextField();
        textField61.setBounds(60, 345, 50, 50);
        textField62 = new JTextField();
        textField62.setBounds(115, 345, 50, 50);
        textField63 = new JTextField();
        textField63.setBounds(5, 400, 50, 50);
        textField64 = new JTextField();
        textField64.setBounds(60, 400, 50, 50);
        textField65 = new JTextField();
        textField65.setBounds(115, 400, 50, 50);
        textField66 = new JTextField();
        textField66.setBounds(5, 455, 50, 50);
        textField67 = new JTextField();
        textField67.setBounds(60, 455, 50, 50);
        textField68 = new JTextField();
        textField68.setBounds(115, 455, 50, 50);

        //------------------------------ FRAME SEVEN BOUNDS ------------------------------

        textField70 = new JTextField();
        textField70.setBounds(175, 345, 50, 50);
        textField71 = new JTextField();
        textField71.setBounds(230, 345, 50, 50);
        textField72 = new JTextField();
        textField72.setBounds(285, 345, 50, 50);
        textField73 = new JTextField();
        textField73.setBounds(175, 400, 50, 50);
        textField74 = new JTextField();
        textField74.setBounds(230, 400, 50, 50);
        textField75 = new JTextField();
        textField75.setBounds(285, 400, 50, 50);
        textField76 = new JTextField();
        textField76.setBounds(175, 455, 50, 50);
        textField77 = new JTextField();
        textField77.setBounds(230, 455, 50, 50);
        textField78 = new JTextField();
        textField78.setBounds(285, 455, 50, 50);

        //------------------------------ FRAME EIGHT BOUNDS ------------------------------

        textField80 = new JTextField();
        textField80.setBounds(345, 345, 50, 50);
        textField81 = new JTextField();
        textField81.setBounds(400, 345, 50, 50);
        textField82 = new JTextField();
        textField82.setBounds(455, 345, 50, 50);
        textField83 = new JTextField();
        textField83.setBounds(345, 400, 50, 50);
        textField84 = new JTextField();
        textField84.setBounds(400, 400, 50, 50);
        textField85 = new JTextField();
        textField85.setBounds(455, 400, 50, 50);
        textField86 = new JTextField();
        textField86.setBounds(345, 455, 50, 50);
        textField87 = new JTextField();
        textField87.setBounds(400, 455, 50, 50);
        textField88 = new JTextField();
        textField88.setBounds(455, 455, 50, 50);

        //------------------------------ FRAME NINE BOUNDS ------------------------------
    }
    private void shuffleNumberAndAddThemToFrames() {
        List<Integer> shuffleNumbers = new ArrayList<>();

        for (int shuffleNumber = 1; shuffleNumber <= 9; shuffleNumber++) {
            shuffleNumbers.add(shuffleNumber);
        }

        Collections.shuffle(shuffleNumbers);


        textField100 = new JTextField(String.format("%d", shuffleNumbers.get(0)));
        textField101 = new JTextField(String.format("%d", shuffleNumbers.get(1)));
        textField102 = new JTextField(String.format("%d", shuffleNumbers.get(2)));

        textField103 = new JTextField(String.format("%d", shuffleNumbers.get(3)));
        textField104 = new JTextField(String.format("%d", shuffleNumbers.get(4)));
        textField105 = new JTextField(String.format("%d", shuffleNumbers.get(5)));

        textField106 = new JTextField(String.format("%d", shuffleNumbers.get(6)));
        textField107 = new JTextField(String.format("%d", shuffleNumbers.get(7)));
        textField108 = new JTextField(String.format("%d", shuffleNumbers.get(8)));

        //------------------------------ FRAME ONE ADD SHUFFLED NUMBERS ------------------------------

        textField110 = new JTextField(String.format("%d", shuffleNumbers.get(3)));
        textField111 = new JTextField(String.format("%d", shuffleNumbers.get(4)));
        textField112 = new JTextField(String.format("%d", shuffleNumbers.get(5)));

        textField113 = new JTextField(String.format("%d", shuffleNumbers.get(6)));
        textField114 = new JTextField(String.format("%d", shuffleNumbers.get(7)));
        textField115 = new JTextField(String.format("%d", shuffleNumbers.get(8)));

        textField116 = new JTextField(String.format("%d", shuffleNumbers.get(0)));
        textField117 = new JTextField(String.format("%d", shuffleNumbers.get(1)));
        textField118 = new JTextField(String.format("%d", shuffleNumbers.get(2)));

        //------------------------------ FRAME TWO ADD SHUFFLED NUMBERS ------------------------------

        textField120 = new JTextField(String.format("%d", shuffleNumbers.get(6)));
        textField121 = new JTextField(String.format("%d", shuffleNumbers.get(7)));
        textField122 = new JTextField(String.format("%d", shuffleNumbers.get(8)));

        textField123 = new JTextField(String.format("%d", shuffleNumbers.get(0)));
        textField124 = new JTextField(String.format("%d", shuffleNumbers.get(1)));
        textField125 = new JTextField(String.format("%d", shuffleNumbers.get(2)));

        textField126 = new JTextField(String.format("%d", shuffleNumbers.get(3)));
        textField127 = new JTextField(String.format("%d", shuffleNumbers.get(4)));
        textField128 = new JTextField(String.format("%d", shuffleNumbers.get(5)));

        //------------------------------ FRAME THREE ADD SHUFFLED NUMBERS ------------------------------

        textField130 = new JTextField(String.format("%d", shuffleNumbers.get(1)));
        textField131 = new JTextField(String.format("%d", shuffleNumbers.get(2)));
        textField132 = new JTextField(String.format("%d", shuffleNumbers.get(3)));

        textField133 = new JTextField(String.format("%d", shuffleNumbers.get(4)));
        textField134 = new JTextField(String.format("%d", shuffleNumbers.get(5)));
        textField135 = new JTextField(String.format("%d", shuffleNumbers.get(6)));

        textField136 = new JTextField(String.format("%d", shuffleNumbers.get(7)));
        textField137 = new JTextField(String.format("%d", shuffleNumbers.get(8)));
        textField138 = new JTextField(String.format("%d", shuffleNumbers.get(0)));

        //------------------------------ FRAME FOUR ADD SHUFFLED NUMBERS ------------------------------

        textField140 = new JTextField(String.format("%d", shuffleNumbers.get(4)));
        textField141 = new JTextField(String.format("%d", shuffleNumbers.get(5)));
        textField142 = new JTextField(String.format("%d", shuffleNumbers.get(6)));

        textField143 = new JTextField(String.format("%d", shuffleNumbers.get(7)));
        textField144 = new JTextField(String.format("%d", shuffleNumbers.get(8)));
        textField145 = new JTextField(String.format("%d", shuffleNumbers.get(0)));

        textField146 = new JTextField(String.format("%d", shuffleNumbers.get(1)));
        textField147 = new JTextField(String.format("%d", shuffleNumbers.get(2)));
        textField148 = new JTextField(String.format("%d", shuffleNumbers.get(3)));

        //------------------------------ FRAME FIVE ADD SHUFFLED NUMBERS ------------------------------

        textField150 = new JTextField(String.format("%d", shuffleNumbers.get(7)));
        textField151 = new JTextField(String.format("%d", shuffleNumbers.get(8)));
        textField152 = new JTextField(String.format("%d", shuffleNumbers.get(0)));

        textField153 = new JTextField(String.format("%d", shuffleNumbers.get(1)));
        textField154 = new JTextField(String.format("%d", shuffleNumbers.get(2)));
        textField155 = new JTextField(String.format("%d", shuffleNumbers.get(3)));

        textField156 = new JTextField(String.format("%d", shuffleNumbers.get(4)));
        textField157 = new JTextField(String.format("%d", shuffleNumbers.get(5)));
        textField158 = new JTextField(String.format("%d", shuffleNumbers.get(6)));

        //------------------------------ FRAME SIX ADD SHUFFLED NUMBERS ------------------------------

        textField160 = new JTextField(String.format("%d", shuffleNumbers.get(2)));
        textField161 = new JTextField(String.format("%d", shuffleNumbers.get(3)));
        textField162 = new JTextField(String.format("%d", shuffleNumbers.get(4)));

        textField163 = new JTextField(String.format("%d", shuffleNumbers.get(5)));
        textField164 = new JTextField(String.format("%d", shuffleNumbers.get(6)));
        textField165 = new JTextField(String.format("%d", shuffleNumbers.get(7)));

        textField166 = new JTextField(String.format("%d", shuffleNumbers.get(8)));
        textField167 = new JTextField(String.format("%d", shuffleNumbers.get(0)));
        textField168 = new JTextField(String.format("%d", shuffleNumbers.get(1)));

        //------------------------------ FRAME SEVEN ADD SHUFFLED NUMBERS ------------------------------

        textField170 = new JTextField(String.format("%d", shuffleNumbers.get(5)));
        textField171 = new JTextField(String.format("%d", shuffleNumbers.get(6)));
        textField172 = new JTextField(String.format("%d", shuffleNumbers.get(7)));

        textField173 = new JTextField(String.format("%d", shuffleNumbers.get(8)));
        textField174 = new JTextField(String.format("%d", shuffleNumbers.get(0)));
        textField175 = new JTextField(String.format("%d", shuffleNumbers.get(1)));

        textField176 = new JTextField(String.format("%d", shuffleNumbers.get(2)));
        textField177 = new JTextField(String.format("%d", shuffleNumbers.get(3)));
        textField178 = new JTextField(String.format("%d", shuffleNumbers.get(4)));

        //------------------------------ FRAME EIGHT ADD SHUFFLED NUMBERS ------------------------------

        textField180 = new JTextField(String.format("%d", shuffleNumbers.get(8)));
        textField181 = new JTextField(String.format("%d", shuffleNumbers.get(0)));
        textField182 = new JTextField(String.format("%d", shuffleNumbers.get(1)));

        textField183 = new JTextField(String.format("%d", shuffleNumbers.get(2)));
        textField184 = new JTextField(String.format("%d", shuffleNumbers.get(3)));
        textField185 = new JTextField(String.format("%d", shuffleNumbers.get(4)));

        textField186 = new JTextField(String.format("%d", shuffleNumbers.get(5)));
        textField187 = new JTextField(String.format("%d", shuffleNumbers.get(6)));
        textField188 = new JTextField(String.format("%d", shuffleNumbers.get(7)));

        //------------------------------ FRAME NINE ADD SHUFFLED NUMBERS ------------------------------
    }
    private void addButtonsAndLines() {
        JTextField verticalLineOne, verticalLineTwo, horizontalLineOne, horizontalLineTwo;

        checkAllScore = new JButton("Check yourself");
        checkAllScore.setBounds(5, 510, 247, 50);
        clearScore = new JButton("Clear all");
        clearScore.setBounds(258, 510, 247, 50);
        showResult = new JButton("Show result");
        showResult.setBounds(5, 565, 247, 50);
        newGame = new JButton("New game");
        newGame.setBounds(258, 565, 247, 50);
        addFortyNumbers = new JButton("Add 40 numbers (easy)");
        addFortyNumbers.setBounds(5, 620, 247, 50);
        addSeventeenNumbers = new JButton("Add 17 numbers (normal)");
        addSeventeenNumbers.setBounds(258, 620, 247, 50);

        checkAllScore.setFocusPainted(false);
        checkAllScore.addActionListener(this);
        buildSudokuFrame.add(checkAllScore);
        clearScore.setFocusPainted(false);
        clearScore.addActionListener(this);
        buildSudokuFrame.add(clearScore);
        showResult.setFocusPainted(false);
        showResult.addActionListener(this);
        buildSudokuFrame.add(showResult);
        newGame.setFocusPainted(false);
        newGame.addActionListener(this);
        buildSudokuFrame.add(newGame);
        addFortyNumbers.setFocusPainted(false);
        addFortyNumbers.addActionListener(this);
        buildSudokuFrame.add(addFortyNumbers);
        addSeventeenNumbers.setFocusPainted(false);
        addSeventeenNumbers.addActionListener(this);
        buildSudokuFrame.add(addSeventeenNumbers);

        verticalLineOne = new JTextField();
        verticalLineOne.setBounds(168, 5, 3, 500);
        verticalLineOne.setBackground(Color.black);
        verticalLineOne.setBorder(null);
        verticalLineOne.setEditable(false);
        buildSudokuFrame.add(verticalLineOne);

        verticalLineTwo = new JTextField();
        verticalLineTwo.setBounds(338, 5, 3, 500);
        verticalLineTwo.setBackground(Color.black);
        verticalLineTwo.setBorder(null);
        verticalLineTwo.setEditable(false);
        buildSudokuFrame.add(verticalLineTwo);

        horizontalLineOne = new JTextField();
        horizontalLineOne.setBounds(5, 168, 500, 3);
        horizontalLineOne.setBackground(Color.black);
        horizontalLineOne.setBorder(null);
        horizontalLineOne.setEditable(false);
        buildSudokuFrame.add(horizontalLineOne);

        horizontalLineTwo = new JTextField();
        horizontalLineTwo.setBounds(5, 338, 500, 3);
        horizontalLineTwo.setBackground(Color.black);
        horizontalLineTwo.setBorder(null);
        horizontalLineTwo.setEditable(false);
        buildSudokuFrame.add(horizontalLineTwo);
    }
    private void addAllUserFieldsToFrame() {
        textField0.setHorizontalAlignment(SwingConstants.CENTER);
        textField0.addActionListener(this);
        buildSudokuFrame.add(textField0);
        textField1.setHorizontalAlignment(SwingConstants.CENTER);
        textField1.addActionListener(this);
        buildSudokuFrame.add(textField1);
        textField2.setHorizontalAlignment(SwingConstants.CENTER);
        textField2.addActionListener(this);
        buildSudokuFrame.add(textField2);
        textField3.setHorizontalAlignment(SwingConstants.CENTER);
        textField3.addActionListener(this);
        buildSudokuFrame.add(textField3);
        textField4.setHorizontalAlignment(SwingConstants.CENTER);
        textField4.addActionListener(this);
        buildSudokuFrame.add(textField4);
        textField5.setHorizontalAlignment(SwingConstants.CENTER);
        textField5.addActionListener(this);
        buildSudokuFrame.add(textField5);
        textField6.setHorizontalAlignment(SwingConstants.CENTER);
        textField6.addActionListener(this);
        buildSudokuFrame.add(textField6);
        textField7.setHorizontalAlignment(SwingConstants.CENTER);
        textField7.addActionListener(this);
        buildSudokuFrame.add(textField7);
        textField8.setHorizontalAlignment(SwingConstants.CENTER);
        textField8.addActionListener(this);
        buildSudokuFrame.add(textField8);
        textField10.setHorizontalAlignment(SwingConstants.CENTER);
        textField10.addActionListener(this);
        buildSudokuFrame.add(textField10);
        textField11.setHorizontalAlignment(SwingConstants.CENTER);
        textField11.addActionListener(this);
        buildSudokuFrame.add(textField11);
        textField12.setHorizontalAlignment(SwingConstants.CENTER);
        textField12.addActionListener(this);
        buildSudokuFrame.add(textField12);
        textField13.setHorizontalAlignment(SwingConstants.CENTER);
        textField13.addActionListener(this);
        buildSudokuFrame.add(textField13);
        textField14.setHorizontalAlignment(SwingConstants.CENTER);
        textField14.addActionListener(this);
        buildSudokuFrame.add(textField14);
        textField15.setHorizontalAlignment(SwingConstants.CENTER);
        textField15.addActionListener(this);
        buildSudokuFrame.add(textField15);
        textField16.setHorizontalAlignment(SwingConstants.CENTER);
        textField16.addActionListener(this);
        buildSudokuFrame.add(textField16);
        textField17.setHorizontalAlignment(SwingConstants.CENTER);
        textField17.addActionListener(this);
        buildSudokuFrame.add(textField17);
        textField18.setHorizontalAlignment(SwingConstants.CENTER);
        textField18.addActionListener(this);
        buildSudokuFrame.add(textField18);
        textField20.setHorizontalAlignment(SwingConstants.CENTER);
        textField20.addActionListener(this);
        buildSudokuFrame.add(textField20);
        textField21.setHorizontalAlignment(SwingConstants.CENTER);
        textField21.addActionListener(this);
        buildSudokuFrame.add(textField21);
        textField22.setHorizontalAlignment(SwingConstants.CENTER);
        textField22.addActionListener(this);
        buildSudokuFrame.add(textField22);
        textField23.setHorizontalAlignment(SwingConstants.CENTER);
        textField23.addActionListener(this);
        buildSudokuFrame.add(textField23);
        textField24.setHorizontalAlignment(SwingConstants.CENTER);
        textField24.addActionListener(this);
        buildSudokuFrame.add(textField24);
        textField25.setHorizontalAlignment(SwingConstants.CENTER);
        textField25.addActionListener(this);
        buildSudokuFrame.add(textField25);
        textField26.setHorizontalAlignment(SwingConstants.CENTER);
        textField26.addActionListener(this);
        buildSudokuFrame.add(textField26);
        textField27.setHorizontalAlignment(SwingConstants.CENTER);
        textField27.addActionListener(this);
        buildSudokuFrame.add(textField27);
        textField28.setHorizontalAlignment(SwingConstants.CENTER);
        textField28.addActionListener(this);
        buildSudokuFrame.add(textField28);
        textField30.setHorizontalAlignment(SwingConstants.CENTER);
        textField30.addActionListener(this);
        buildSudokuFrame.add(textField30);
        textField31.setHorizontalAlignment(SwingConstants.CENTER);
        textField31.addActionListener(this);
        buildSudokuFrame.add(textField31);
        textField32.setHorizontalAlignment(SwingConstants.CENTER);
        textField32.addActionListener(this);
        buildSudokuFrame.add(textField32);
        textField33.setHorizontalAlignment(SwingConstants.CENTER);
        textField33.addActionListener(this);
        buildSudokuFrame.add(textField33);
        textField34.setHorizontalAlignment(SwingConstants.CENTER);
        textField34.addActionListener(this);
        buildSudokuFrame.add(textField34);
        textField35.setHorizontalAlignment(SwingConstants.CENTER);
        textField35.addActionListener(this);
        buildSudokuFrame.add(textField35);
        textField36.setHorizontalAlignment(SwingConstants.CENTER);
        textField36.addActionListener(this);
        buildSudokuFrame.add(textField36);
        textField37.setHorizontalAlignment(SwingConstants.CENTER);
        textField37.addActionListener(this);
        buildSudokuFrame.add(textField37);
        textField38.setHorizontalAlignment(SwingConstants.CENTER);
        textField38.addActionListener(this);
        buildSudokuFrame.add(textField38);
        textField40.setHorizontalAlignment(SwingConstants.CENTER);
        textField40.addActionListener(this);
        buildSudokuFrame.add(textField40);
        textField41.setHorizontalAlignment(SwingConstants.CENTER);
        textField41.addActionListener(this);
        buildSudokuFrame.add(textField41);
        textField42.setHorizontalAlignment(SwingConstants.CENTER);
        textField42.addActionListener(this);
        buildSudokuFrame.add(textField42);
        textField43.setHorizontalAlignment(SwingConstants.CENTER);
        textField43.addActionListener(this);
        buildSudokuFrame.add(textField43);
        textField44.setHorizontalAlignment(SwingConstants.CENTER);
        textField44.addActionListener(this);
        buildSudokuFrame.add(textField44);
        textField45.setHorizontalAlignment(SwingConstants.CENTER);
        textField45.addActionListener(this);
        buildSudokuFrame.add(textField45);
        textField46.setHorizontalAlignment(SwingConstants.CENTER);
        textField46.addActionListener(this);
        buildSudokuFrame.add(textField46);
        textField47.setHorizontalAlignment(SwingConstants.CENTER);
        textField47.addActionListener(this);
        buildSudokuFrame.add(textField47);
        textField48.setHorizontalAlignment(SwingConstants.CENTER);
        textField48.addActionListener(this);
        buildSudokuFrame.add(textField48);
        textField50.setHorizontalAlignment(SwingConstants.CENTER);
        textField50.addActionListener(this);
        buildSudokuFrame.add(textField50);
        textField51.setHorizontalAlignment(SwingConstants.CENTER);
        textField51.addActionListener(this);
        buildSudokuFrame.add(textField51);
        textField52.setHorizontalAlignment(SwingConstants.CENTER);
        textField52.addActionListener(this);
        buildSudokuFrame.add(textField52);
        textField53.setHorizontalAlignment(SwingConstants.CENTER);
        textField53.addActionListener(this);
        buildSudokuFrame.add(textField53);
        textField54.setHorizontalAlignment(SwingConstants.CENTER);
        textField54.addActionListener(this);
        buildSudokuFrame.add(textField54);
        textField55.setHorizontalAlignment(SwingConstants.CENTER);
        textField55.addActionListener(this);
        buildSudokuFrame.add(textField55);
        textField56.setHorizontalAlignment(SwingConstants.CENTER);
        textField56.addActionListener(this);
        buildSudokuFrame.add(textField56);
        textField57.setHorizontalAlignment(SwingConstants.CENTER);
        textField57.addActionListener(this);
        buildSudokuFrame.add(textField57);
        textField58.setHorizontalAlignment(SwingConstants.CENTER);
        textField58.addActionListener(this);
        buildSudokuFrame.add(textField58);
        textField60.setHorizontalAlignment(SwingConstants.CENTER);
        textField60.addActionListener(this);
        buildSudokuFrame.add(textField60);
        textField61.setHorizontalAlignment(SwingConstants.CENTER);
        textField61.addActionListener(this);
        buildSudokuFrame.add(textField61);
        textField62.setHorizontalAlignment(SwingConstants.CENTER);
        textField62.addActionListener(this);
        buildSudokuFrame.add(textField62);
        textField63.setHorizontalAlignment(SwingConstants.CENTER);
        textField63.addActionListener(this);
        buildSudokuFrame.add(textField63);
        textField64.setHorizontalAlignment(SwingConstants.CENTER);
        textField64.addActionListener(this);
        buildSudokuFrame.add(textField64);
        textField65.setHorizontalAlignment(SwingConstants.CENTER);
        textField65.addActionListener(this);
        buildSudokuFrame.add(textField65);
        textField66.setHorizontalAlignment(SwingConstants.CENTER);
        textField66.addActionListener(this);
        buildSudokuFrame.add(textField66);
        textField67.setHorizontalAlignment(SwingConstants.CENTER);
        textField67.addActionListener(this);
        buildSudokuFrame.add(textField67);
        textField68.setHorizontalAlignment(SwingConstants.CENTER);
        textField68.addActionListener(this);
        buildSudokuFrame.add(textField68);
        textField70.setHorizontalAlignment(SwingConstants.CENTER);
        textField70.addActionListener(this);
        buildSudokuFrame.add(textField70);
        textField71.setHorizontalAlignment(SwingConstants.CENTER);
        textField71.addActionListener(this);
        buildSudokuFrame.add(textField71);
        textField72.setHorizontalAlignment(SwingConstants.CENTER);
        textField72.addActionListener(this);
        buildSudokuFrame.add(textField72);
        textField73.setHorizontalAlignment(SwingConstants.CENTER);
        textField73.addActionListener(this);
        buildSudokuFrame.add(textField73);
        textField74.setHorizontalAlignment(SwingConstants.CENTER);
        textField74.addActionListener(this);
        buildSudokuFrame.add(textField74);
        textField75.setHorizontalAlignment(SwingConstants.CENTER);
        textField75.addActionListener(this);
        buildSudokuFrame.add(textField75);
        textField76.setHorizontalAlignment(SwingConstants.CENTER);
        textField76.addActionListener(this);
        buildSudokuFrame.add(textField76);
        textField77.setHorizontalAlignment(SwingConstants.CENTER);
        textField77.addActionListener(this);
        buildSudokuFrame.add(textField77);
        textField78.setHorizontalAlignment(SwingConstants.CENTER);
        textField78.addActionListener(this);
        buildSudokuFrame.add(textField78);
        textField80.setHorizontalAlignment(SwingConstants.CENTER);
        textField80.addActionListener(this);
        buildSudokuFrame.add(textField80);
        textField81.setHorizontalAlignment(SwingConstants.CENTER);
        textField81.addActionListener(this);
        buildSudokuFrame.add(textField81);
        textField82.setHorizontalAlignment(SwingConstants.CENTER);
        textField82.addActionListener(this);
        buildSudokuFrame.add(textField82);
        textField83.setHorizontalAlignment(SwingConstants.CENTER);
        textField83.addActionListener(this);
        buildSudokuFrame.add(textField83);
        textField84.setHorizontalAlignment(SwingConstants.CENTER);
        textField84.addActionListener(this);
        buildSudokuFrame.add(textField84);
        textField85.setHorizontalAlignment(SwingConstants.CENTER);
        textField85.addActionListener(this);
        buildSudokuFrame.add(textField85);
        textField86.setHorizontalAlignment(SwingConstants.CENTER);
        textField86.addActionListener(this);
        buildSudokuFrame.add(textField86);
        textField87.setHorizontalAlignment(SwingConstants.CENTER);
        textField87.addActionListener(this);
        buildSudokuFrame.add(textField87);
        textField88.setHorizontalAlignment(SwingConstants.CENTER);
        textField88.addActionListener(this);
        buildSudokuFrame.add(textField88);
    }
    private void addHiddenFieldsToFrame() {
        textField100.addActionListener(this);
        buildSudokuFrame.add(textField100);
        textField101.addActionListener(this);
        buildSudokuFrame.add(textField101);
        textField102.addActionListener(this);
        buildSudokuFrame.add(textField102);
        textField103.addActionListener(this);
        buildSudokuFrame.add(textField103);
        textField104.addActionListener(this);
        buildSudokuFrame.add(textField104);
        textField105.addActionListener(this);
        buildSudokuFrame.add(textField105);
        textField106.addActionListener(this);
        buildSudokuFrame.add(textField106);
        textField107.addActionListener(this);
        buildSudokuFrame.add(textField107);
        textField108.addActionListener(this);
        buildSudokuFrame.add(textField108);
        textField110.addActionListener(this);
        buildSudokuFrame.add(textField110);
        textField111.addActionListener(this);
        buildSudokuFrame.add(textField111);
        textField112.addActionListener(this);
        buildSudokuFrame.add(textField112);
        textField113.addActionListener(this);
        buildSudokuFrame.add(textField113);
        textField114.addActionListener(this);
        buildSudokuFrame.add(textField114);
        textField115.addActionListener(this);
        buildSudokuFrame.add(textField115);
        textField116.addActionListener(this);
        buildSudokuFrame.add(textField116);
        textField117.addActionListener(this);
        buildSudokuFrame.add(textField117);
        textField118.addActionListener(this);
        buildSudokuFrame.add(textField118);
        textField120.addActionListener(this);
        buildSudokuFrame.add(textField120);
        textField121.addActionListener(this);
        buildSudokuFrame.add(textField121);
        textField122.addActionListener(this);
        buildSudokuFrame.add(textField122);
        textField123.addActionListener(this);
        buildSudokuFrame.add(textField123);
        textField124.addActionListener(this);
        buildSudokuFrame.add(textField124);
        textField125.addActionListener(this);
        buildSudokuFrame.add(textField125);
        textField126.addActionListener(this);
        buildSudokuFrame.add(textField126);
        textField127.addActionListener(this);
        buildSudokuFrame.add(textField127);
        textField128.addActionListener(this);
        buildSudokuFrame.add(textField128);
        textField130.addActionListener(this);
        buildSudokuFrame.add(textField130);
        textField131.addActionListener(this);
        buildSudokuFrame.add(textField131);
        textField132.addActionListener(this);
        buildSudokuFrame.add(textField132);
        textField133.addActionListener(this);
        buildSudokuFrame.add(textField133);
        textField134.addActionListener(this);
        buildSudokuFrame.add(textField134);
        textField135.addActionListener(this);
        buildSudokuFrame.add(textField135);
        textField136.addActionListener(this);
        buildSudokuFrame.add(textField136);
        textField137.addActionListener(this);
        buildSudokuFrame.add(textField137);
        textField138.addActionListener(this);
        buildSudokuFrame.add(textField138);
        textField140.addActionListener(this);
        buildSudokuFrame.add(textField140);
        textField141.addActionListener(this);
        buildSudokuFrame.add(textField141);
        textField142.addActionListener(this);
        buildSudokuFrame.add(textField142);
        textField143.addActionListener(this);
        buildSudokuFrame.add(textField143);
        textField144.addActionListener(this);
        buildSudokuFrame.add(textField144);
        textField145.addActionListener(this);
        buildSudokuFrame.add(textField145);
        textField146.addActionListener(this);
        buildSudokuFrame.add(textField146);
        textField147.addActionListener(this);
        buildSudokuFrame.add(textField147);
        textField148.addActionListener(this);
        buildSudokuFrame.add(textField148);
        textField150.addActionListener(this);
        buildSudokuFrame.add(textField150);
        textField151.addActionListener(this);
        buildSudokuFrame.add(textField151);
        textField152.addActionListener(this);
        buildSudokuFrame.add(textField152);
        textField153.addActionListener(this);
        buildSudokuFrame.add(textField153);
        textField154.addActionListener(this);
        buildSudokuFrame.add(textField154);
        textField155.addActionListener(this);
        buildSudokuFrame.add(textField155);
        textField156.addActionListener(this);
        buildSudokuFrame.add(textField156);
        textField157.addActionListener(this);
        buildSudokuFrame.add(textField157);
        textField158.addActionListener(this);
        buildSudokuFrame.add(textField158);
        textField160.addActionListener(this);
        buildSudokuFrame.add(textField160);
        textField161.addActionListener(this);
        buildSudokuFrame.add(textField161);
        textField162.addActionListener(this);
        buildSudokuFrame.add(textField162);
        textField163.addActionListener(this);
        buildSudokuFrame.add(textField163);
        textField164.addActionListener(this);
        buildSudokuFrame.add(textField164);
        textField165.addActionListener(this);
        buildSudokuFrame.add(textField165);
        textField166.addActionListener(this);
        buildSudokuFrame.add(textField166);
        textField167.addActionListener(this);
        buildSudokuFrame.add(textField167);
        textField168.addActionListener(this);
        buildSudokuFrame.add(textField168);
        textField170.addActionListener(this);
        buildSudokuFrame.add(textField170);
        textField171.addActionListener(this);
        buildSudokuFrame.add(textField171);
        textField172.addActionListener(this);
        buildSudokuFrame.add(textField172);
        textField173.addActionListener(this);
        buildSudokuFrame.add(textField173);
        textField174.addActionListener(this);
        buildSudokuFrame.add(textField174);
        textField175.addActionListener(this);
        buildSudokuFrame.add(textField175);
        textField176.addActionListener(this);
        buildSudokuFrame.add(textField176);
        textField177.addActionListener(this);
        buildSudokuFrame.add(textField177);
        textField178.addActionListener(this);
        buildSudokuFrame.add(textField178);
        textField180.addActionListener(this);
        buildSudokuFrame.add(textField180);
        textField181.addActionListener(this);
        buildSudokuFrame.add(textField181);
        textField182.addActionListener(this);
        buildSudokuFrame.add(textField182);
        textField183.addActionListener(this);
        buildSudokuFrame.add(textField183);
        textField184.addActionListener(this);
        buildSudokuFrame.add(textField184);
        textField185.addActionListener(this);
        buildSudokuFrame.add(textField185);
        textField186.addActionListener(this);
        buildSudokuFrame.add(textField186);
        textField187.addActionListener(this);
        buildSudokuFrame.add(textField187);
        textField188.addActionListener(this);
        buildSudokuFrame.add(textField188);
    }
    private void clearAll() {
        textField0.setText("");
        textField0.setBackground(Color.white);
        textField1.setText("");
        textField1.setBackground(Color.white);
        textField2.setText("");
        textField2.setBackground(Color.white);
        textField3.setText("");
        textField3.setBackground(Color.white);
        textField4.setText("");
        textField4.setBackground(Color.white);
        textField5.setText("");
        textField5.setBackground(Color.white);
        textField6.setText("");
        textField6.setBackground(Color.white);
        textField7.setText("");
        textField7.setBackground(Color.white);
        textField8.setText("");
        textField8.setBackground(Color.white);
        textField10.setText("");
        textField10.setBackground(Color.white);
        textField11.setText("");
        textField11.setBackground(Color.white);
        textField12.setText("");
        textField12.setBackground(Color.white);
        textField13.setText("");
        textField13.setBackground(Color.white);
        textField14.setText("");
        textField14.setBackground(Color.white);
        textField15.setText("");
        textField15.setBackground(Color.white);
        textField16.setText("");
        textField16.setBackground(Color.white);
        textField17.setText("");
        textField17.setBackground(Color.white);
        textField18.setText("");
        textField18.setBackground(Color.white);
        textField20.setText("");
        textField20.setBackground(Color.white);
        textField21.setText("");
        textField21.setBackground(Color.white);
        textField22.setText("");
        textField22.setBackground(Color.white);
        textField23.setText("");
        textField23.setBackground(Color.white);
        textField24.setText("");
        textField24.setBackground(Color.white);
        textField25.setText("");
        textField25.setBackground(Color.white);
        textField26.setText("");
        textField26.setBackground(Color.white);
        textField27.setText("");
        textField27.setBackground(Color.white);
        textField28.setText("");
        textField28.setBackground(Color.white);
        textField30.setText("");
        textField30.setBackground(Color.white);
        textField31.setText("");
        textField31.setBackground(Color.white);
        textField32.setText("");
        textField32.setBackground(Color.white);
        textField33.setText("");
        textField33.setBackground(Color.white);
        textField34.setText("");
        textField34.setBackground(Color.white);
        textField35.setText("");
        textField35.setBackground(Color.white);
        textField36.setText("");
        textField36.setBackground(Color.white);
        textField37.setText("");
        textField37.setBackground(Color.white);
        textField38.setText("");
        textField38.setBackground(Color.white);
        textField40.setText("");
        textField40.setBackground(Color.white);
        textField41.setText("");
        textField41.setBackground(Color.white);
        textField42.setText("");
        textField42.setBackground(Color.white);
        textField43.setText("");
        textField43.setBackground(Color.white);
        textField44.setText("");
        textField44.setBackground(Color.white);
        textField45.setText("");
        textField45.setBackground(Color.white);
        textField46.setText("");
        textField46.setBackground(Color.white);
        textField47.setText("");
        textField47.setBackground(Color.white);
        textField48.setText("");
        textField48.setBackground(Color.white);
        textField50.setText("");
        textField50.setBackground(Color.white);
        textField51.setText("");
        textField51.setBackground(Color.white);
        textField52.setText("");
        textField52.setBackground(Color.white);
        textField53.setText("");
        textField53.setBackground(Color.white);
        textField54.setText("");
        textField54.setBackground(Color.white);
        textField55.setText("");
        textField55.setBackground(Color.white);
        textField56.setText("");
        textField56.setBackground(Color.white);
        textField57.setText("");
        textField57.setBackground(Color.white);
        textField58.setText("");
        textField58.setBackground(Color.white);
        textField60.setText("");
        textField60.setBackground(Color.white);
        textField61.setText("");
        textField61.setBackground(Color.white);
        textField62.setText("");
        textField62.setBackground(Color.white);
        textField63.setText("");
        textField63.setBackground(Color.white);
        textField64.setText("");
        textField64.setBackground(Color.white);
        textField65.setText("");
        textField65.setBackground(Color.white);
        textField66.setText("");
        textField66.setBackground(Color.white);
        textField67.setText("");
        textField67.setBackground(Color.white);
        textField68.setText("");
        textField68.setBackground(Color.white);
        textField70.setText("");
        textField70.setBackground(Color.white);
        textField71.setText("");
        textField71.setBackground(Color.white);
        textField72.setText("");
        textField72.setBackground(Color.white);
        textField73.setText("");
        textField73.setBackground(Color.white);
        textField74.setText("");
        textField74.setBackground(Color.white);
        textField75.setText("");
        textField75.setBackground(Color.white);
        textField76.setText("");
        textField76.setBackground(Color.white);
        textField77.setText("");
        textField77.setBackground(Color.white);
        textField78.setText("");
        textField78.setBackground(Color.white);
        textField80.setText("");
        textField80.setBackground(Color.white);
        textField81.setText("");
        textField81.setBackground(Color.white);
        textField82.setText("");
        textField82.setBackground(Color.white);
        textField83.setText("");
        textField83.setBackground(Color.white);
        textField84.setText("");
        textField84.setBackground(Color.white);
        textField85.setText("");
        textField85.setBackground(Color.white);
        textField86.setText("");
        textField86.setBackground(Color.white);
        textField87.setText("");
        textField87.setBackground(Color.white);
        textField88.setText("");
        textField88.setBackground(Color.white);
    }
    private void showResult() {
        clearAll();
        textField0.setText(textField100.getText());
        textField1.setText(textField101.getText());
        textField2.setText(textField102.getText());
        textField3.setText(textField103.getText());
        textField4.setText(textField104.getText());
        textField5.setText(textField105.getText());
        textField6.setText(textField106.getText());
        textField7.setText(textField107.getText());
        textField8.setText(textField108.getText());
        textField10.setText(textField110.getText());
        textField11.setText(textField111.getText());
        textField12.setText(textField112.getText());
        textField13.setText(textField113.getText());
        textField14.setText(textField114.getText());
        textField15.setText(textField115.getText());
        textField16.setText(textField116.getText());
        textField17.setText(textField117.getText());
        textField18.setText(textField118.getText());
        textField20.setText(textField120.getText());
        textField21.setText(textField121.getText());
        textField22.setText(textField122.getText());
        textField23.setText(textField123.getText());
        textField24.setText(textField124.getText());
        textField25.setText(textField125.getText());
        textField26.setText(textField126.getText());
        textField27.setText(textField127.getText());
        textField28.setText(textField128.getText());
        textField30.setText(textField130.getText());
        textField31.setText(textField131.getText());
        textField32.setText(textField132.getText());
        textField33.setText(textField133.getText());
        textField34.setText(textField134.getText());
        textField35.setText(textField135.getText());
        textField36.setText(textField136.getText());
        textField37.setText(textField137.getText());
        textField38.setText(textField138.getText());
        textField40.setText(textField140.getText());
        textField41.setText(textField141.getText());
        textField42.setText(textField142.getText());
        textField43.setText(textField143.getText());
        textField44.setText(textField144.getText());
        textField45.setText(textField145.getText());
        textField46.setText(textField146.getText());
        textField47.setText(textField147.getText());
        textField48.setText(textField148.getText());
        textField50.setText(textField150.getText());
        textField51.setText(textField151.getText());
        textField52.setText(textField152.getText());
        textField53.setText(textField153.getText());
        textField54.setText(textField154.getText());
        textField55.setText(textField155.getText());
        textField56.setText(textField156.getText());
        textField57.setText(textField157.getText());
        textField58.setText(textField158.getText());
        textField60.setText(textField160.getText());
        textField61.setText(textField161.getText());
        textField62.setText(textField162.getText());
        textField63.setText(textField163.getText());
        textField64.setText(textField164.getText());
        textField65.setText(textField165.getText());
        textField66.setText(textField166.getText());
        textField67.setText(textField167.getText());
        textField68.setText(textField168.getText());
        textField70.setText(textField170.getText());
        textField71.setText(textField171.getText());
        textField72.setText(textField172.getText());
        textField73.setText(textField173.getText());
        textField74.setText(textField174.getText());
        textField75.setText(textField175.getText());
        textField76.setText(textField176.getText());
        textField77.setText(textField177.getText());
        textField78.setText(textField178.getText());
        textField80.setText(textField180.getText());
        textField81.setText(textField181.getText());
        textField82.setText(textField182.getText());
        textField83.setText(textField183.getText());
        textField84.setText(textField184.getText());
        textField85.setText(textField185.getText());
        textField86.setText(textField186.getText());
        textField87.setText(textField187.getText());
        textField88.setText(textField188.getText());
    }
    private void checkAllScore() {
        if ((textField0.getText().equals(textField100.getText())) &&
                (textField1.getText().equals(textField101.getText())) &&
                (textField2.getText().equals(textField102.getText())) &&
                (textField3.getText().equals(textField103.getText())) &&
                (textField4.getText().equals(textField104.getText())) &&
                (textField5.getText().equals(textField105.getText())) &&
                (textField6.getText().equals(textField106.getText())) &&
                (textField7.getText().equals(textField107.getText())) &&
                (textField8.getText().equals(textField108.getText())) &&
                (textField10.getText().equals(textField110.getText())) &&
                (textField11.getText().equals(textField111.getText())) &&
                (textField12.getText().equals(textField112.getText())) &&
                (textField13.getText().equals(textField113.getText())) &&
                (textField14.getText().equals(textField114.getText())) &&
                (textField15.getText().equals(textField115.getText())) &&
                (textField16.getText().equals(textField116.getText())) &&
                (textField17.getText().equals(textField117.getText())) &&
                (textField18.getText().equals(textField118.getText())) &&
                (textField20.getText().equals(textField120.getText())) &&
                (textField21.getText().equals(textField121.getText())) &&
                (textField22.getText().equals(textField122.getText())) &&
                (textField23.getText().equals(textField123.getText())) &&
                (textField24.getText().equals(textField124.getText())) &&
                (textField25.getText().equals(textField125.getText())) &&
                (textField26.getText().equals(textField126.getText())) &&
                (textField27.getText().equals(textField127.getText())) &&
                (textField28.getText().equals(textField128.getText())) &&
                (textField30.getText().equals(textField130.getText())) &&
                (textField31.getText().equals(textField131.getText())) &&
                (textField32.getText().equals(textField132.getText())) &&
                (textField33.getText().equals(textField133.getText())) &&
                (textField34.getText().equals(textField134.getText())) &&
                (textField35.getText().equals(textField135.getText())) &&
                (textField36.getText().equals(textField136.getText())) &&
                (textField37.getText().equals(textField137.getText())) &&
                (textField38.getText().equals(textField138.getText())) &&
                (textField40.getText().equals(textField140.getText())) &&
                (textField41.getText().equals(textField141.getText())) &&
                (textField42.getText().equals(textField142.getText())) &&
                (textField43.getText().equals(textField143.getText())) &&
                (textField44.getText().equals(textField144.getText())) &&
                (textField45.getText().equals(textField145.getText())) &&
                (textField46.getText().equals(textField146.getText())) &&
                (textField47.getText().equals(textField147.getText())) &&
                (textField48.getText().equals(textField148.getText())) &&
                (textField50.getText().equals(textField150.getText())) &&
                (textField51.getText().equals(textField151.getText())) &&
                (textField52.getText().equals(textField152.getText())) &&
                (textField53.getText().equals(textField153.getText())) &&
                (textField54.getText().equals(textField154.getText())) &&
                (textField55.getText().equals(textField155.getText())) &&
                (textField56.getText().equals(textField156.getText())) &&
                (textField57.getText().equals(textField157.getText())) &&
                (textField58.getText().equals(textField158.getText())) &&
                (textField60.getText().equals(textField160.getText())) &&
                (textField61.getText().equals(textField161.getText())) &&
                (textField62.getText().equals(textField162.getText())) &&
                (textField63.getText().equals(textField163.getText())) &&
                (textField64.getText().equals(textField164.getText())) &&
                (textField65.getText().equals(textField165.getText())) &&
                (textField66.getText().equals(textField166.getText())) &&
                (textField67.getText().equals(textField167.getText())) &&
                (textField68.getText().equals(textField168.getText())) &&
                (textField70.getText().equals(textField170.getText())) &&
                (textField71.getText().equals(textField171.getText())) &&
                (textField72.getText().equals(textField172.getText())) &&
                (textField73.getText().equals(textField173.getText())) &&
                (textField74.getText().equals(textField174.getText())) &&
                (textField75.getText().equals(textField175.getText())) &&
                (textField76.getText().equals(textField176.getText())) &&
                (textField77.getText().equals(textField177.getText())) &&
                (textField78.getText().equals(textField178.getText())) &&
                (textField80.getText().equals(textField180.getText())) &&
                (textField81.getText().equals(textField181.getText())) &&
                (textField82.getText().equals(textField182.getText())) &&
                (textField83.getText().equals(textField183.getText())) &&
                (textField84.getText().equals(textField184.getText())) &&
                (textField85.getText().equals(textField185.getText())) &&
                (textField86.getText().equals(textField186.getText())) &&
                (textField87.getText().equals(textField187.getText())) &&
                (textField88.getText().equals(textField188.getText()))) {
            colorAllFieldsGreen();
        } else {
            colorAllFieldsRed();
        }
    }
    private void colorAllFieldsGreen() {
        textField0.setBackground(Color.green);
        textField1.setBackground(Color.green);
        textField2.setBackground(Color.green);
        textField3.setBackground(Color.green);
        textField4.setBackground(Color.green);
        textField5.setBackground(Color.green);
        textField6.setBackground(Color.green);
        textField7.setBackground(Color.green);
        textField8.setBackground(Color.green);
        textField10.setBackground(Color.green);
        textField11.setBackground(Color.green);
        textField12.setBackground(Color.green);
        textField13.setBackground(Color.green);
        textField14.setBackground(Color.green);
        textField15.setBackground(Color.green);
        textField16.setBackground(Color.green);
        textField17.setBackground(Color.green);
        textField18.setBackground(Color.green);
        textField20.setBackground(Color.green);
        textField21.setBackground(Color.green);
        textField22.setBackground(Color.green);
        textField23.setBackground(Color.green);
        textField24.setBackground(Color.green);
        textField25.setBackground(Color.green);
        textField26.setBackground(Color.green);
        textField27.setBackground(Color.green);
        textField28.setBackground(Color.green);
        textField30.setBackground(Color.green);
        textField31.setBackground(Color.green);
        textField32.setBackground(Color.green);
        textField33.setBackground(Color.green);
        textField34.setBackground(Color.green);
        textField35.setBackground(Color.green);
        textField36.setBackground(Color.green);
        textField37.setBackground(Color.green);
        textField38.setBackground(Color.green);
        textField40.setBackground(Color.green);
        textField41.setBackground(Color.green);
        textField42.setBackground(Color.green);
        textField43.setBackground(Color.green);
        textField44.setBackground(Color.green);
        textField45.setBackground(Color.green);
        textField46.setBackground(Color.green);
        textField47.setBackground(Color.green);
        textField48.setBackground(Color.green);
        textField50.setBackground(Color.green);
        textField51.setBackground(Color.green);
        textField52.setBackground(Color.green);
        textField53.setBackground(Color.green);
        textField54.setBackground(Color.green);
        textField55.setBackground(Color.green);
        textField56.setBackground(Color.green);
        textField57.setBackground(Color.green);
        textField58.setBackground(Color.green);
        textField60.setBackground(Color.green);
        textField61.setBackground(Color.green);
        textField62.setBackground(Color.green);
        textField63.setBackground(Color.green);
        textField64.setBackground(Color.green);
        textField65.setBackground(Color.green);
        textField66.setBackground(Color.green);
        textField67.setBackground(Color.green);
        textField68.setBackground(Color.green);
        textField70.setBackground(Color.green);
        textField71.setBackground(Color.green);
        textField72.setBackground(Color.green);
        textField73.setBackground(Color.green);
        textField74.setBackground(Color.green);
        textField75.setBackground(Color.green);
        textField76.setBackground(Color.green);
        textField77.setBackground(Color.green);
        textField78.setBackground(Color.green);
        textField80.setBackground(Color.green);
        textField81.setBackground(Color.green);
        textField82.setBackground(Color.green);
        textField83.setBackground(Color.green);
        textField84.setBackground(Color.green);
        textField85.setBackground(Color.green);
        textField86.setBackground(Color.green);
        textField87.setBackground(Color.green);
        textField88.setBackground(Color.green);
    }
    private void colorAllFieldsRed() {
        textField0.setBackground(Color.red);
        textField1.setBackground(Color.red);
        textField2.setBackground(Color.red);
        textField3.setBackground(Color.red);
        textField4.setBackground(Color.red);
        textField5.setBackground(Color.red);
        textField6.setBackground(Color.red);
        textField7.setBackground(Color.red);
        textField8.setBackground(Color.red);
        textField10.setBackground(Color.red);
        textField11.setBackground(Color.red);
        textField12.setBackground(Color.red);
        textField13.setBackground(Color.red);
        textField14.setBackground(Color.red);
        textField15.setBackground(Color.red);
        textField16.setBackground(Color.red);
        textField17.setBackground(Color.red);
        textField18.setBackground(Color.red);
        textField20.setBackground(Color.red);
        textField21.setBackground(Color.red);
        textField22.setBackground(Color.red);
        textField23.setBackground(Color.red);
        textField24.setBackground(Color.red);
        textField25.setBackground(Color.red);
        textField26.setBackground(Color.red);
        textField27.setBackground(Color.red);
        textField28.setBackground(Color.red);
        textField30.setBackground(Color.red);
        textField31.setBackground(Color.red);
        textField32.setBackground(Color.red);
        textField33.setBackground(Color.red);
        textField34.setBackground(Color.red);
        textField35.setBackground(Color.red);
        textField36.setBackground(Color.red);
        textField37.setBackground(Color.red);
        textField38.setBackground(Color.red);
        textField40.setBackground(Color.red);
        textField41.setBackground(Color.red);
        textField42.setBackground(Color.red);
        textField43.setBackground(Color.red);
        textField44.setBackground(Color.red);
        textField45.setBackground(Color.red);
        textField46.setBackground(Color.red);
        textField47.setBackground(Color.red);
        textField48.setBackground(Color.red);
        textField50.setBackground(Color.red);
        textField51.setBackground(Color.red);
        textField52.setBackground(Color.red);
        textField53.setBackground(Color.red);
        textField54.setBackground(Color.red);
        textField55.setBackground(Color.red);
        textField56.setBackground(Color.red);
        textField57.setBackground(Color.red);
        textField58.setBackground(Color.red);
        textField60.setBackground(Color.red);
        textField61.setBackground(Color.red);
        textField62.setBackground(Color.red);
        textField63.setBackground(Color.red);
        textField64.setBackground(Color.red);
        textField65.setBackground(Color.red);
        textField66.setBackground(Color.red);
        textField67.setBackground(Color.red);
        textField68.setBackground(Color.red);
        textField70.setBackground(Color.red);
        textField71.setBackground(Color.red);
        textField72.setBackground(Color.red);
        textField73.setBackground(Color.red);
        textField74.setBackground(Color.red);
        textField75.setBackground(Color.red);
        textField76.setBackground(Color.red);
        textField77.setBackground(Color.red);
        textField78.setBackground(Color.red);
        textField80.setBackground(Color.red);
        textField81.setBackground(Color.red);
        textField82.setBackground(Color.red);
        textField83.setBackground(Color.red);
        textField84.setBackground(Color.red);
        textField85.setBackground(Color.red);
        textField86.setBackground(Color.red);
        textField87.setBackground(Color.red);
        textField88.setBackground(Color.red);
    }
    private void addSeventeenNumbers() {
        clearAll();
        textField0.setText(textField100.getText());
        textField8.setText(textField108.getText());
        textField10.setText(textField110.getText());
        textField14.setText(textField114.getText());
        textField22.setText(textField122.getText());
        textField26.setText(textField126.getText());
        textField34.setText(textField134.getText());
        textField36.setText(textField136.getText());
        textField44.setText(textField144.getText());
        textField52.setText(textField152.getText());
        textField54.setText(textField154.getText());
        textField62.setText(textField162.getText());
        textField66.setText(textField166.getText());
        textField74.setText(textField174.getText());
        textField78.setText(textField178.getText());
        textField80.setText(textField180.getText());
        textField88.setText(textField188.getText());

        textField0.setBackground(Color.yellow);
        textField8.setBackground(Color.yellow);
        textField10.setBackground(Color.yellow);
        textField14.setBackground(Color.yellow);
        textField22.setBackground(Color.yellow);
        textField26.setBackground(Color.yellow);
        textField34.setBackground(Color.yellow);
        textField36.setBackground(Color.yellow);
        textField44.setBackground(Color.yellow);
        textField52.setBackground(Color.yellow);
        textField54.setBackground(Color.yellow);
        textField62.setBackground(Color.yellow);
        textField66.setBackground(Color.yellow);
        textField74.setBackground(Color.yellow);
        textField78.setBackground(Color.yellow);
        textField80.setBackground(Color.yellow);
        textField88.setBackground(Color.yellow);
    }
    private void addFortyNumbers() {
        clearAll();
        textField1.setText(textField101.getText());
        textField3.setText(textField103.getText());
        textField5.setText(textField105.getText());
        textField7.setText(textField107.getText());
        textField10.setText(textField110.getText());
        textField12.setText(textField112.getText());
        textField14.setText(textField114.getText());
        textField16.setText(textField116.getText());
        textField18.setText(textField118.getText());
        textField21.setText(textField121.getText());
        textField23.setText(textField123.getText());
        textField25.setText(textField125.getText());
        textField27.setText(textField127.getText());
        textField30.setText(textField130.getText());
        textField32.setText(textField132.getText());
        textField34.setText(textField134.getText());
        textField36.setText(textField136.getText());
        textField38.setText(textField138.getText());
        textField41.setText(textField141.getText());
        textField43.setText(textField143.getText());
        textField45.setText(textField145.getText());
        textField47.setText(textField147.getText());
        textField50.setText(textField150.getText());
        textField52.setText(textField152.getText());
        textField54.setText(textField154.getText());
        textField56.setText(textField156.getText());
        textField58.setText(textField158.getText());
        textField61.setText(textField161.getText());
        textField63.setText(textField163.getText());
        textField65.setText(textField165.getText());
        textField67.setText(textField167.getText());
        textField70.setText(textField170.getText());
        textField72.setText(textField172.getText());
        textField74.setText(textField174.getText());
        textField76.setText(textField176.getText());
        textField78.setText(textField178.getText());
        textField81.setText(textField181.getText());
        textField83.setText(textField183.getText());
        textField85.setText(textField185.getText());
        textField87.setText(textField187.getText());

        textField1.setBackground(Color.yellow);
        textField3.setBackground(Color.yellow);
        textField5.setBackground(Color.yellow);
        textField7.setBackground(Color.yellow);
        textField10.setBackground(Color.yellow);
        textField12.setBackground(Color.yellow);
        textField14.setBackground(Color.yellow);
        textField16.setBackground(Color.yellow);
        textField18.setBackground(Color.yellow);
        textField21.setBackground(Color.yellow);
        textField23.setBackground(Color.yellow);
        textField25.setBackground(Color.yellow);
        textField27.setBackground(Color.yellow);
        textField30.setBackground(Color.yellow);
        textField32.setBackground(Color.yellow);
        textField34.setBackground(Color.yellow);
        textField36.setBackground(Color.yellow);
        textField38.setBackground(Color.yellow);
        textField41.setBackground(Color.yellow);
        textField43.setBackground(Color.yellow);
        textField45.setBackground(Color.yellow);
        textField47.setBackground(Color.yellow);
        textField50.setBackground(Color.yellow);
        textField52.setBackground(Color.yellow);
        textField54.setBackground(Color.yellow);
        textField56.setBackground(Color.yellow);
        textField58.setBackground(Color.yellow);
        textField61.setBackground(Color.yellow);
        textField63.setBackground(Color.yellow);
        textField65.setBackground(Color.yellow);
        textField67.setBackground(Color.yellow);
        textField70.setBackground(Color.yellow);
        textField72.setBackground(Color.yellow);
        textField74.setBackground(Color.yellow);
        textField76.setBackground(Color.yellow);
        textField78.setBackground(Color.yellow);
        textField81.setBackground(Color.yellow);
        textField83.setBackground(Color.yellow);
        textField85.setBackground(Color.yellow);
        textField87.setBackground(Color.yellow);
    }
    private void launchGUI() {
        buildSudokuFrame.setSize(515, 705);
        buildSudokuFrame.setLayout(null);
        buildSudokuFrame.setVisible(true);
        buildSudokuFrame.setResizable(false);
        buildSudokuFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
